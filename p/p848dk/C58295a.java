package p848dk;

import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import java.util.Iterator;
import java.util.LinkedList;
import p850ek.C58614e;
import p852fk.C59109a;

/* renamed from: dk.a */
public class C58295a {

    /* renamed from: a */
    public final LinkedList<C58296a> f166922a = new LinkedList<>();

    /* renamed from: b */
    public final LinkedList<C58296a> f166923b = new LinkedList<>();

    /* renamed from: c */
    public final int f166924c;

    /* renamed from: d */
    public int f166925d;

    /* renamed from: e */
    public int f166926e;

    /* renamed from: f */
    public int f166927f;

    /* renamed from: dk.a$a */
    public static class C58296a {

        /* renamed from: a */
        public Bitmap f166928a;

        /* renamed from: b */
        public int f166929b;

        /* renamed from: c */
        public int f166930c;

        /* renamed from: d */
        public int f166931d;

        /* renamed from: e */
        public int f166932e;
    }

    public C58295a() {
        DisplayMetrics displayMetrics = C59109a.m69050a().getResources().getDisplayMetrics();
        this.f166924c = displayMetrics.widthPixels * displayMetrics.heightPixels * 6;
    }

    /* renamed from: a */
    public Bitmap mo83055a(int i, int i2) {
        this.f166926e++;
        Iterator<C58296a> it = this.f166922a.iterator();
        C58296a aVar = null;
        while (it.hasNext()) {
            C58296a next = it.next();
            if (next.f166929b >= i && next.f166930c >= i2) {
                if (aVar == null || aVar.f166931d >= next.f166931d) {
                    aVar = next;
                }
            }
        }
        if (aVar != null) {
            this.f166922a.remove(aVar);
            this.f166925d -= aVar.f166932e;
            Bitmap bitmap = aVar.f166928a;
            aVar.f166928a = null;
            aVar.f166929b = 0;
            aVar.f166930c = 0;
            aVar.f166931d = 0;
            aVar.f166932e = 0;
            this.f166923b.addLast(aVar);
            return bitmap;
        }
        try {
            this.f166927f++;
            return Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_4444);
        } catch (OutOfMemoryError e) {
            C58614e.m68066c("BitmapCacheManager", "create bitmap out of memory", e);
            return null;
        }
    }

    /* renamed from: b */
    public void mo83056b(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f166925d += bitmap.getRowBytes() * bitmap.getHeight();
            C58296a poll = this.f166923b.poll();
            if (poll == null) {
                poll = new C58296a();
            }
            poll.f166928a = bitmap;
            poll.f166929b = bitmap.getWidth();
            poll.f166930c = bitmap.getHeight();
            poll.f166931d = bitmap.getHeight() * bitmap.getWidth();
            poll.f166932e = bitmap.getRowBytes() * bitmap.getHeight();
            this.f166922a.addLast(poll);
            while (this.f166925d > this.f166924c) {
                Iterator<C58296a> it = this.f166922a.iterator();
                C58296a aVar = null;
                while (it.hasNext()) {
                    C58296a next = it.next();
                    if (aVar == null || aVar.f166931d > next.f166931d) {
                        aVar = next;
                    }
                }
                if (aVar != null) {
                    this.f166922a.remove(aVar);
                    this.f166925d -= aVar.f166932e;
                    Bitmap bitmap2 = aVar.f166928a;
                    if (bitmap2 != null && !bitmap2.isRecycled()) {
                        int i = C59109a.f169072a;
                    }
                    aVar.f166928a = null;
                    aVar.f166929b = 0;
                    aVar.f166930c = 0;
                    aVar.f166931d = 0;
                    aVar.f166932e = 0;
                    this.f166923b.addLast(aVar);
                }
            }
        }
    }
}
