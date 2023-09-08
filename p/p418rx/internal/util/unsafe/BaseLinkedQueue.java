package p418rx.internal.util.unsafe;

import java.util.Iterator;
import r34.C26113b;

/* renamed from: rx.internal.util.unsafe.BaseLinkedQueue */
abstract class BaseLinkedQueue<E> extends BaseLinkedQueueConsumerNodeRef<E> {

    /* renamed from: p00  reason: collision with root package name */
    public long f361708p00;

    /* renamed from: p01  reason: collision with root package name */
    public long f361709p01;

    /* renamed from: p02  reason: collision with root package name */
    public long f361710p02;

    /* renamed from: p03  reason: collision with root package name */
    public long f361711p03;

    /* renamed from: p04  reason: collision with root package name */
    public long f361712p04;
    public long p05;
    public long p06;
    public long p07;

    /* renamed from: p30  reason: collision with root package name */
    public long f361713p30;

    /* renamed from: p31  reason: collision with root package name */
    public long f361714p31;

    /* renamed from: p32  reason: collision with root package name */
    public long f361715p32;

    /* renamed from: p33  reason: collision with root package name */
    public long f361716p33;

    /* renamed from: p34  reason: collision with root package name */
    public long f361717p34;
    public long p35;
    public long p36;
    public long p37;

    public final boolean isEmpty() {
        return lvConsumerNode() == lvProducerNode();
    }

    public final Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        C26113b a;
        C26113b lvConsumerNode = lvConsumerNode();
        C26113b lvProducerNode = lvProducerNode();
        int i = 0;
        while (lvConsumerNode != lvProducerNode && i < Integer.MAX_VALUE) {
            do {
                a = lvConsumerNode.mo52988a();
            } while (a == null);
            i++;
            lvConsumerNode = a;
        }
        return i;
    }
}
