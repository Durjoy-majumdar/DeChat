package p418rx.internal.util.unsafe;

import r34.C26113b;

/* renamed from: rx.internal.util.unsafe.BaseLinkedQueueConsumerNodeRef */
abstract class BaseLinkedQueueConsumerNodeRef<E> extends BaseLinkedQueuePad1<E> {
    public static final long C_NODE_OFFSET = UnsafeAccess.addressOf(BaseLinkedQueueConsumerNodeRef.class, "consumerNode");
    public C26113b<E> consumerNode;

    public final C26113b<E> lpConsumerNode() {
        return this.consumerNode;
    }

    public final C26113b<E> lvConsumerNode() {
        return (C26113b) UnsafeAccess.UNSAFE.getObjectVolatile(this, C_NODE_OFFSET);
    }

    public final void spConsumerNode(C26113b<E> bVar) {
        this.consumerNode = bVar;
    }
}
