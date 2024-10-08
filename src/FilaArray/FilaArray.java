package FilaArray;

public class FilaArray <E>{
    protected E s[]; //arranjo que vai ser usado na Fila
    protected int N; //capacidade do arranjo da Fila
    protected int f;
    protected int r;



    public FilaArray(){
        s = (E[]) new Object[N];
        N = s.length-1;
        f = (int) s[0];
        if (N>1){
            r = f + 1;
        } else{
            r=f;
        }
    }
    public int size(){
        return (N-f+r);
    }
    public boolean isEmpty(E[] s){
        return (f==r);
    }
    public E front() throws EmptyQueueException {
        if (isEmpty(s)); throw new EmptyQueueException("está vazio");
        return s[f];
    }
    public int dequeue() throws EmptyQueueException {
        if (isEmpty(s)); throw new EmptyQueueException("Está vazio");
        int temp = s[f];
        s[f]=null;
        f=(f+1)%N;
        return (int) temp;
    }
    public void enqueue(E) throws FullQueueExpection{
        if (size() == N-1) throw new FullQueueExpection("Está cheio");
        s[r]=E;
        r=(r+1)%N;
    }
}
