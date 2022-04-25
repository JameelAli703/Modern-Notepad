package notepad;

public interface Stack {
    Object peek();
    void push(Object obj);
    Object pop();
    int size();
}