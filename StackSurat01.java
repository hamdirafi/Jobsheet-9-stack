public class StackSurat01 {
    Surat01[] stack;
    int top;
    int size;

    public StackSurat01(int size) {
        this.size = size;
        stack = new Surat01[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat01 surat) {
        if (!isFull()) {
            stack[++top] = surat;
            System.out.println("Surat berhasil ditambahkan.");
        } else {
            System.out.println("Stack penuh. Tidak dapat menambah surat baru.");
        }
    }

    public Surat01 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack kosong. Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat01 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong.");
            return null;
        }
    }

    public Surat01 cariSurat(String nama) {
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                return stack[i];
            }
        }
        return null;
    }
}
