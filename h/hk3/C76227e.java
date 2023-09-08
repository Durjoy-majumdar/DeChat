package hk3;

import android.os.Bundle;
import android.util.SparseArray;
import androidx.recyclerview.widget.C54248l;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: hk3.e */
public interface C76227e {

    /* renamed from: hk3.e$b */
    public interface C32942b {
        void next();
    }

    /* renamed from: hk3.e$a */
    public enum C76228a {
        ACTION_TOP,
        ACTION_BOTTOM,
        ACTION_UPDATE,
        ACTION_ENTER,
        ACTION_POSITION
    }

    /* renamed from: hk3.e$c */
    public interface C76229c<T> {
    }

    /* renamed from: hk3.e$d */
    public static class C76230d<T> {

        /* renamed from: a */
        public Bundle f223307a;

        /* renamed from: b */
        public C76228a f223308b;

        /* renamed from: c */
        public List<T> f223309c;

        /* renamed from: d */
        public int f223310d;

        /* renamed from: e */
        public SparseArray<T> f223311e;

        /* renamed from: f */
        public int f223312f;

        /* renamed from: g */
        public int f223313g = -1;

        /* renamed from: h */
        public long f223314h = 0;

        /* renamed from: i */
        public AtomicBoolean f223315i;

        /* renamed from: j */
        public C54248l.C54251c f223316j;

        /* renamed from: k */
        public SparseArray<T> f223317k;

        /* renamed from: l */
        public C76231f f223318l;

        public C76230d(C76228a aVar, AtomicBoolean atomicBoolean, C76231f fVar) {
            this.f223315i = atomicBoolean;
            this.f223308b = aVar;
            this.f223309c = new LinkedList();
            this.f223318l = fVar;
        }

        public String toString() {
            return "LoadedResult{sourceArgs=" + this.f223307a + ", mode=" + this.f223308b + ", selection=" + this.f223313g + ", count=" + this.f223310d + ", totalCount=" + this.f223312f + '}';
        }
    }
}
