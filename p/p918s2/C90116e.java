package p918s2;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.tencent.p014mm.C0966R;
import java.util.ArrayList;

/* renamed from: s2.e */
public class C90116e {

    /* renamed from: s2.e$d */
    public static final class C77601d implements C77603e {

        /* renamed from: a */
        public C77602a f226231a;

        @Deprecated
        /* renamed from: s2.e$d$a */
        public static class C77602a {

            /* renamed from: a */
            public final String[] f226232a;

            /* renamed from: b */
            public final C77610j f226233b;

            /* renamed from: c */
            public final PendingIntent f226234c;

            /* renamed from: d */
            public final PendingIntent f226235d;

            /* renamed from: e */
            public final String[] f226236e;

            /* renamed from: f */
            public final long f226237f;

            public C77602a(String[] strArr, C77610j jVar, PendingIntent pendingIntent, PendingIntent pendingIntent2, String[] strArr2, long j) {
                this.f226232a = strArr;
                this.f226233b = jVar;
                this.f226235d = pendingIntent2;
                this.f226234c = pendingIntent;
                this.f226236e = strArr2;
                this.f226237f = j;
            }
        }
    }

    /* renamed from: s2.e$e */
    public interface C77603e {
    }

    /* renamed from: s2.e$b */
    public static class C90117b extends C90118f {

        /* renamed from: b */
        public CharSequence f258770b;

        public C90117b() {
        }

        public C90117b(C90121c cVar) {
            if (this.f258771a != cVar) {
                this.f258771a = cVar;
                if (cVar != null) {
                    cVar.mo124389n(this);
                }
            }
        }
    }

    /* renamed from: s2.e$f */
    public static abstract class C90118f {

        /* renamed from: a */
        public C90121c f258771a;
    }

    /* renamed from: s2.e$a */
    public static class C90119a {

        /* renamed from: a */
        public final Bundle f258772a;

        /* renamed from: b */
        public IconCompat f258773b;

        /* renamed from: c */
        public final C77610j[] f258774c;

        /* renamed from: d */
        public boolean f258775d;

        /* renamed from: e */
        public boolean f258776e = true;

        /* renamed from: f */
        public final int f258777f;

        /* renamed from: g */
        public final boolean f258778g;
        @Deprecated

        /* renamed from: h */
        public int f258779h;

        /* renamed from: i */
        public CharSequence f258780i;

        /* renamed from: j */
        public PendingIntent f258781j;

        /* renamed from: s2.e$a$a */
        public static final class C90120a {

            /* renamed from: a */
            public final IconCompat f258782a;

            /* renamed from: b */
            public final CharSequence f258783b;

            /* renamed from: c */
            public final PendingIntent f258784c;

            /* renamed from: d */
            public boolean f258785d;

            /* renamed from: e */
            public final Bundle f258786e;

            /* renamed from: f */
            public boolean f258787f;

            public C90120a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
                IconCompat c = i != 0 ? IconCompat.m138052c((Resources) null, "", i) : null;
                Bundle bundle = new Bundle();
                this.f258785d = true;
                this.f258787f = true;
                this.f258782a = c;
                this.f258783b = C90121c.m112748d(charSequence);
                this.f258784c = pendingIntent;
                this.f258786e = bundle;
                this.f258785d = true;
                this.f258787f = true;
            }

