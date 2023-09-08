package com.google.android.gms.common.data;

import java.util.NoSuchElementException;

public class SingleRefDataBufferIterator<T> extends DataBufferIterator<T> {
    private T zzoj;

    public SingleRefDataBufferIterator(DataBuffer<T> dataBuffer) {
        super(dataBuffer);
    }

    public T next() {
        if (hasNext()) {
            int i = this.mPosition + 1;
            this.mPosition = i;
            if (i == 0) {
                T t = this.mDataBuffer.get(0);
                this.zzoj = t;
                if (!(t instanceof DataBufferRef)) {
                    String valueOf = String.valueOf(this.zzoj.getClass());
                    StringBuilder sb = new StringBuilder(valueOf.length() + 44);
                    sb.append("DataBuffer reference of type ");
                    sb.append(valueOf);
                    sb.append(" is not movable");
                    throw new IllegalStateException(sb.toString());
                }
            } else {
                ((DataBufferRef) this.zzoj).setDataRow(i);
            }
            return this.zzoj;
        }
        int i2 = this.mPosition;
        StringBuilder sb4 = new StringBuilder(46);
        sb4.append("Cannot advance the iterator beyond ");
        sb4.append(i2);
        throw new NoSuchElementException(sb4.toString());
    }
}
