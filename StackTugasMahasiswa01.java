public class StackTugasMahasiswa01 {
    Mahasiswa01[] stack; 
    int size;            
    int top;             

    public StackTugasMahasiswa01(int size) {
        this.size = size;
        stack = new Mahasiswa01[size];
        top = -1; 
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Mahasiswa01 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
            System.out.println("Tugas berhasil ditambahkan.");
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas.");
        }
    }

    public Mahasiswa01 pop() {
        if (!isEmpty()) {
            Mahasiswa01 mhs = stack[top];
            top--;
            return mhs;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa01 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public void print() {
        if (!isEmpty()) {
            System.out.println("Daftar tugas mahasiswa dalam stack:");
            for (int i = top; i >= 0; i--) {
                System.out.println("------------------------");
                stack[i].tampil();
            }
        } else {
            System.out.println("Stack kosong!");
        }
    }
}