            /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object[]] */
            /* JADX WARNING: Multi-variable type inference failed */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public p918s2.C90116e.C90119a mo124376a() {
                /*
                    r15 = this;
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    boolean r2 = r0.isEmpty()
                    r3 = 0
                    if (r2 == 0) goto L_0x0013
                    r10 = r3
                    goto L_0x0020
                L_0x0013:
                    int r2 = r0.size()
                    s2.j[] r2 = new p918s2.C77610j[r2]
                    java.lang.Object[] r0 = r0.toArray(r2)
                    s2.j[] r0 = (p918s2.C77610j[]) r0
                    r10 = r0
                L_0x0020:
                    boolean r0 = r1.isEmpty()
                    if (r0 == 0) goto L_0x0027
                    goto L_0x0034
                L_0x0027:
                    int r0 = r1.size()
                    s2.j[] r0 = new p918s2.C77610j[r0]
                    java.lang.Object[] r0 = r1.toArray(r0)
                    r3 = r0
                    s2.j[] r3 = (p918s2.C77610j[]) r3
                L_0x0034:
                    r9 = r3
                    s2.e$a r0 = new s2.e$a
                    androidx.core.graphics.drawable.IconCompat r5 = r15.f258782a
                    java.lang.CharSequence r6 = r15.f258783b
                    android.app.PendingIntent r7 = r15.f258784c
                    android.os.Bundle r8 = r15.f258786e
                    boolean r11 = r15.f258785d
                    r12 = 0
                    boolean r13 = r15.f258787f
                    r14 = 0
                    r4 = r0
                    r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: p918s2.C90116e.C90119a.C90120a.mo124376a():s2.e$a");
            }
        }

        public C90119a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C77610j[] jVarArr, C77610j[] jVarArr2, boolean z, int i, boolean z2, boolean z3) {
            this.f258773b = iconCompat;
            if (iconCompat != null && iconCompat.mo144945e() == 2) {
                this.f258779h = iconCompat.mo144944d();
            }
            this.f258780i = C90121c.m112748d(charSequence);
            this.f258781j = pendingIntent;
            this.f258772a = bundle == null ? new Bundle() : bundle;
            this.f258774c = jVarArr;
            this.f258775d = z;
            this.f258777f = i;
            this.f258776e = z2;
            this.f258778g = z3;
        }
    }

    /* renamed from: s2.e$c */
    public static class C90121c {
        @Deprecated

        /* renamed from: A */
        public ArrayList<String> f258788A;

        /* renamed from: a */
        public Context f258789a;

        /* renamed from: b */
        public ArrayList<C90119a> f258790b = new ArrayList<>();

        /* renamed from: c */
        public ArrayList<C118258i> f258791c = new ArrayList<>();

        /* renamed from: d */
        public ArrayList<C90119a> f258792d = new ArrayList<>();

        /* renamed from: e */
        public CharSequence f258793e;

        /* renamed from: f */
        public CharSequence f258794f;

        /* renamed from: g */
        public PendingIntent f258795g;

        /* renamed from: h */
        public PendingIntent f258796h;

        /* renamed from: i */
        public Bitmap f258797i;

        /* renamed from: j */
        public int f258798j;

        /* renamed from: k */
        public boolean f258799k = true;

        /* renamed from: l */
        public C90118f f258800l;

        /* renamed from: m */
        public CharSequence f258801m;

        /* renamed from: n */
        public int f258802n;

        /* renamed from: o */
        public int f258803o;

        /* renamed from: p */
        public boolean f258804p;

        /* renamed from: q */
        public boolean f258805q = false;

        /* renamed from: r */
        public String f258806r;

        /* renamed from: s */
        public Bundle f258807s;

        /* renamed from: t */
        public int f258808t = 0;

        /* renamed from: u */
        public RemoteViews f258809u;

        /* renamed from: v */
        public RemoteViews f258810v;

        /* renamed from: w */
        public RemoteViews f258811w;

        /* renamed from: x */
        public String f258812x;

        /* renamed from: y */
        public boolean f258813y;

        /* renamed from: z */
        public Notification f258814z;

        public C90121c(Context context, String str) {
            Notification notification = new Notification();
            this.f258814z = notification;
            this.f258789a = context;
            this.f258812x = str;
            notification.when = System.currentTimeMillis();
            this.f258814z.audioStreamType = -1;
            this.f258798j = 0;
            this.f258788A = new ArrayList<>();
            this.f258813y = true;
        }

        /* renamed from: d */
        public static CharSequence m112748d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        /* renamed from: a */
        public C90121c mo124377a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            int i2 = i;
            this.f258790b.add(new C90119a(i2 == 0 ? null : IconCompat.m138052c((Resources) null, "", i2), charSequence, pendingIntent, new Bundle(), (C77610j[]) null, (C77610j[]) null, true, 0, true, false));
            return this;
        }

        /* renamed from: b */
        public Notification mo124378b() {
            Notification notification;
            Bundle bundle;
            C118256f fVar = new C118256f(this);
            C90118f fVar2 = fVar.f353444c.f258800l;
            if (fVar2 != null) {
                new Notification.BigTextStyle(fVar.f353443b).setBigContentTitle((CharSequence) null).bigText(((C90117b) fVar2).f258770b);
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                notification = fVar.f353443b.build();
            } else if (i >= 24) {
                notification = fVar.f353443b.build();
            } else {
                fVar.f353443b.setExtras(fVar.f353448g);
                notification = fVar.f353443b.build();
                RemoteViews remoteViews = fVar.f353445d;
                if (remoteViews != null) {
                    notification.contentView = remoteViews;
                }
                RemoteViews remoteViews2 = fVar.f353446e;
                if (remoteViews2 != null) {
                    notification.bigContentView = remoteViews2;
                }
                RemoteViews remoteViews3 = fVar.f353449h;
                if (remoteViews3 != null) {
                    notification.headsUpContentView = remoteViews3;
                }
            }
            C90121c cVar = fVar.f353444c;
            RemoteViews remoteViews4 = cVar.f258809u;
            if (remoteViews4 != null) {
                notification.contentView = remoteViews4;
            }
            if (fVar2 != null) {
                cVar.f258800l.getClass();
            }
            if (!(fVar2 == null || (bundle = notification.extras) == null)) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", "androidx.core.app.NotificationCompat$BigTextStyle");
            }
            return notification;
        }

