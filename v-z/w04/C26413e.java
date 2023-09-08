package w04;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* renamed from: w04.e */
public class C26413e<E> extends AbstractList<E> implements RandomAccess {

    /* renamed from: d */
    public int f73679d;

    /* renamed from: e */
    public Object f73680e;

    /* renamed from: w04.e$c */
    public class C26415c extends C26416d<E> {

        /* renamed from: e */
        public final int f73681e;

        public C26415c() {
            super((C26414a) null);
            this.f73681e = C26413e.this.modCount;
        }

        /* renamed from: a */
        public void mo53407a() {
            if (C26413e.this.modCount != this.f73681e) {
                throw new ConcurrentModificationException("ModCount: " + C26413e.this.modCount + "; expected: " + this.f73681e);
            }
        }

        public void remove() {
            mo53407a();
            C26413e.this.clear();
        }
    }

    /* renamed from: w04.e$d */
    public static abstract class C26416d<T> implements Iterator<T> {

        /* renamed from: d */
        public boolean f73683d;

        public C26416d(C26414a aVar) {
        }

        /* renamed from: a */
        public abstract void mo53407a();

        public final boolean hasNext() {
            return !this.f73683d;
        }

        public final T next() {
            if (!this.f73683d) {
                this.f73683d = true;
                mo53407a();
                return C26413e.this.f73680e;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: w04.e$b */
    public static class C26417b<T> implements Iterator<T> {

        /* renamed from: d */
        public static final C26417b f73684d = new C26417b();

        public boolean hasNext() {
            return false;
        }

        public T next() {
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new IllegalStateException();
        }
    }

    /* renamed from: f */
    public static /* synthetic */ void m34010f(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? 2 : 3)];
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i == 2 || i == 3) {
            objArr[1] = "iterator";
        } else if (i == 5 || i == 6 || i == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public boolean add(E e) {
        int i = this.f73679d;
        if (i == 0) {
            this.f73680e = e;
        } else if (i == 1) {
            this.f73680e = new Object[]{this.f73680e, e};
        } else {
            Object[] objArr = (Object[]) this.f73680e;
            int length = objArr.length;
            if (i >= length) {
                int i2 = ((length * 3) / 2) + 1;
                int i3 = i + 1;
                if (i2 < i3) {
                    i2 = i3;
                }
                Object[] objArr2 = new Object[i2];
                this.f73680e = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f73679d] = e;
        }
        this.f73679d++;
        this.modCount++;
        return true;
    }

    public void clear() {
        this.f73680e = null;
        this.f73679d = 0;
        this.modCount++;
    }

    public E get(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.f73679d)) {
            return i2 == 1 ? this.f73680e : ((Object[]) this.f73680e)[i];
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.f73679d);
    }

    public Iterator<E> iterator() {
        int i = this.f73679d;
        if (i == 0) {
            return C26417b.f73684d;
        }
        if (i == 1) {
            return new C26415c();
        }
        Iterator<E> it = super.iterator();
        if (it != null) {
            return it;
        }
        m34010f(3);
        throw null;
    }

    public E remove(int i) {
        int i2;
        E e;
        if (i < 0 || i >= (i2 = this.f73679d)) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.f73679d);
        }
        if (i2 == 1) {
            e = this.f73680e;
            this.f73680e = null;
        } else {
            E[] eArr = (Object[]) this.f73680e;
            E e2 = eArr[i];
            if (i2 == 2) {
                this.f73680e = eArr[1 - i];
            } else {
                int i3 = (i2 - i) - 1;
                if (i3 > 0) {
                    System.arraycopy(eArr, i + 1, eArr, i, i3);
                }
                eArr[this.f73679d - 1] = null;
            }
            e = e2;
        }
        this.f73679d--;
        this.modCount++;
        return e;
    }

    public E set(int i, E e) {
        int i2;
        if (i < 0 || i >= (i2 = this.f73679d)) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.f73679d);
        } else if (i2 == 1) {
            E e2 = this.f73680e;
            this.f73680e = e;
            return e2;
        } else {
            E[] eArr = (Object[]) this.f73680e;
            E e3 = eArr[i];
            eArr[i] = e;
            return e3;
        }
    }

    public int size() {
        return this.f73679d;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr != null) {
            int length = tArr.length;
            int i = this.f73679d;
            if (i == 1) {
                if (length != 0) {
                    tArr[0] = this.f73680e;
                } else {
                    T[] tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1);
                    tArr2[0] = this.f73680e;
                    return tArr2;
                }
            } else if (length < i) {
                T[] copyOf = Arrays.copyOf((Object[]) this.f73680e, i, tArr.getClass());
                if (copyOf != null) {
                    return copyOf;
                }
                m34010f(6);
                throw null;
            } else if (i != 0) {
                System.arraycopy(this.f73680e, 0, tArr, 0, i);
            }
            int i2 = this.f73679d;
            if (length > i2) {
                tArr[i2] = null;
            }
            return tArr;
        }
        m34010f(4);
        throw null;
    }

    public void add(int i, E e) {
        int i2;
        if (i < 0 || i > (i2 = this.f73679d)) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.f73679d);
        }
        if (i2 == 0) {
            this.f73680e = e;
        } else if (i2 == 1 && i == 0) {
            this.f73680e = new Object[]{e, this.f73680e};
        } else {
            Object[] objArr = new Object[(i2 + 1)];
            if (i2 == 1) {
                objArr[0] = this.f73680e;
            } else {
                Object[] objArr2 = (Object[]) this.f73680e;
                System.arraycopy(objArr2, 0, objArr, 0, i);
                System.arraycopy(objArr2, i, objArr, i + 1, this.f73679d - i);
            }
            objArr[i] = e;
            this.f73680e = objArr;
        }
        this.f73679d++;
        this.modCount++;
    }
}