        @Deprecated
        /* renamed from: c */
        public Notification mo124379c() {
            return mo124378b();
        }

        /* renamed from: e */
        public C90121c mo124380e(boolean z) {
            mo124384i(16, z);
            return this;
        }

        /* renamed from: f */
        public C90121c mo124381f(PendingIntent pendingIntent) {
            this.f258795g = pendingIntent;
            return this;
        }

        /* renamed from: g */
        public C90121c mo124382g(CharSequence charSequence) {
            this.f258794f = m112748d(charSequence);
            return this;
        }

        /* renamed from: h */
        public C90121c mo124383h(CharSequence charSequence) {
            this.f258793e = m112748d(charSequence);
            return this;
        }

        /* renamed from: i */
        public final void mo124384i(int i, boolean z) {
            if (z) {
                Notification notification = this.f258814z;
                notification.flags = i | notification.flags;
                return;
            }
            Notification notification2 = this.f258814z;
            notification2.flags = (~i) & notification2.flags;
        }

        /* renamed from: j */
        public C90121c mo124385j(Bitmap bitmap) {
            if (bitmap != null && Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f258789a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(C0966R.dimen.f4295zm);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(C0966R.dimen.f4294zl);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * min), (int) Math.ceil(((double) bitmap.getHeight()) * min), true);
                }
            }
            this.f258797i = bitmap;
            return this;
        }

        /* renamed from: k */
        public C90121c mo124386k(int i, int i2, boolean z) {
            this.f258802n = i;
            this.f258803o = i2;
            this.f258804p = z;
            return this;
        }

        /* renamed from: l */
        public C90121c mo124387l(int i) {
            this.f258814z.icon = i;
            return this;
        }

        /* renamed from: m */
        public C90121c mo124388m(Uri uri) {
            Notification notification = this.f258814z;
            notification.sound = uri;
            notification.audioStreamType = -1;
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            return this;
        }

        /* renamed from: n */
        public C90121c mo124389n(C90118f fVar) {
            if (this.f258800l != fVar) {
                this.f258800l = fVar;
                if (!(fVar == null || fVar.f258771a == this)) {
                    fVar.f258771a = this;
                    mo124389n(fVar);
                }
            }
            return this;
        }

        /* renamed from: o */
        public C90121c mo124390o(CharSequence charSequence) {
            this.f258814z.tickerText = m112748d(charSequence);
            return this;
        }

        /* renamed from: p */
        public C90121c mo124391p(long j) {
            this.f258814z.when = j;
            return this;
        }
    }

    /* renamed from: a */
    public static String m112746a(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getChannelId();
        }
        return null;
    }
}
