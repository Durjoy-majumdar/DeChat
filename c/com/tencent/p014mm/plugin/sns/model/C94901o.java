package com.tencent.p014mm.plugin.sns.model;

import a70.C112760b;
import ad0.C91999u;
import android.app.Activity;
import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import as2.C92084a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.memory.C92714n;
import com.tencent.p014mm.p136ui.widget.QDisFadeImageView;
import com.tencent.p014mm.p136ui.widget.QFadeImageView;
import com.tencent.p014mm.p136ui.widget.QImageView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sight.decode.model.C94571a;
import com.tencent.p014mm.plugin.sight.decode.p1077ui.SightPlayImageView;
import com.tencent.p014mm.plugin.sns.model.C94917o1;
import com.tencent.p014mm.plugin.sns.p106ui.C95764e1;
import com.tencent.p014mm.plugin.sns.p106ui.C96066m2;
import com.tencent.p014mm.plugin.sns.p106ui.MaskImageView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAdTimelineVideoView;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoSightView;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.ForceGpuUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.C96983o3;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.xweb.IXWebBroadcastListener;
import d14.C58087u0;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import jq2.C98985g;
import jr2.C76439o;
import kg3.C76577a;
import ks2.C99181f;
import ks2.C99188h;
import ks2.C99193m;
import o40.C61926c;
import o90.C100301b;
import os2.C100408j0;
import p1072al.C92043g;
import p1089xk.C102688b;
import p260wk.C102457e;
import p823sg.C101611g;
import r90.C101364a;
import rx3.C13598b0;
import te3.C101804kv2;
import vr2.C102236a0;
import vr2.C102268v;

/* renamed from: com.tencent.mm.plugin.sns.model.o */
public class C94901o implements C76439o {

    /* renamed from: y */
    public static int f274994y;

    /* renamed from: a */
    public long f274995a = 0;

    /* renamed from: b */
    public long f274996b = 0;

    /* renamed from: c */
    public C100301b<C92714n> f274997c;

    /* renamed from: d */
    public C94917o1<String, WeakReference<Bitmap>> f274998d;

    /* renamed from: e */
    public Map<Integer, WeakReference<Object>> f274999e = new ConcurrentHashMap();

    /* renamed from: f */
    public Map<String, CopyOnWriteArrayList<WeakReference<C94913j>>> f275000f = new ConcurrentHashMap();

    /* renamed from: g */
    public LinkedList<C94912i> f275001g;

    /* renamed from: h */
    public boolean f275002h;

    /* renamed from: i */
    public CopyOnWriteArraySet<C94913j> f275003i;

    /* renamed from: j */
    public HashMap<String, Integer> f275004j;

    /* renamed from: k */
    public int f275005k;

    /* renamed from: l */
    public C95764e1 f275006l;

    /* renamed from: m */
    public boolean f275007m;

    /* renamed from: n */
    public long f275008n;

    /* renamed from: o */
    public long f275009o;

    /* renamed from: p */
    public int f275010p;

    /* renamed from: q */
    public int f275011q;

    /* renamed from: r */
    public HashMap<Long, Integer> f275012r;

    /* renamed from: s */
    public HashMap<Integer, Boolean> f275013s;

    /* renamed from: t */
    public HashMap<Integer, Boolean> f275014t;

    /* renamed from: u */
    public int f275015u;

    /* renamed from: v */
    public int f275016v;

    /* renamed from: w */
    public HashMap<Long, Integer> f275017w;

    /* renamed from: x */
    public Set<String> f275018x;

    /* renamed from: com.tencent.mm.plugin.sns.model.o$a */
    public class C94902a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C101804kv2 f275019d;

        /* renamed from: e */
        public final /* synthetic */ C96983o3 f275020e;

        public C94902a(C94901o oVar, C101804kv2 kv22, C96983o3 o3Var) {
            this.f275019d = kv22;
            this.f275020e = o3Var;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$10");
            C94866e1.Vx0().mo130979d(this.f275019d, 4, (C102268v) null, this.f275020e);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$10");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.o$b */
    public class C94903b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f275021d;

        /* renamed from: e */
        public final /* synthetic */ View f275022e;

        /* renamed from: f */
        public final /* synthetic */ String f275023f;

        /* renamed from: g */
        public final /* synthetic */ int f275024g;

        /* renamed from: h */
        public final /* synthetic */ boolean f275025h;

        /* renamed from: i */
        public final /* synthetic */ C101804kv2 f275026i;

        /* renamed from: j */
        public final /* synthetic */ boolean f275027j;

        /* renamed from: n */
        public final /* synthetic */ C96983o3 f275028n;

        /* renamed from: o */
        public final /* synthetic */ C94915l f275029o;

        /* renamed from: com.tencent.mm.plugin.sns.model.o$b$a */
        public class C94904a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bitmap f275031d;

            public C94904a(Bitmap bitmap) {
                this.f275031d = bitmap;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$14$1");
                if (C102236a0.m134740e(this.f275031d)) {
                    C94903b bVar = C94903b.this;
                    C94901o oVar = C94901o.this;
                    View view = bVar.f275022e;
                    String str = bVar.f275023f;
                    int i = bVar.f275024g;
                    int width = this.f275031d.getWidth();
                    int height = this.f275031d.getHeight();
                    SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                    oVar.mo131129m0(view, str, false, -1, i, width, height);
                    SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                } else {
                    C94903b bVar2 = C94903b.this;
                    C94901o oVar2 = C94901o.this;
                    View view2 = bVar2.f275022e;
                    String str2 = bVar2.f275023f;
                    int i2 = bVar2.f275024g;
                    SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                    oVar2.mo131129m0(view2, str2, false, -1, i2, -1, -1);
                    SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                }
                if (C102236a0.m134740e(this.f275031d)) {
                    C94901o oVar3 = C94901o.this;
                    SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                    C94917o1<String, WeakReference<Bitmap>> o1Var = oVar3.f274998d;
                    SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                    String str3 = C94903b.this.f275023f;
                    OO weakReference = new WeakReference(this.f275031d);
                    o1Var.getClass();
                    SnsMethodCalculate.markStartTimeMs("update", "com.tencent.mm.plugin.sns.model.SnsLRUMap");
                    if (((C94917o1.C94920c) ((HashMap) o1Var.f275076a).get(str3)) == null) {
                        SnsMethodCalculate.markStartTimeMs("insert", "com.tencent.mm.plugin.sns.model.SnsLRUMap");
                        ((HashMap) o1Var.f275076a).put(str3, new C94917o1.C94920c(o1Var, weakReference));
                        o1Var.mo131178a();
                        SnsMethodCalculate.markEndTimeMs("insert", "com.tencent.mm.plugin.sns.model.SnsLRUMap");
                    } else {
                        ((C94917o1.C94920c) ((HashMap) o1Var.f275076a).get(str3)).mo131180a();
                        ((C94917o1.C94920c) ((HashMap) o1Var.f275076a).get(str3)).f275079a = weakReference;
                    }
                    SnsMethodCalculate.markEndTimeMs("update", "com.tencent.mm.plugin.sns.model.SnsLRUMap");
                } else if (C94903b.this.f275025h) {
                    C94853e Vx0 = C94866e1.Vx0();
                    C94903b bVar3 = C94903b.this;
                    Vx0.mo130979d(bVar3.f275026i, bVar3.f275027j ? 8 : 2, (C102268v) null, bVar3.f275028n);
                }
                C94915l lVar = C94903b.this.f275029o;
                if (lVar != null) {
                    lVar.mo131160a(this.f275031d);
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$14$1");
            }
        }

        public C94903b(String str, View view, String str2, int i, boolean z, C101804kv2 kv22, boolean z2, C96983o3 o3Var, C94915l lVar) {
            this.f275021d = str;
            this.f275022e = view;
            this.f275023f = str2;
            this.f275024g = i;
            this.f275025h = z;
            this.f275026i = kv22;
            this.f275027j = z2;
            this.f275028n = o3Var;
            this.f275029o = lVar;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$14");
            C94866e1.ly0().post(new C94904a(C102236a0.m134760o(this.f275021d)));
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$14");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.o$c */
    public class C94905c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f275033d;

        /* renamed from: e */
        public final /* synthetic */ C94914k f275034e;

        /* renamed from: com.tencent.mm.plugin.sns.model.o$c$a */
        public class C94906a implements C92043g.C92044a<Bitmap> {
            public C94906a() {
            }

            /* renamed from: a */
            public void mo65752a(int i, IEmojiInfo iEmojiInfo, Object obj) {
                SnsMethodCalculate.markStartTimeMs("onState", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$15$1");
                Bitmap bitmap = (Bitmap) obj;
                SnsMethodCalculate.markStartTimeMs("onState", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$15$1");
                if (C94905c.this.f275034e != null && C102236a0.m134740e(bitmap)) {
                    C94905c cVar = C94905c.this;
                    cVar.f275034e.mo131159a(bitmap, cVar.f275033d);
                }
                SnsMethodCalculate.markEndTimeMs("onState", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$15$1");
                SnsMethodCalculate.markEndTimeMs("onState", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$15$1");
            }
        }

        public C94905c(C94901o oVar, String str, C94914k kVar) {
            this.f275033d = str;
            this.f275034e = kVar;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$15");
            EmojiInfo TO = C30790w2.m39221h().mo57717d().mo142044TO(this.f275033d);
            if (TO != null) {
                C102457e.f301712a.mo142071c(TO, new C94906a());
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$15");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.o$d */
    public class C94907d implements C100301b.C100306e<C92714n> {
        public C94907d(C94901o oVar) {
        }

        /* renamed from: a */
        public int mo131148a(Object obj) {
            int i;
            SnsMethodCalculate.markStartTimeMs("sizeOf", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$1");
            C92714n nVar = (C92714n) obj;
            SnsMethodCalculate.markStartTimeMs("sizeOf", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$1");
            if (nVar == null) {
                i = 0;
                SnsMethodCalculate.markEndTimeMs("sizeOf", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$1");
            } else {
                i = nVar.mo126921d();
                SnsMethodCalculate.markEndTimeMs("sizeOf", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$1");
            }
            SnsMethodCalculate.markEndTimeMs("sizeOf", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$1");
            return i;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.o$e */
    public class C94908e implements C101611g.C101612b<String, C92714n> {
        public C94908e(C94901o oVar) {
        }

        public void preRemoveCallback(Object obj, Object obj2, Object obj3) {
            SnsMethodCalculate.markStartTimeMs("preRemoveCallback", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$2");
            String str = (String) obj;
            C92714n nVar = (C92714n) obj2;
            C92714n nVar2 = (C92714n) obj3;
            SnsMethodCalculate.markStartTimeMs("preRemoveCallback", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$2");
            if (nVar != null && !nVar.mo126922e() && !nVar.equals(nVar2)) {
                nVar.f266821g.decrementAndGet();
                nVar.mo126923f();
            }
            if (nVar2 != null) {
                nVar2.mo126921d();
            }
            C98985g.m128893d(str);
            SnsMethodCalculate.markEndTimeMs("preRemoveCallback", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$2");
            SnsMethodCalculate.markEndTimeMs("preRemoveCallback", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.o$f */
    public class C94909f implements Runnable {
        public C94909f() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$6");
            C94901o oVar = C94901o.this;
            SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            boolean z = oVar.f275002h;
            SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            if (z) {
                Log.m105921e("MicroMsg.LazyerImageLoader2", "[%s]already start,ignore start event2", "[image-flow]");
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$6");
                return;
            }
            if (C94901o.m120384b(C94901o.this).size() > 0) {
                C94912i iVar = (C94912i) C94901o.m120384b(C94901o.this).removeLast();
                Log.m105925i("MicroMsg.LazyerImageLoader2", "[%s][media:%s] LazyerImageLoader2 start key:%s size:%s", "[image-flow]", iVar.mo131155g(), C94912i.m120452e(iVar), Integer.valueOf(C94901o.m120384b(C94901o.this).size()));
                iVar.mo131292d("");
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$6");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.o$g */
    public class C94910g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C101804kv2 f275037d;

        /* renamed from: e */
        public final /* synthetic */ int f275038e;

        /* renamed from: f */
        public final /* synthetic */ C96983o3 f275039f;

        public C94910g(C101804kv2 kv22, int i, C96983o3 o3Var) {
            this.f275037d = kv22;
            this.f275038e = i;
            this.f275039f = o3Var;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$9");
            int i = 1;
            Log.m105925i("MicroMsg.LazyerImageLoader2", "[%s][media:%s] run pushToImageLoaderUi decodeType:%d", "[image-flow]", this.f275037d.f298689d, Integer.valueOf(this.f275038e));
            if (!C94901o.m120383a(C94901o.this, this.f275038e, this.f275037d, true)) {
                Log.m105925i("MicroMsg.LazyerImageLoader2", "[%s][media:%s] run pushToImageLoaderUi false,do net request", "[image-flow]", this.f275037d.f298689d);
                C102268v vVar = new C102268v(this.f275037d);
                vVar.mo141832d(this.f275038e);
                vVar.mo141833e(this.f275037d.f298689d);
                C94853e Vx0 = C94866e1.Vx0();
                C101804kv2 kv22 = this.f275037d;
                if (kv22.f298690e == 6) {
                    i = 5;
                }
                Vx0.mo130979d(kv22, i, vVar, this.f275039f);
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$9");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.o$h */
    public enum C94911h {
        IMG_SCENE_NONE,
        IMG_SCENE_SNSUSER
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.o$i */
    public class C94912i extends C94958v<String, Integer, Boolean> {

        /* renamed from: c */
        public String f275044c;

        /* renamed from: d */
        public C92714n f275045d = null;

        /* renamed from: e */
        public String f275046e;

        /* renamed from: f */
        public String f275047f;

        /* renamed from: g */
        public C101804kv2 f275048g;

        /* renamed from: h */
        public int f275049h;

        public C94912i(String str, String str2, String str3, C101804kv2 kv22, int i) {
            this.f275044c = str;
            this.f275046e = str2;
            this.f275047f = str3;
            this.f275048g = kv22;
            this.f275049h = i;
            SnsMethodCalculate.markStartTimeMs("access$1208", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            C94901o.f274994y++;
            SnsMethodCalculate.markEndTimeMs("access$1208", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            int i2 = C94901o.f274994y;
            SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            Log.printInfoStack("MicroMsg.ImageLoader", "create loader for key:%s, media:%s, pendingCount:%s, path:%s", str, kv22.f298689d, Integer.valueOf(i2), str2);
        }

        /* renamed from: e */
        public static /* synthetic */ String m120452e(C94912i iVar) {
            SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
            String str = iVar.f275044c;
            SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
            return str;
        }

        /* renamed from: a */
        public Object mo131151a(Object[] objArr) {
            Boolean bool;
            SnsMethodCalculate.markStartTimeMs("doInBackground", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
            String[] strArr = (String[]) objArr;
            SnsMethodCalculate.markStartTimeMs("doInBackground", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
            C94901o oVar = C94901o.this;
            SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            oVar.f275002h = true;
            SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            C101804kv2 kv22 = this.f275048g;
            boolean z = false;
            boolean z2 = kv22 != null && kv22.f298681N;
            C94901o oVar2 = C94901o.this;
            SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            boolean z3 = oVar2.f275007m;
            SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            Log.m105925i("MicroMsg.ImageLoader", "[%s][media:%s] ImageLoader doInBackground isRun:%b DecodeType:%d", "[image-flow]", mo131155g(), Boolean.valueOf(z3), Integer.valueOf(this.f275049h));
            C94901o oVar3 = C94901o.this;
            SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            boolean z4 = oVar3.f275007m;
            SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            if (z4 || z2) {
                C94901o oVar4 = C94901o.this;
                SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                C100301b<C92714n> bVar = oVar4.f274997c;
                SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                if (bVar.check(this.f275044c)) {
                    Log.m105921e("MicroMsg.ImageLoader", "[%s][media:%s] ImageLoader doInBackground stop for mMemoryCache contains key:%s!", "[image-flow]", mo131155g(), this.f275044c);
                    bool = Boolean.FALSE;
                    SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
                } else {
                    C86013q1.m106460u(this.f275047f);
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!C86013q1.m106450k(this.f275046e)) {
                        mo131154f(C102236a0.m134729X(this.f275048g), C102236a0.m134717L(this.f275048g), C102236a0.m134745g0(this.f275048g));
                    } else {
                        Log.m105919d("MicroMsg.ImageLoader", "doInBackground file exist:%s", this.f275046e);
                    }
                    long currentTicks = Util.currentTicks();
                    int i = this.f275049h;
                    if (i == 5) {
                        if (!C86013q1.m106450k(this.f275046e)) {
                            mo131154f(C102236a0.m134729X(this.f275048g), C102236a0.m134717L(this.f275048g), C102236a0.m134745g0(this.f275048g));
                        }
                        boolean k = C86013q1.m106450k(this.f275047f + C102236a0.m134729X(this.f275048g));
                        boolean k2 = C86013q1.m106450k(this.f275047f + C102236a0.m134717L(this.f275048g));
                        boolean k3 = C86013q1.m106450k(this.f275047f + C102236a0.m134745g0(this.f275048g));
                        C92714n p = C102236a0.m134762p(this.f275046e);
                        this.f275045d = p;
                        if (p == null) {
                            Log.m105925i("MicroMsg.ImageLoader", "error path %s", this.f275046e);
                            String g0 = C102236a0.m134745g0(this.f275048g);
                            this.f275045d = C92084a.m115750b(this.f275047f + g0, this.f275046e);
                            boolean k4 = C86013q1.m106450k(this.f275046e);
                            Log.m105924i("MicroMsg.ImageLoader", "abc a" + k + " b" + k2 + " c" + k3 + " d" + k4);
                        }
                    } else if (i == 4) {
                        C92714n p2 = C102236a0.m134762p(this.f275046e);
                        this.f275045d = p2;
                        if (p2 == null) {
                            Log.m105925i("MicroMsg.ImageLoader", "error path %s", this.f275046e);
                            String X = C102236a0.m134729X(this.f275048g);
                            this.f275045d = C92084a.m115750b(this.f275047f + X, this.f275046e);
                        }
                    } else {
                        this.f275045d = C102236a0.m134758n(this.f275046e);
                    }
                    long ticksToNow = Util.ticksToNow(currentTicks);
                    int l = (int) C86013q1.m106451l(this.f275046e);
                    C94901o oVar5 = C94901o.this;
                    SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                    long j = oVar5.f274996b;
                    SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                    if (Util.ticksToNow(j) > 60000) {
                        C115669n nVar = C115669n.INSTANCE;
                        Object[] objArr2 = new Object[6];
                        objArr2[0] = 4;
                        objArr2[1] = Long.valueOf(ticksToNow);
                        objArr2[2] = Integer.valueOf(l);
                        objArr2[3] = Thread.currentThread().getName();
                        C94866e1.Ex0();
                        objArr2[4] = "";
                        Object[] objArr3 = objArr2;
                        objArr3[5] = C112760b.m154230f0();
                        nVar.mo160131h(11696, objArr3);
                        C94901o oVar6 = C94901o.this;
                        long currentTicks2 = Util.currentTicks();
                        SnsMethodCalculate.markStartTimeMs("access$1402", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                        oVar6.f274996b = currentTicks2;
                        SnsMethodCalculate.markEndTimeMs("access$1402", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                    }
                    if (this.f275045d == null) {
                        Log.m105921e("MicroMsg.ImageLoader", "[%s][media:%s] ImageLoader doInBackground bm get fail and delete it", "[image-flow]", mo131155g());
                        C86013q1.m106447h(this.f275047f + C102236a0.m134745g0(this.f275048g));
                        C86013q1.m106447h(this.f275046e);
                        C115669n.INSTANCE.idkeyStat(150, 2, 1, true);
                    }
                    C115669n nVar2 = C115669n.INSTANCE;
                    nVar2.idkeyStat(150, 0, 1, true);
                    nVar2.idkeyStat(150, 1, System.currentTimeMillis() - currentTimeMillis, true);
                    Object[] objArr4 = new Object[6];
                    objArr4[0] = "[image-flow]";
                    objArr4[1] = mo131155g();
                    if (this.f275045d != null) {
                        z = true;
                    }
                    objArr4[2] = Boolean.valueOf(z);
                    objArr4[3] = this.f275046e;
                    objArr4[4] = Integer.valueOf(l);
                    objArr4[5] = Long.valueOf(Util.ticksToNow(currentTicks));
                    Log.m105925i("MicroMsg.ImageLoader", "[%s][media:%s] ImageLoader end doInBackground bm exist:%s path:%s filesize:%s cost:%d", objArr4);
                    bool = Boolean.TRUE;
                    SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
                }
            } else {
                Log.m105921e("MicroMsg.ImageLoader", "[%s][media:%s] ImageLoader doInBackground stop for not run! path:%s", "[image-flow]", mo131155g(), this.f275046e);
                String g = mo131155g();
                C99181f fVar = C99181f.f290857a;
                SnsMethodCalculate.markStartTimeMs("cancelImageLoadByFling", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                C87412m.m108594g(g, "mediaId");
                C61926c.m72661F("SnsImageLoadReporter", new C99188h(g));
                SnsMethodCalculate.markEndTimeMs("cancelImageLoadByFling", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                bool = Boolean.FALSE;
                SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
            }
            SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
            return bool;
        }

        /* renamed from: b */
        public ExecutorService mo131152b() {
            SnsMethodCalculate.markStartTimeMs("getExecutor", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
            ExecutorService Cx0 = C94866e1.Cx0();
            SnsMethodCalculate.markEndTimeMs("getExecutor", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
            return Cx0;
        }

        /* renamed from: c */
        public void mo131153c(Object obj) {
            SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
            SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
            super.mo131153c((Boolean) obj);
            SnsMethodCalculate.markStartTimeMs("access$1210", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            C94901o.f274994y--;
            SnsMethodCalculate.markEndTimeMs("access$1210", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            ((HashSet) C94901o.this.f275018x).remove(this.f275044c);
            if (this.f275048g != null) {
                Log.m105925i("MicroMsg.ImageLoader", "[%s][media:%s] ImageLoader onPostExecute start1", "[image-flow]", mo131155g());
                String str = this.f275048g.f298689d;
                int size = C94901o.m120384b(C94901o.this).size();
                C99181f fVar = C99181f.f290857a;
                SnsMethodCalculate.markStartTimeMs("imageLoaderFinished", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                C87412m.m108594g(str, "mediaId");
                C61926c.m72661F("SnsImageLoadReporter", new C99193m(str, size));
                SnsMethodCalculate.markEndTimeMs("imageLoaderFinished", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
            } else if (this.f275044c.contains("-")) {
                Log.m105925i("MicroMsg.ImageLoader", "[%s][media:%s] ImageLoader onPostExecute start2 key:%s", "[image-flow]", mo131155g(), this.f275044c);
                String str2 = this.f275044c;
                String substring = str2.substring(str2.indexOf("-") + 1);
                int size2 = C94901o.m120384b(C94901o.this).size();
                C99181f fVar2 = C99181f.f290857a;
                SnsMethodCalculate.markStartTimeMs("imageLoaderFinished", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                C87412m.m108594g(substring, "mediaId");
                C61926c.m72661F("SnsImageLoadReporter", new C99193m(substring, size2));
                SnsMethodCalculate.markEndTimeMs("imageLoaderFinished", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
            } else {
                Log.m105925i("MicroMsg.ImageLoader", "[%s][media:%s] ImageLoader onPostExecute start3 key:%s", "[image-flow]", mo131155g(), this.f275044c);
            }
            C94901o.this.mo131126k0(mo131155g(), this.f275044c, this.f275045d);
            C94901o oVar = C94901o.this;
            SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            oVar.f275002h = false;
            SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            C94901o oVar2 = C94901o.this;
            SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            oVar2.mo131120h0();
            SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
            SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
        }

        /* renamed from: f */
        public final void mo131154f(String str, String str2, String str3) {
            SnsMethodCalculate.markStartTimeMs("createUserThumb", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
            C86013q1.m106450k(this.f275047f + str3);
            if (!C86013q1.m106450k(this.f275047f + str)) {
                if (!C86013q1.m106450k(this.f275047f + str2)) {
                    str2 = C102236a0.m134731Z(this.f275048g);
                }
                boolean kD = C100408j0.m131392kD(this.f275047f, str2, str, (float) C94866e1.Ox0());
                if (!kD) {
                    Log.m105925i("MicroMsg.ImageLoader", "delete %s", str2);
                    C86013q1.m106447h(this.f275047f + str2);
                }
                Log.m105925i("MicroMsg.ImageLoader", "createUserThumb %s -> %s, result:%b", this.f275047f + str2, this.f275047f + str, Boolean.valueOf(kD));
            }
            C100408j0.m131393mI(this.f275047f, str, str3, (float) C94866e1.Hx0());
            SnsMethodCalculate.markEndTimeMs("createUserThumb", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
        }

        /* renamed from: g */
        public String mo131155g() {
            SnsMethodCalculate.markStartTimeMs("getMediaId", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
            C101804kv2 kv22 = this.f275048g;
            if (kv22 == null) {
                SnsMethodCalculate.markEndTimeMs("getMediaId", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
                return "";
            }
            String str = kv22.f298689d;
            SnsMethodCalculate.markEndTimeMs("getMediaId", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
            return str;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.o$j */
    public static class C94913j {

        /* renamed from: a */
        public String f275051a;

        /* renamed from: b */
        public int f275052b;

        /* renamed from: c */
        public int f275053c;

        /* renamed from: d */
        public boolean f275054d;

        public C94913j(String str, int i, int i2, boolean z) {
            this.f275051a = str;
            this.f275052b = i;
            this.f275053c = i2;
            this.f275054d = z;
        }

        /* renamed from: a */
        public int mo131156a() {
            SnsMethodCalculate.markStartTimeMs("getCode", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$MMPair");
            int i = this.f275052b;
            SnsMethodCalculate.markEndTimeMs("getCode", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$MMPair");
            return i;
        }

        public boolean equals(Object obj) {
            SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$MMPair");
            boolean z = false;
            if (obj != null && obj.hashCode() == this.f275052b) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$MMPair");
            return z;
        }

        public int hashCode() {
            SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$MMPair");
            int i = this.f275052b;
            SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$MMPair");
            return i;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.o$k */
    public interface C94914k {
        /* renamed from: a */
        void mo131159a(Bitmap bitmap, String str);
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.o$l */
    public interface C94915l {
        /* renamed from: a */
        void mo131160a(Bitmap bitmap);
    }

    public C94901o() {
        new ConcurrentHashMap();
        this.f275001g = new LinkedList<>();
        this.f275002h = false;
        this.f275003i = new CopyOnWriteArraySet<>();
        this.f275004j = new HashMap<>();
        this.f275005k = 4;
        this.f275007m = true;
        this.f275008n = 0;
        this.f275009o = 0;
        this.f275010p = 0;
        this.f275011q = 0;
        this.f275012r = new HashMap<>();
        this.f275013s = new HashMap<>();
        this.f275014t = new HashMap<>();
        this.f275015u = 0;
        this.f275016v = 0;
        this.f275017w = new HashMap<>();
        this.f275018x = new HashSet();
        C100301b.f293824j.put(C92714n.class, new C94907d(this));
        int largeMemoryClass = ((ActivityManager) MMApplicationContext.getContext().getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getLargeMemoryClass();
        Log.m105925i("MicroMsg.LazyerImageLoader2", "BitmapPool %dMB", Integer.valueOf(largeMemoryClass));
        this.f274997c = new C100301b<>(largeMemoryClass > 256 ? 62914560 : 31457280, new C94908e(this), C94901o.class);
        SnsMethodCalculate.markStartTimeMs("resetSnsBig", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        this.f274998d = new C94917o1<>(this.f275005k, new C94940r(this));
        SnsMethodCalculate.markEndTimeMs("resetSnsBig", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00e3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m120383a(com.tencent.p014mm.plugin.sns.model.C94901o r21, int r22, te3.C101804kv2 r23, boolean r24) {
        /*
            r1 = r21
            r3 = r22
            r2 = r23
            java.lang.String r6 = "access$300"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.model.LazyerImageLoader2"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
            r21.getClass()
            java.lang.String r8 = "pushToImageLoader"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r7)
            r9 = 1
            r0 = 0
            if (r2 != 0) goto L_0x0021
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r7)
        L_0x001d:
            r15 = r6
        L_0x001e:
            r9 = 0
            goto L_0x027e
        L_0x0021:
            boolean r4 = r2.f298681N
            r5 = 6
            java.lang.Object[] r10 = new java.lang.Object[r5]
            java.lang.String r11 = "[image-flow]"
            r10[r0] = r11
            java.lang.String r12 = r2.f298689d
            r10[r9] = r12
            boolean r12 = r1.f275007m
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            r13 = 2
            r10[r13] = r12
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r4)
            r14 = 3
            r10[r14] = r12
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r24)
            r15 = 4
            r10[r15] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r22)
            r5 = 5
            r10[r5] = r12
            java.lang.String r12 = "MicroMsg.LazyerImageLoader2"
            java.lang.String r14 = "[%s][media:%s] pushToImageLoader isRun:%b isAd:%b checkCache:%b decodeType:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r14, r10)
            boolean r10 = r1.f275007m
            if (r10 != 0) goto L_0x006c
            if (r4 != 0) goto L_0x006c
            if (r24 != 0) goto L_0x006c
            java.lang.Object[] r1 = new java.lang.Object[r13]
            r1[r0] = r11
            java.lang.String r2 = r2.f298689d
            r1[r9] = r2
            java.lang.String r2 = "[%s][media:%s] end pushToImageLoader for is not run"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r2, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r7)
            goto L_0x001d
        L_0x006c:
            java.lang.String r4 = com.tencent.p014mm.plugin.sns.model.C94866e1.m120262YO()
            java.lang.String r10 = r2.f298689d
            java.lang.String r4 = com.tencent.p014mm.plugin.sns.model.C94938q1.m120518e(r4, r10)
            if (r3 != r15) goto L_0x007d
            java.lang.String r10 = vr2.C102236a0.m134720O(r23)
            goto L_0x0097
        L_0x007d:
            if (r3 != r5) goto L_0x0084
            java.lang.String r10 = vr2.C102236a0.m134719N(r23)
            goto L_0x0097
        L_0x0084:
            if (r3 != 0) goto L_0x008b
            java.lang.String r10 = vr2.C102236a0.m134745g0(r23)
            goto L_0x0097
        L_0x008b:
            r10 = 3
            if (r3 != r10) goto L_0x0093
            java.lang.String r10 = vr2.C102236a0.m134717L(r23)
            goto L_0x0097
        L_0x0093:
            java.lang.String r10 = vr2.C102236a0.m134729X(r23)
        L_0x0097:
            java.lang.String r14 = vr2.C102236a0.m134729X(r23)
            java.lang.String r15 = r2.f298689d
            java.util.HashSet<java.lang.String> r16 = es2.C97696c.f286585l
            java.lang.String r0 = "isRunning"
            java.lang.String r13 = "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r13)
            java.util.HashSet<java.lang.String> r5 = es2.C97696c.f286585l
            java.lang.String r3 = vr2.C102236a0.m134714I(r9, r15)
            boolean r3 = r5.contains(r3)
            if (r3 == 0) goto L_0x00b7
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r13)
            goto L_0x00c7
        L_0x00b7:
            java.util.HashSet<java.lang.String> r3 = es2.C97696c.f286585l
            r5 = 5
            java.lang.String r15 = vr2.C102236a0.m134714I(r5, r15)
            boolean r3 = r3.contains(r15)
            if (r3 == 0) goto L_0x00c9
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r13)
        L_0x00c7:
            r0 = 1
            goto L_0x00cd
        L_0x00c9:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r13)
            r0 = 0
        L_0x00cd:
            if (r0 == 0) goto L_0x00e3
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r3 = 0
            r0[r3] = r11
            java.lang.String r1 = r2.f298689d
            r0[r9] = r1
            java.lang.String r1 = "[%s][media:%s] end pushToImageLoader for already in queue"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r1, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r7)
            goto L_0x001d
        L_0x00e3:
            r0 = 4
            r3 = 0
            java.lang.Object[] r5 = new java.lang.Object[r0]
            r5[r3] = r11
            java.lang.String r0 = r2.f298689d
            r5[r9] = r0
            r0 = 2
            r5[r0] = r14
            r0 = 3
            r5[r0] = r10
            java.lang.String r0 = "[%s][media:%s] start pushToImageLoader1 srcFilename:%s, filename:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r0, r5)
            long r17 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r5 = r10
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r17)
            r17 = 100
            java.lang.String r0 = ""
            int r3 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r3 <= 0) goto L_0x0148
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r15 = "fileexist check endtime "
            r3.append(r15)
            r3.append(r9)
            java.lang.String r15 = " "
            r3.append(r15)
            java.lang.Thread r17 = java.lang.Thread.currentThread()
            java.lang.String r13 = r17.getName()
            r3.append(r13)
            r3.append(r15)
            java.lang.String r13 = a70.C112760b.m154230f0()
            r3.append(r13)
            r3.append(r15)
            com.tencent.p014mm.plugin.sns.model.C94866e1.Ex0()
            r3.append(r0)
            r3.append(r15)
            java.lang.String r13 = r2.f298689d
            r3.append(r13)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r3)
        L_0x0148:
            r17 = r5
            r15 = r6
            long r5 = r1.f274995a
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r5)
            r19 = 60000(0xea60, double:2.9644E-319)
            int r3 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r3 <= 0) goto L_0x0196
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r5 = 6
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r5 = 1
            java.lang.Integer r13 = java.lang.Integer.valueOf(r5)
            r16 = 0
            r6[r16] = r13
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r6[r5] = r9
            java.lang.Integer r5 = java.lang.Integer.valueOf(r16)
            r9 = 2
            r6[r9] = r5
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            java.lang.String r5 = r5.getName()
            r9 = 3
            r6[r9] = r5
            com.tencent.p014mm.plugin.sns.model.C94866e1.Ex0()
            r5 = 4
            r6[r5] = r0
            java.lang.String r0 = a70.C112760b.m154230f0()
            r5 = 5
            r6[r5] = r0
            r0 = 11696(0x2db0, float:1.639E-41)
            r3.mo160131h(r0, r6)
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r1.f274995a = r5
        L_0x0196:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            java.lang.String r5 = vr2.C102236a0.m134717L(r23)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r6 = vr2.C102236a0.m134731Z(r23)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r9 = vr2.C102236a0.m134739d0(r23)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            r9 = 6
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r10 = 0
            r9[r10] = r11
            java.lang.String r10 = r2.f298689d
            r13 = 1
            r9[r13] = r10
            r10 = 2
            r9[r10] = r0
            r10 = 3
            r9[r10] = r3
            r10 = 4
            r9[r10] = r5
            r10 = 5
            r9[r10] = r6
            java.lang.String r10 = "[%s][media:%s] start pushToImageLoader2 check fileExist %s %s %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r10, r9)
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r0 != 0) goto L_0x0228
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r3)
            if (r0 != 0) goto L_0x0228
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r5)
            if (r0 != 0) goto L_0x0228
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r6)
            if (r0 == 0) goto L_0x0213
            goto L_0x0228
        L_0x0213:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r11
            java.lang.String r1 = r2.f298689d
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "[%s][media:%s] start pushToImageLoader3 all file not exist"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r1, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r7)
            goto L_0x001e
        L_0x0228:
            r0 = 4
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r0 = 0
            r3[r0] = r11
            java.lang.String r0 = r2.f298689d
            r5 = 1
            r3[r5] = r0
            boolean r0 = r1.f275007m
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5 = 2
            r3[r5] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r24)
            r6 = 3
            r3[r6] = r0
            java.lang.String r0 = "[%s][media:%s] start pushToImageLoader3 fileExist and isRun:%s, checkCache:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r0, r3)
            java.lang.String r9 = "pushToImageLoaderImpl"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r7)
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r3 = 0
            r0[r3] = r11
            java.lang.String r3 = r2.f298689d
            r10 = 1
            r0[r10] = r3
            r0[r5] = r4
            r0[r6] = r17
            java.lang.String r3 = "[%s][media:%s] start pushToImageLoaderImpl fileExist cntPath:%s, filename:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r3, r0)
            com.tencent.mm.sdk.platformtools.MMHandler r6 = com.tencent.p014mm.plugin.sns.model.C94866e1.ly0()
            com.tencent.mm.plugin.sns.model.u r11 = new com.tencent.mm.plugin.sns.model.u
            r0 = r11
            r1 = r21
            r2 = r23
            r3 = r22
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            r6.post(r11)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r7)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r7)
            r9 = 1
        L_0x027e:
            r0 = r15
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C94901o.m120383a(com.tencent.mm.plugin.sns.model.o, int, te3.kv2, boolean):boolean");
    }

    /* renamed from: b */
    public static /* synthetic */ LinkedList m120384b(C94901o oVar) {
        SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        LinkedList<C94912i> linkedList = oVar.f275001g;
        SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return linkedList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x007e, code lost:
        if (com.tencent.p014mm.vfs.C86013q1.m106450k(r6) != false) goto L_0x00b4;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m120385m(te3.C101804kv2 r6) {
        /*
            java.lang.String r0 = "getSnsDirectPath"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.LazyerImageLoader2"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            if (r6 != 0) goto L_0x000e
            r6 = 0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r6
        L_0x000e:
            java.lang.String r2 = r6.f298689d
            java.lang.String r3 = "pre_temp_sns_pic"
            boolean r2 = r2.startsWith(r3)
            if (r2 == 0) goto L_0x0030
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = com.tencent.p014mm.plugin.sns.model.C94866e1.m120263iU()
            r2.append(r3)
            java.lang.String r6 = r6.f298689d
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            goto L_0x00b4
        L_0x0030:
            java.lang.String r2 = r6.f298689d
            java.lang.String r3 = "Locall_path"
            boolean r2 = r2.startsWith(r3)
            if (r2 == 0) goto L_0x0083
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = com.tencent.p014mm.plugin.sns.model.C94866e1.m120262YO()
            java.lang.String r4 = r6.f298689d
            java.lang.String r3 = com.tencent.p014mm.plugin.sns.model.C94938q1.m120518e(r3, r4)
            r2.append(r3)
            java.lang.String r3 = vr2.C102236a0.m134731Z(r6)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)
            if (r3 != 0) goto L_0x0081
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = com.tencent.p014mm.plugin.sns.model.C94866e1.m120262YO()
            java.lang.String r5 = r6.f298689d
            java.lang.String r4 = com.tencent.p014mm.plugin.sns.model.C94938q1.m120518e(r4, r5)
            r3.append(r4)
            java.lang.String r6 = vr2.C102236a0.m134729X(r6)
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r6)
            if (r3 == 0) goto L_0x0081
            goto L_0x00b4
        L_0x0081:
            r6 = r2
            goto L_0x00b4
        L_0x0083:
            java.lang.String r2 = r6.f298689d
            java.lang.String r3 = "pre_temp_extend_pic"
            boolean r2 = r2.startsWith(r3)
            if (r2 == 0) goto L_0x0097
            java.lang.String r6 = r6.f298689d
            r2 = 19
            java.lang.String r6 = r6.substring(r2)
            goto L_0x00b4
        L_0x0097:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = com.tencent.p014mm.plugin.sns.model.C94866e1.m120262YO()
            java.lang.String r4 = r6.f298689d
            java.lang.String r3 = com.tencent.p014mm.plugin.sns.model.C94938q1.m120518e(r3, r4)
            r2.append(r3)
            java.lang.String r6 = vr2.C102236a0.m134722Q(r6)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
        L_0x00b4:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C94901o.m120385m(te3.kv2):java.lang.String");
    }

    /* renamed from: o */
    public static String m120386o(C101804kv2 kv22) {
        SnsMethodCalculate.markStartTimeMs("getSnsDirectThumbPath", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        String str = C94938q1.m120518e(C94866e1.m120262YO(), kv22.f298689d) + C102236a0.m134729X(kv22);
        SnsMethodCalculate.markEndTimeMs("getSnsDirectThumbPath", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return str;
    }

    /* renamed from: A */
    public final boolean mo131081A(String str, int i) {
        SnsMethodCalculate.markStartTimeMs("parseInfoXml", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        Map<String, String> parseXml = XmlParser.parseXml(str, "SightDownloadControl", (String) null);
        boolean z = true;
        if (parseXml == null || parseXml.isEmpty()) {
            SnsMethodCalculate.markEndTimeMs("parseInfoXml", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return true;
        } else if (i == 1) {
            if (Util.getInt(parseXml.get(".SightDownloadControl.G3PlusAutoDownload"), 0) != 1) {
                z = false;
            }
            SnsMethodCalculate.markEndTimeMs("parseInfoXml", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return z;
        } else {
            if (Util.getInt(parseXml.get(".SightDownloadControl.WifiAutoDownload"), 0) != 1) {
                z = false;
            }
            SnsMethodCalculate.markEndTimeMs("parseInfoXml", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return z;
        }
    }

    /* renamed from: B */
    public void mo131082B() {
        SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        Log.printInfoStack("MicroMsg.LazyerImageLoader2", "%s download queue set pause", "[image-flow]");
        this.f275007m = false;
        C94853e Vx0 = C94866e1.Vx0();
        Vx0.getClass();
        SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.model.DownloadManager");
        Vx0.f274822i = false;
        Vx0.mo130990o();
        SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.model.DownloadManager");
        SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    /* renamed from: C */
    public String mo131083C(SnsInfo snsInfo, C101804kv2 kv22, C96983o3 o3Var, boolean z) {
        String str;
        SnsMethodCalculate.markStartTimeMs("pushSightLoader", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (mo131143z(kv22)) {
            SnsMethodCalculate.markEndTimeMs("pushSightLoader", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return "";
        }
        String e = C94938q1.m120518e(C94866e1.m120262YO(), kv22.f298689d);
        String T = C102236a0.m134725T(kv22);
        if (C86013q1.m106450k(e + T)) {
            String str2 = e + T;
            SnsMethodCalculate.markEndTimeMs("pushSightLoader", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return str2;
        }
        if (C86013q1.m106450k(e + C102236a0.m134735b0(kv22)) && (str = kv22.f298689d) != null && str.startsWith("Locall_path")) {
            String str3 = e + C102236a0.m134735b0(kv22);
            SnsMethodCalculate.markEndTimeMs("pushSightLoader", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return str3;
        } else if (!this.f275007m) {
            SnsMethodCalculate.markEndTimeMs("pushSightLoader", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return "";
        } else {
            Log.m105924i("MicroMsg.LazyerImageLoader2", "push sight loader " + kv22.f298689d + " url: " + kv22.f298692g);
            if (!z) {
                Log.m105924i("MicroMsg.LazyerImageLoader2", "do no auto download sns sight.");
            } else if (mo131133p(snsInfo) == 5) {
                C94866e1.ly0().postDelayed(new C94902a(this, kv22, o3Var), 0);
            }
            SnsMethodCalculate.markEndTimeMs("pushSightLoader", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return "";
        }
    }

    /* renamed from: D */
    public boolean mo131084D(int i, C101804kv2 kv22, C96983o3 o3Var) {
        SnsMethodCalculate.markStartTimeMs("pushToImageLoaderUi", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (kv22 == null) {
            SnsMethodCalculate.markEndTimeMs("pushToImageLoaderUi", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return false;
        }
        boolean z = kv22.f298681N;
        Log.m105925i("MicroMsg.LazyerImageLoader2", "[%s][media:%s] begin pushToImageLoaderUi isRun:%b isAd:%b", "[image-flow]", kv22.f298689d, Boolean.valueOf(this.f275007m), Boolean.valueOf(z));
        if (this.f275007m || z) {
            C94866e1.ky0().execute(new C94910g(kv22, i, o3Var));
            SnsMethodCalculate.markEndTimeMs("pushToImageLoaderUi", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return true;
        }
        Log.m105921e("MicroMsg.LazyerImageLoader2", "[%s][media:%s] end pushToImageLoaderUi for is not run", "[image-flow]", kv22.f298689d);
        if (!Util.isNullOrNil(kv22.f298689d)) {
            C94866e1.Vx0().mo130999x(kv22.f298689d);
        }
        String str = kv22.f298689d;
        C99181f fVar = C99181f.f290857a;
        SnsMethodCalculate.markStartTimeMs("cancelImageLoadByFling", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        C87412m.m108594g(str, "mediaId");
        C61926c.m72661F("SnsImageLoadReporter", new C99188h(str));
        SnsMethodCalculate.markEndTimeMs("cancelImageLoadByFling", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        SnsMethodCalculate.markEndTimeMs("pushToImageLoaderUi", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return false;
    }

    /* renamed from: E */
    public boolean mo131085E(String str, C92714n nVar, int i) {
        SnsMethodCalculate.markStartTimeMs("putCacheUI", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        mo131087G(i + "-" + str, nVar);
        SnsMethodCalculate.markEndTimeMs("putCacheUI", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: F */
    public boolean mo131086F(String str, String str2) {
        Object obj;
        SnsMethodCalculate.markStartTimeMs("putSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        SnsMethodCalculate.markStartTimeMs("cleanLoadBarState", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (this.f275004j.containsKey(str) && 3 == this.f275004j.get(str).intValue()) {
            this.f275004j.remove(str);
        }
        SnsMethodCalculate.markEndTimeMs("cleanLoadBarState", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        String y = C102236a0.m134780y(1, str);
        Log.m105924i("MicroMsg.LazyerImageLoader2", "TimeLineAdPreloadHelper, download video complete, mediaId=" + str + ", path=" + str2);
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((ConcurrentHashMap) this.f275000f).get(y);
        C98985g.C98988c cVar = new C98985g.C98988c(str, str2, C98985g.C98986a.RESULT_STATE_COMPLETE);
        C98985g gVar = C98985g.f290230a;
        SnsMethodCalculate.markStartTimeMs("setVideoDownloadValue", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
        Set<String> set = C98985g.f290234e;
        synchronized (set) {
            try {
                boolean contains = set.contains(str);
                if (contains) {
                    C98985g.m128892c(str).setValue(cVar);
                }
                Log.m105918d("AdMediaDownloadHelper", "setVideoDownloadValue() called with: mediaId = " + str + ", contains = " + contains);
                C13598b0 b0Var = C13598b0.f38549a;
            } catch (Throwable th) {
                SnsMethodCalculate.markEndTimeMs("setVideoDownloadValue", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
                throw th;
            }
        }
        SnsMethodCalculate.markEndTimeMs("setVideoDownloadValue", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
        if (copyOnWriteArrayList == null) {
            SnsMethodCalculate.markEndTimeMs("putSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return false;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C94913j jVar = (C94913j) ((WeakReference) it.next()).get();
            if (!(jVar == null || !jVar.f275054d || y == null)) {
                SnsMethodCalculate.markStartTimeMs("getId", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$MMPair");
                String str3 = jVar.f275051a;
                SnsMethodCalculate.markEndTimeMs("getId", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$MMPair");
                if (y.equals(str3)) {
                    int a = jVar.mo131156a();
                    WeakReference weakReference = (WeakReference) ((ConcurrentHashMap) this.f274999e).get(Integer.valueOf(a));
                    if (!(weakReference == null || (obj = weakReference.get()) == null)) {
                        if (obj instanceof C94571a) {
                            Log.m105925i("MicroMsg.LazyerImageLoader2", "download fin set sight %s %s", str, str2);
                            C94571a aVar = (C94571a) obj;
                            if (aVar.getTagObject() instanceof C96066m2) {
                                C96066m2 m2Var = (C96066m2) aVar.getTagObject();
                                if (m2Var == null) {
                                    aVar.mo130071b(str2, !this.f275007m, 0);
                                } else if (C86013q1.m106450k(str2)) {
                                    aVar.mo130071b(str2, !this.f275007m, m2Var.f280500c);
                                    aVar.setPosition(m2Var.f280500c);
                                    m2Var.f280507j.setVisibility(8);
                                    m2Var.f280506i.setVisibility(8);
                                    m2Var.f280508k.setVisibility(8);
                                    mo131111d(str);
                                } else {
                                    mo131093M(str);
                                    m2Var.f280507j.setVisibility(8);
                                    m2Var.f280506i.setImageResource(C0966R.C0969drawable.bqe);
                                    m2Var.f280506i.setVisibility(0);
                                }
                            }
                        } else if (obj instanceof SnsAdTimelineVideoView) {
                            Log.m105925i("MicroMsg.LazyerImageLoader2", "SnsAdTimelineVideoView, download fin set sight %s %s", str, str2);
                            SnsAdTimelineVideoView snsAdTimelineVideoView = (SnsAdTimelineVideoView) obj;
                            if (snsAdTimelineVideoView.getTag() instanceof C96066m2) {
                                C96066m2 m2Var2 = (C96066m2) snsAdTimelineVideoView.getTag();
                                if (m2Var2 == null) {
                                    snsAdTimelineVideoView.setVideoPath(str2);
                                    snsAdTimelineVideoView.setShouldPlayWhenPrepared(true);
                                } else if (C86013q1.m106450k(str2)) {
                                    snsAdTimelineVideoView.setVideoPath(str2);
                                    snsAdTimelineVideoView.setShouldPlayWhenPrepared(true);
                                    m2Var2.f280507j.setVisibility(8);
                                    m2Var2.f280506i.setVisibility(8);
                                    m2Var2.f280508k.setVisibility(8);
                                    mo131111d(str);
                                } else {
                                    mo131093M(str);
                                    m2Var2.f280507j.setVisibility(8);
                                    m2Var2.f280506i.setImageResource(C0966R.C0969drawable.bqe);
                                    m2Var2.f280506i.setVisibility(0);
                                }
                            }
                        }
                    }
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("putSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return true;
    }

    /* renamed from: G */
    public final boolean mo131087G(String str, C92714n nVar) {
        SnsMethodCalculate.markStartTimeMs("putThumbCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (!(nVar == null || str == null)) {
            this.f274997c.put(str, nVar);
            C98985g.m128894e(str, new C98985g.C98987b(str, new WeakReference(nVar), C98985g.C98986a.RESULT_STATE_COMPLETE));
        }
        SnsMethodCalculate.markEndTimeMs("putThumbCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return true;
    }

    /* renamed from: H */
    public final void mo131088H(String str, C101804kv2 kv22, String str2, C96983o3 o3Var, boolean z) {
        C101804kv2 kv23 = kv22;
        C96983o3 o3Var2 = o3Var;
        SnsMethodCalculate.markStartTimeMs("recordStartLoadImage", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        SnsMethodCalculate.markStartTimeMs("getRequestTypeFromMedia", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        int i = kv23.f298690e == 6 ? 5 : 1;
        SnsMethodCalculate.markEndTimeMs("getRequestTypeFromMedia", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        int i2 = z ? 9 : i;
        Log.printInfoStack("MicroMsg.LazyerImageLoader2", "recordStartLoadImage:%s, cacheName:%s, fromScene:%s", kv23.f298689d, str2, o3Var2.f284144a);
        C99181f.m129210p(str, kv23.f298689d, i2, o3Var2.f284144a, true, kv23.f298681N);
        SnsMethodCalculate.markEndTimeMs("recordStartLoadImage", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    /* renamed from: I */
    public void mo131089I(Activity activity) {
        SnsMethodCalculate.markStartTimeMs("removeImageFromCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        Log.m105918d("MicroMsg.LazyerImageLoader2", "try to remove ImageView " + ((ConcurrentHashMap) this.f274999e).size());
        LinkedList<Integer> linkedList = new LinkedList<>();
        Iterator<C94913j> it = this.f275003i.iterator();
        while (it.hasNext()) {
            C94913j next = it.next();
            if (mo131090J(activity.getWindow().getDecorView(), next.mo131156a())) {
                linkedList.add(Integer.valueOf(next.mo131156a()));
            }
        }
        for (Integer intValue : linkedList) {
            int intValue2 = intValue.intValue();
            ((ConcurrentHashMap) this.f274999e).remove(Integer.valueOf(intValue2));
            Iterator<C94913j> it4 = this.f275003i.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                C94913j next2 = it4.next();
                if (next2.mo131156a() == intValue2) {
                    this.f275003i.remove(next2);
                    break;
                }
            }
        }
        linkedList.clear();
        Iterator<C94913j> it5 = this.f275003i.iterator();
        while (it5.hasNext()) {
            C94913j next3 = it5.next();
            if (next3.f275053c == activity.hashCode()) {
                linkedList.add(Integer.valueOf(next3.mo131156a()));
            }
        }
        for (Integer intValue3 : linkedList) {
            int intValue4 = intValue3.intValue();
            ((ConcurrentHashMap) this.f274999e).remove(Integer.valueOf(intValue4));
            Iterator<C94913j> it6 = this.f275003i.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                C94913j next4 = it6.next();
                if (next4.mo131156a() == intValue4) {
                    this.f275003i.remove(next4);
                    break;
                }
            }
        }
        this.f274998d.mo131178a();
        Log.m105918d("MicroMsg.LazyerImageLoader2", "after try to remove ImageView " + ((ConcurrentHashMap) this.f274999e).size());
        SnsMethodCalculate.markEndTimeMs("removeImageFromCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    /* renamed from: J */
    public final boolean mo131090J(View view, int i) {
        SnsMethodCalculate.markStartTimeMs("removeImageIvInParis", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (view.hashCode() == i) {
            SnsMethodCalculate.markEndTimeMs("removeImageIvInParis", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            do {
                childCount--;
                if (childCount >= 0) {
                }
            } while (!mo131090J(viewGroup.getChildAt(childCount), i));
            SnsMethodCalculate.markEndTimeMs("removeImageIvInParis", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("removeImageIvInParis", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return false;
    }

    /* renamed from: K */
    public void mo131091K(View view) {
        SnsMethodCalculate.markStartTimeMs("removeImageViewFromCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (view instanceof ImageView) {
            ((ImageView) view).setImageBitmap((Bitmap) null);
            SnsMethodCalculate.markEndTimeMs("removeImageViewFromCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        } else if (view instanceof QImageView) {
            ((QImageView) view).setImageBitmap((Bitmap) null);
            SnsMethodCalculate.markEndTimeMs("removeImageViewFromCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        } else {
            SnsMethodCalculate.markEndTimeMs("removeImageViewFromCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        }
    }

    /* renamed from: L */
    public boolean mo131092L(View view) {
        SnsMethodCalculate.markStartTimeMs("removeImageViewToKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        int hashCode = view.hashCode();
        Iterator<C94913j> it = this.f275003i.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C94913j next = it.next();
            if (hashCode == next.mo131156a()) {
                this.f275003i.remove(next);
                break;
            }
        }
        ((ConcurrentHashMap) this.f274999e).remove(Integer.valueOf(hashCode));
        SnsMethodCalculate.markEndTimeMs("removeImageViewToKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return true;
    }

    /* renamed from: M */
    public void mo131093M(String str) {
        SnsMethodCalculate.markStartTimeMs("setError", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        this.f275004j.put(str, 4);
        SnsMethodCalculate.markEndTimeMs("setError", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    /* renamed from: N */
    public final void mo131094N(Object obj, String str, C92714n nVar, boolean z) {
        SnsMethodCalculate.markStartTimeMs("setImageDrawable", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (obj == null) {
            SnsMethodCalculate.markEndTimeMs("setImageDrawable", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return;
        }
        if (nVar != null) {
            Log.printInfoStack("MicroMsg.LazyerImageLoader2", "setImageDrawable %s %s %s", obj, str, nVar + " " + nVar.f266818d);
        }
        long j = 0;
        if (obj instanceof QFadeImageView) {
            QFadeImageView qFadeImageView = (QFadeImageView) obj;
            Drawable drawable = qFadeImageView.getDrawable();
            if (!Util.isNullOrNil(qFadeImageView.getImageKey()) && qFadeImageView.getImageKey().equals(str)) {
                j = qFadeImageView.getStartTimeMillis();
            }
            if (drawable != null && (drawable instanceof C94894m1)) {
                j = ((C94894m1) drawable).mo131076c();
            }
            C94894m1 m1Var = new C94894m1(str, nVar, j);
            qFadeImageView.f285487H = m1Var.mo131076c();
            qFadeImageView.f285488I = str;
            qFadeImageView.setImageDrawable(m1Var);
            m1Var.invalidateSelf();
        } else if (obj instanceof QDisFadeImageView) {
            C101364a aVar = new C101364a(str, nVar);
            ((QDisFadeImageView) obj).setImageDrawable(aVar);
            aVar.invalidateSelf();
        } else if (obj instanceof ImageView) {
            ImageView imageView = (ImageView) obj;
            Drawable drawable2 = imageView.getDrawable();
            C94894m1 m1Var2 = (drawable2 == null || !(drawable2 instanceof C94894m1)) ? new C94894m1(str, nVar, 0) : new C94894m1(str, nVar, ((C94894m1) drawable2).mo131076c());
            imageView.setImageDrawable(m1Var2);
            m1Var2.invalidateSelf();
        } else if (obj instanceof C94571a) {
            Log.m105924i("MicroMsg.LazyerImageLoader2", "update sight thumb " + str);
            C94571a aVar2 = (C94571a) obj;
            if (obj instanceof SightPlayImageView) {
                SightPlayImageView sightPlayImageView = (SightPlayImageView) obj;
                Drawable drawable3 = sightPlayImageView.getDrawable();
                C94894m1 m1Var3 = (drawable3 == null || !(drawable3 instanceof C94894m1)) ? new C94894m1(str, nVar, 0) : new C94894m1(str, nVar, ((C94894m1) drawable3).mo131076c());
                sightPlayImageView.setImageDrawable(m1Var3);
                m1Var3.invalidateSelf();
            }
        } else if (obj instanceof SnsAdTimelineVideoView) {
            Log.m105924i("MicroMsg.LazyerImageLoader2", "SnsAdTimelineVideoView, setImageDrawable, key=" + str);
            SnsAdTimelineVideoView snsAdTimelineVideoView = (SnsAdTimelineVideoView) obj;
            Drawable thumbDrawable = snsAdTimelineVideoView.getThumbDrawable();
            C94894m1 m1Var4 = (thumbDrawable == null || !(thumbDrawable instanceof C94894m1)) ? new C94894m1(str, nVar, 0) : new C94894m1(str, nVar, ((C94894m1) thumbDrawable).mo131076c());
            snsAdTimelineVideoView.setThumbDrawable(m1Var4);
            m1Var4.invalidateSelf();
        }
        SnsMethodCalculate.markEndTimeMs("setImageDrawable", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    /* renamed from: O */
    public void mo131095O(View view, int i, int i2, int i3) {
        View view2 = view;
        int i4 = i2;
        SnsMethodCalculate.markStartTimeMs("setImageViewBmp", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        SnsMethodCalculate.markStartTimeMs("updateImageViewToKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        mo131131n0(view, (String) null, true, -1, i3, -1, -1, C94911h.IMG_SCENE_NONE);
        SnsMethodCalculate.markEndTimeMs("updateImageViewToKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (i != -1) {
            view.setBackgroundResource(i);
        }
        if (i4 != -1) {
            if (view2 instanceof QFadeImageView) {
                ((QFadeImageView) view2).setImageResource(i4);
            } else if (view2 instanceof ImageView) {
                ((ImageView) view2).setImageDrawable(C76577a.m92158i(view.getContext(), i4));
            }
        } else if (view2 instanceof QFadeImageView) {
            ((QFadeImageView) view2).setImageDrawable(new ColorDrawable(view.getResources().getColor(C0966R.color.f2930d)));
        } else if (view2 instanceof ImageView) {
            ((ImageView) view2).setImageDrawable(new ColorDrawable(view.getResources().getColor(C0966R.color.f2930d)));
        }
        SnsMethodCalculate.markEndTimeMs("setImageViewBmp", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    /* renamed from: P */
    public boolean mo131096P(SnsInfo snsInfo, C101804kv2 kv22, MaskImageView maskImageView, int i, int i2, int i3, C96983o3 o3Var, boolean z, boolean z2, boolean z3) {
        String str;
        C101804kv2 kv23 = kv22;
        MaskImageView maskImageView2 = maskImageView;
        C96983o3 o3Var2 = o3Var;
        boolean z4 = z;
        SnsMethodCalculate.markStartTimeMs("setImproveSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (!(kv23 == null || (str = kv23.f298689d) == null)) {
            String str2 = "";
            if (!str.equals(str2)) {
                String y = C102236a0.m134780y(1, kv23.f298689d);
                String str3 = y;
                mo131088H(snsInfo.getSnsId(), kv22, y, o3Var, false);
                mo131128l0(maskImageView, str3, true, i, i2);
                String e = C94938q1.m120518e(C94866e1.m120262YO(), kv23.f298689d);
                String X = C102236a0.m134729X(kv22);
                if (!C86013q1.m106450k(e + X)) {
                    C102268v vVar = new C102268v(kv23);
                    vVar.mo141832d(1);
                    vVar.mo141833e(kv23.f298689d);
                    C94866e1.Vx0().mo130979d(kv23, kv23.f298690e == 6 ? 5 : 1, vVar, o3Var2);
                }
                if (z4 && z3) {
                    str2 = mo131083C(snsInfo, kv23, o3Var2, z4);
                }
                String str4 = str3;
                Log.m105925i("MicroMsg.LazyerImageLoader2", "setsight %s sightPath %s isAd %b", str4, str2, Boolean.valueOf(z));
                Bitmap bitmap = null;
                if (Util.isNullOrNil(str2) || mo131143z(kv23)) {
                    Log.m105925i("MicroMsg.LazyerImageLoader2", "sightPath %s", str2);
                    maskImageView2.setTag((Object) null);
                    C92714n i4 = mo131121i(str4, kv23.f298689d);
                    boolean f = C102236a0.m134742f(i4);
                    Log.m105927v("MicroMsg.LazyerImageLoader2", "setsight thumb  %s", Boolean.valueOf(f));
                    if (!f) {
                        if (i == -1) {
                            maskImageView2.setImageBitmap((Bitmap) null);
                        }
                        if (((HashSet) this.f275018x).contains(str4)) {
                            SnsMethodCalculate.markEndTimeMs("setImproveSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                            return false;
                        }
                        boolean D = mo131084D(1, kv23, o3Var2);
                        SnsMethodCalculate.markEndTimeMs("setImproveSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                        return D;
                    }
                    mo131094N(maskImageView2, str4, i4, false);
                    C99181f.m129208m(kv23.f298689d);
                    C99181f.m129209o(kv23.f298689d);
                    SnsMethodCalculate.markEndTimeMs("setImproveSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                    return true;
                }
                if (!str2.equals(maskImageView.getTag())) {
                    if (z2) {
                        bitmap = BitmapUtil.decodeFile(e + X);
                    }
                    maskImageView2.setImageBitmap(bitmap);
                }
                maskImageView2.setTag(str2);
                C99181f.m129208m(kv23.f298689d);
                C99181f.m129209o(kv23.f298689d);
                SnsMethodCalculate.markEndTimeMs("setImproveSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                return true;
            }
        }
        SnsMethodCalculate.markEndTimeMs("setImproveSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return false;
    }

    /* renamed from: Q */
    public void mo131097Q(C101804kv2 kv22) {
        SnsMethodCalculate.markStartTimeMs("setLoadingBar", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        this.f275004j.put(kv22.f298689d, 3);
        SnsMethodCalculate.markEndTimeMs("setLoadingBar", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    /* renamed from: R */
    public void mo131098R(C101804kv2 kv22) {
        SnsMethodCalculate.markStartTimeMs("setShowPlay", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        this.f275004j.put(kv22.f298689d, 1);
        SnsMethodCalculate.markEndTimeMs("setShowPlay", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    /* renamed from: S */
    public void mo131099S(String str, C101804kv2 kv22, View view, int i, int i2, C94911h hVar, C96983o3 o3Var) {
        SnsMethodCalculate.markStartTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        mo131103W(kv22, view, i, i2, hVar, o3Var, str);
        SnsMethodCalculate.markEndTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    /* renamed from: T */
    public void mo131100T(String str, C101804kv2 kv22, View view, int i, C94911h hVar, C96983o3 o3Var) {
        SnsMethodCalculate.markStartTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        mo131099S(str, kv22, view, -1, i, hVar, o3Var);
        SnsMethodCalculate.markEndTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    /* renamed from: U */
    public void mo131101U(String str, C101804kv2 kv22, View view, int i, C96983o3 o3Var) {
        SnsMethodCalculate.markStartTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        mo131103W(kv22, view, -1, i, C94911h.IMG_SCENE_NONE, o3Var, str);
        SnsMethodCalculate.markEndTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    /* renamed from: V */
    public void mo131102V(C101804kv2 kv22, View view, int i, int i2, C94911h hVar, C96983o3 o3Var) {
        SnsMethodCalculate.markStartTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        mo131103W(kv22, view, i, i2, hVar, o3Var, (String) null);
        SnsMethodCalculate.markEndTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    /* renamed from: W */
    public void mo131103W(C101804kv2 kv22, View view, int i, int i2, C94911h hVar, C96983o3 o3Var, String str) {
        String str2;
        C101804kv2 kv23 = kv22;
        View view2 = view;
        SnsMethodCalculate.markStartTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (kv23 == null || (str2 = kv23.f298689d) == null || str2.equals("")) {
            SnsMethodCalculate.markEndTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return;
        }
        view2.setDrawingCacheEnabled(false);
        String y = C102236a0.m134780y(0, kv23.f298689d);
        mo131088H(str, kv22, y, o3Var, false);
        mo131132o0(view, y, true, i, i2, hVar);
        C92714n i3 = mo131121i(y, kv23.f298689d);
        if (!C102236a0.m134742f(i3)) {
            Log.m105918d("MicroMsg.LazyerImageLoader2", "setSnsGrid cache miss");
            if (i == -1) {
                mo131124j0(view2);
            }
            if (((HashSet) this.f275018x).contains(y)) {
                Log.m105925i("MicroMsg.LazyerImageLoader2", "%s in hashSet ignore", y);
                SnsMethodCalculate.markEndTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                return;
            }
            mo131084D(0, kv22, o3Var);
        } else {
            Log.m105918d("MicroMsg.LazyerImageLoader2", "setSnsGrid cache hit");
            C94866e1.Vx0().mo130999x(kv23.f298689d);
            mo131094N(view2, y, i3, false);
            C99181f.m129208m(kv23.f298689d);
            C99181f.m129209o(kv23.f298689d);
        }
        SnsMethodCalculate.markEndTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    /* renamed from: X */
    public void mo131104X(C101804kv2 kv22, View view, int i, int i2, C96983o3 o3Var) {
        SnsMethodCalculate.markStartTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        mo131102V(kv22, view, i, i2, C94911h.IMG_SCENE_NONE, o3Var);
        SnsMethodCalculate.markEndTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    /* renamed from: Y */
    public void mo131105Y(C101804kv2 kv22, View view, int i, C96983o3 o3Var) {
        SnsMethodCalculate.markStartTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        mo131104X(kv22, view, -1, i, o3Var);
        SnsMethodCalculate.markEndTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    /* renamed from: Z */
    public void mo131106Z(C101804kv2 kv22, View view, int i, C96983o3 o3Var, String str) {
        SnsMethodCalculate.markStartTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        mo131103W(kv22, view, -1, i, C94911h.IMG_SCENE_NONE, o3Var, str);
        SnsMethodCalculate.markEndTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    /* renamed from: a0 */
    public void mo131107a0(String str, List<C101804kv2> list, View view, int i, C94911h hVar, C96983o3 o3Var, boolean z) {
        String str2;
        List<C101804kv2> list2 = list;
        View view2 = view;
        C96983o3 o3Var2 = o3Var;
        SnsMethodCalculate.markStartTimeMs("setSnsGridList", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (list2 == null || list.size() == 0) {
            SnsMethodCalculate.markEndTimeMs("setSnsGridList", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        } else if (list.size() == 1) {
            if (!z) {
                mo131101U(str, list2.get(0), view, i, o3Var);
            } else {
                C101804kv2 kv22 = list2.get(0);
                C94911h hVar2 = C94911h.IMG_SCENE_SNSUSER;
                SnsMethodCalculate.markStartTimeMs("setSnsBlurGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                if (kv22 == null || (str2 = kv22.f298689d) == null || str2.equals("")) {
                    SnsMethodCalculate.markEndTimeMs("setSnsBlurGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                } else {
                    view2.setDrawingCacheEnabled(false);
                    String y = C102236a0.m134780y(5, kv22.f298689d);
                    String str3 = y;
                    mo131088H(str, kv22, y, o3Var, false);
                    mo131132o0(view, str3, true, -1, i, hVar2);
                    String str4 = str3;
                    C92714n i2 = mo131121i(str4, kv22.f298689d);
                    if (!C102236a0.m134742f(i2)) {
                        mo131124j0(view2);
                        if (((HashSet) this.f275018x).contains(str4)) {
                            SnsMethodCalculate.markEndTimeMs("setSnsBlurGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                        } else {
                            mo131084D(5, kv22, o3Var2);
                        }
                    } else {
                        mo131094N(view2, str4, i2, false);
                        C99181f.m129208m(kv22.f298689d);
                        C99181f.m129209o(kv22.f298689d);
                    }
                    SnsMethodCalculate.markEndTimeMs("setSnsBlurGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                }
            }
            SnsMethodCalculate.markEndTimeMs("setSnsGridList", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        } else {
            String P = C102236a0.m134721P(list);
            String y2 = C102236a0.m134780y(0, P);
            for (C101804kv2 next : list) {
                if (P.contains(next.f298689d)) {
                    mo131088H(str, next, y2, o3Var, false);
                }
            }
            SnsMethodCalculate.markStartTimeMs("updateImageViewToKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            mo131131n0(view, y2, true, -1, i, -1, -1, hVar);
            SnsMethodCalculate.markEndTimeMs("updateImageViewToKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            String str5 = y2;
            C92714n i3 = mo131121i(str5, P);
            boolean f = C102236a0.m134742f(i3);
            Log.m105926v("MicroMsg.LazyerImageLoader2", "set Sns GridList " + f);
            if (!f) {
                mo131124j0(view2);
                if (((HashSet) this.f275018x).contains(str5)) {
                    SnsMethodCalculate.markEndTimeMs("setSnsGridList", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                    return;
                }
                new WeakReference(view2);
                SnsMethodCalculate.markStartTimeMs("pushToImageLoaderUi", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                C94866e1.ky0().execute(new C94946t(this, list, 0, o3Var2));
                SnsMethodCalculate.markEndTimeMs("pushToImageLoaderUi", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            } else {
                List<C101804kv2> list3 = list;
                mo131094N(view2, str5, i3, false);
                for (C101804kv2 next2 : list) {
                    C99181f.m129208m(next2.f298689d);
                    C99181f.m129209o(next2.f298689d);
                }
            }
            SnsMethodCalculate.markEndTimeMs("setSnsGridList", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        }
    }

    /* renamed from: b0 */
    public boolean mo131108b0(C101804kv2 kv22, View view, int i, int i2, C96983o3 o3Var, int i3, String str) {
        String str2;
        C101804kv2 kv23 = kv22;
        View view2 = view;
        int i4 = i3;
        SnsMethodCalculate.markStartTimeMs("setSnsImage", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (kv23 == null || (str2 = kv23.f298689d) == null || str2.equals("")) {
            SnsMethodCalculate.markEndTimeMs("setSnsImage", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return false;
        }
        String y = C102236a0.m134780y(i4, kv23.f298689d);
        mo131088H(str, kv22, y, o3Var, false);
        mo131128l0(view, y, true, i, i2);
        C92714n i5 = mo131121i(y, kv23.f298689d);
        boolean f = C102236a0.m134742f(i5);
        boolean z = kv23.f298681N;
        Log.m105925i("MicroMsg.LazyerImageLoader2", "[%s][id:%s][media:%s] setSnsImage ad:%b bmAvailable:%b cacheName:%s isRun:%b", "[image-flow]", str, kv23.f298689d, Boolean.valueOf(z), Boolean.valueOf(f), y, Boolean.valueOf(this.f275007m));
        if (!f) {
            if (i == -1) {
                mo131124j0(view2);
                Log.m105925i("MicroMsg.LazyerImageLoader2", "[%s][id:%s][media:%s] updateDefaultImg", "[image-flow]", str, kv23.f298689d, Boolean.valueOf(z), Boolean.valueOf(f), y, Boolean.valueOf(this.f275007m));
            }
            if (((HashSet) this.f275018x).contains(y)) {
                Log.m105925i("MicroMsg.LazyerImageLoader2", "[%s][id:%s][media:%s] already in hashSet,ignore this", "[image-flow]", str, kv23.f298689d, Boolean.valueOf(z), Boolean.valueOf(f), y, Boolean.valueOf(this.f275007m));
                SnsMethodCalculate.markEndTimeMs("setSnsImage", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                return true;
            }
            boolean D = mo131084D(i4, kv23, o3Var);
            SnsMethodCalculate.markEndTimeMs("setSnsImage", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return D;
        }
        mo131094N(view2, y, i5, false);
        C99181f.m129208m(kv23.f298689d);
        C99181f.m129209o(kv23.f298689d);
        Log.m105925i("MicroMsg.LazyerImageLoader2", "[%s][id:%s][media:%s] loadHitCache", "[image-flow]", str, kv23.f298689d, Boolean.valueOf(z), Boolean.valueOf(f), y, Boolean.valueOf(this.f275007m));
        SnsMethodCalculate.markEndTimeMs("setSnsImage", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return true;
    }

    /* renamed from: c */
    public boolean mo131109c(C102268v vVar, String str) {
        SnsMethodCalculate.markStartTimeMs("addDeocodeElment", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        C101804kv2 kv22 = vVar.mo141830b().get(0);
        int i = 1;
        while (true) {
            if (i >= vVar.mo141830b().size()) {
                break;
            }
            C101804kv2 kv23 = vVar.mo141830b().get(i);
            if (str != null && str.indexOf(kv23.f298689d) >= 0) {
                kv22 = kv23;
                break;
            }
            i++;
        }
        String e = C94938q1.m120518e(C94866e1.m120262YO(), kv22.f298689d);
        String g0 = vVar.mo141829a() == 0 ? C102236a0.m134745g0(kv22) : vVar.mo141829a() == 4 ? C102236a0.m134720O(kv22) : vVar.mo141829a() == 5 ? C102236a0.m134720O(kv22) : vVar.mo141829a() == 3 ? C102236a0.m134717L(kv22) : C102236a0.m134729X(kv22);
        if (!this.f274997c.check(C102236a0.m134780y(vVar.mo141829a(), kv22.f298689d))) {
            String y = C102236a0.m134780y(vVar.mo141829a(), kv22.f298689d);
            C94912i iVar = new C94912i(y, e + g0, e, kv22, vVar.mo141829a());
            if (!((HashSet) this.f275018x).contains(C94912i.m120452e(iVar))) {
                ((HashSet) this.f275018x).add(C94912i.m120452e(iVar));
                Log.m105925i("MicroMsg.LazyerImageLoader2", "addDeocodeElment key:%s, media:%s", C94912i.m120452e(iVar), kv22.f298689d);
                iVar.mo131292d(new String[0]);
            }
        }
        SnsMethodCalculate.markEndTimeMs("addDeocodeElment", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return true;
    }

    /* renamed from: c0 */
    public boolean mo131110c0(SnsInfo snsInfo, C101804kv2 kv22, VideoSightView videoSightView, int i, int i2, int i3, C96983o3 o3Var, boolean z) {
        SnsMethodCalculate.markStartTimeMs("setSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        boolean d0 = mo131112d0(snsInfo, kv22, videoSightView, i, i2, i3, o3Var, z, false);
        SnsMethodCalculate.markEndTimeMs("setSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return d0;
    }

    /* renamed from: d */
    public boolean mo131111d(String str) {
        SnsMethodCalculate.markStartTimeMs("cleanErrorState", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (this.f275004j.containsKey(str) && 4 == this.f275004j.get(str).intValue()) {
            this.f275004j.remove(str);
        }
        SnsMethodCalculate.markEndTimeMs("cleanErrorState", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return true;
    }

    /* renamed from: d0 */
    public boolean mo131112d0(SnsInfo snsInfo, C101804kv2 kv22, VideoSightView videoSightView, int i, int i2, int i3, C96983o3 o3Var, boolean z, boolean z2) {
        String str;
        C101804kv2 kv23 = kv22;
        VideoSightView videoSightView2 = videoSightView;
        C96983o3 o3Var2 = o3Var;
        boolean z3 = z;
        SnsMethodCalculate.markStartTimeMs("setSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        SnsMethodCalculate.markStartTimeMs("setSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        boolean z4 = false;
        if (!(kv23 == null || (str = kv23.f298689d) == null)) {
            String str2 = "";
            if (!str.equals(str2)) {
                String y = C102236a0.m134780y(1, kv23.f298689d);
                String str3 = y;
                mo131088H(snsInfo.getSnsId(), kv22, y, o3Var, false);
                mo131128l0(videoSightView, str3, true, i, i2);
                String e = C94938q1.m120518e(C94866e1.m120262YO(), kv23.f298689d);
                String X = C102236a0.m134729X(kv22);
                if (!C86013q1.m106450k(e + X)) {
                    C102268v vVar = new C102268v(kv23);
                    vVar.mo141832d(1);
                    vVar.mo141833e(kv23.f298689d);
                    C94866e1.Vx0().mo130979d(kv23, kv23.f298690e == 6 ? 5 : 1, vVar, o3Var2);
                }
                if (z3) {
                    str2 = mo131083C(snsInfo, kv23, o3Var2, z3);
                }
                String str4 = str3;
                Log.m105925i("MicroMsg.LazyerImageLoader2", "setsight %s sightPath %s isAd %b", str4, str2, Boolean.valueOf(z));
                Bitmap bitmap = null;
                if (Util.isNullOrNil(str2) || mo131143z(kv23)) {
                    Log.m105925i("MicroMsg.LazyerImageLoader2", "sightPath %s", str2);
                    videoSightView2.setVideoPath((String) null);
                    videoSightView.clear();
                    C92714n i4 = mo131121i(str4, kv23.f298689d);
                    boolean f = C102236a0.m134742f(i4);
                    Log.m105927v("MicroMsg.LazyerImageLoader2", "setsight thumb  %s", Boolean.valueOf(f));
                    if (!f) {
                        if (i == -1) {
                            videoSightView2.setPosition(0);
                            videoSightView2.setThumbBmp((Bitmap) null);
                        }
                        if (((HashSet) this.f275018x).contains(str4)) {
                            SnsMethodCalculate.markEndTimeMs("setSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                        } else {
                            mo131084D(1, kv23, o3Var2);
                            SnsMethodCalculate.markEndTimeMs("setSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                        }
                        SnsMethodCalculate.markEndTimeMs("setSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                        return z4;
                    }
                    mo131094N(videoSightView2, str4, i4, false);
                    C99181f.m129208m(kv23.f298689d);
                    C99181f.m129209o(kv23.f298689d);
                    SnsMethodCalculate.markEndTimeMs("setSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                } else {
                    if (!str2.equals(videoSightView.getVideoPath())) {
                        if (z2) {
                            bitmap = BitmapUtil.decodeFile(e + X);
                        }
                        videoSightView2.setThumbBmp(bitmap);
                    }
                    videoSightView2.setVideoPath(str2);
                    videoSightView2.setPosition(i3);
                    C99181f.m129208m(kv23.f298689d);
                    C99181f.m129209o(kv23.f298689d);
                    SnsMethodCalculate.markEndTimeMs("setSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                }
                z4 = true;
                SnsMethodCalculate.markEndTimeMs("setSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                return z4;
            }
        }
        SnsMethodCalculate.markEndTimeMs("setSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        SnsMethodCalculate.markEndTimeMs("setSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return z4;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    public void mo131113e() {
        SnsMethodCalculate.markStartTimeMs("cleanSnsCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (this.f274997c != null) {
            ((ConcurrentHashMap) this.f274999e).clear();
            C94917o1<String, WeakReference<Bitmap>> o1Var = this.f274998d;
            o1Var.getClass();
            SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.model.SnsLRUMap");
            ((HashMap) o1Var.f275076a).clear();
            SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.model.SnsLRUMap");
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("mMemoryCache \n");
            stringBuffer.append("putCount:" + this.f274997c.putCount() + ";");
            stringBuffer.append("missCount:" + this.f274997c.missCount() + ";");
            stringBuffer.append("hitCount:" + this.f274997c.hitCount() + ";");
            stringBuffer.append("createCount:" + this.f274997c.createCount() + ";");
            stringBuffer.append("evictionCount:" + this.f274997c.evictionCount() + ";");
            Log.m105924i("MicroMsg.LazyerImageLoader2", "report lurcache ");
            this.f274997c.trimToSize(-1);
        }
        C98985g gVar = C98985g.f290230a;
        SnsMethodCalculate.markStartTimeMs("removeAllThumbDownloadChannel", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
        Map<String, C58087u0<C98985g.C98987b>> map = C98985g.f290231b;
        synchronized (map) {
            try {
                Log.m105918d("AdMediaDownloadHelper", "removeAllThumbDownloadChannel() called");
                ((LinkedHashMap) map).clear();
                C13598b0 b0Var = C13598b0.f38549a;
            } catch (Throwable th) {
                SnsMethodCalculate.markEndTimeMs("removeAllThumbDownloadChannel", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
                throw th;
            }
        }
        SnsMethodCalculate.markEndTimeMs("removeAllThumbDownloadChannel", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
        this.f274998d.mo131178a();
        System.gc();
        SnsMethodCalculate.markEndTimeMs("cleanSnsCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    /* renamed from: e0 */
    public boolean mo131114e0(C101804kv2 kv22, View view, int i, int i2, C96983o3 o3Var) {
        SnsMethodCalculate.markStartTimeMs("setSnsThumb", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        boolean b0 = mo131108b0(kv22, view, i, i2, o3Var, 1, (String) null);
        SnsMethodCalculate.markEndTimeMs("setSnsThumb", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return b0;
    }

    /* renamed from: f */
    public boolean mo131115f(SnsAdTimelineVideoView snsAdTimelineVideoView, int i, int i2, int i3) {
        SnsMethodCalculate.markStartTimeMs("cleanSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        mo131128l0(snsAdTimelineVideoView, "", true, i, i2);
        snsAdTimelineVideoView.setThumbBmp((Bitmap) null);
        snsAdTimelineVideoView.mo134051v();
        SnsMethodCalculate.markEndTimeMs("cleanSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return true;
    }

    /* renamed from: f0 */
    public boolean mo131116f0(C101804kv2 kv22, View view, int i, C96983o3 o3Var) {
        SnsMethodCalculate.markStartTimeMs("setSnsThumb", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        boolean e0 = mo131114e0(kv22, view, -1, i, o3Var);
        SnsMethodCalculate.markEndTimeMs("setSnsThumb", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return e0;
    }

    /* renamed from: g */
    public boolean mo131117g(VideoSightView videoSightView, int i, int i2, int i3) {
        SnsMethodCalculate.markStartTimeMs("cleanSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        mo131128l0(videoSightView, "", true, i, i2);
        videoSightView.setThumbBmp((Bitmap) null);
        videoSightView.mo130071b((String) null, false, i3);
        SnsMethodCalculate.markEndTimeMs("cleanSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return true;
    }

    /* renamed from: g0 */
    public void mo131118g0() {
        SnsMethodCalculate.markStartTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        Log.printInfoStack("MicroMsg.LazyerImageLoader2", "%s download queue set start", "[image-flow]");
        this.f275007m = true;
        mo131120h0();
        C94853e Vx0 = C94866e1.Vx0();
        Vx0.getClass();
        SnsMethodCalculate.markStartTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.model.DownloadManager");
        Vx0.f274822i = true;
        Vx0.mo130974A();
        SnsMethodCalculate.markEndTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.model.DownloadManager");
        SnsMethodCalculate.markEndTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    /* renamed from: h */
    public C92714n mo131119h(int i, String str) {
        SnsMethodCalculate.markStartTimeMs("getCacheBm", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        C100301b<C92714n> bVar = this.f274997c;
        if (bVar == null) {
            SnsMethodCalculate.markEndTimeMs("getCacheBm", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return null;
        }
        C92714n l = bVar.get(i + "-" + str);
        SnsMethodCalculate.markEndTimeMs("getCacheBm", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return l;
    }

    /* renamed from: h0 */
    public final boolean mo131120h0() {
        SnsMethodCalculate.markStartTimeMs("tryStart", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (this.f275002h) {
            Log.m105921e("MicroMsg.LazyerImageLoader2", "[%s]already start,ignore start event1", "[image-flow]");
            SnsMethodCalculate.markEndTimeMs("tryStart", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return false;
        }
        C94866e1.ly0().postDelayed(new C94909f(), 0);
        SnsMethodCalculate.markEndTimeMs("tryStart", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return true;
    }

    /* renamed from: i */
    public C92714n mo131121i(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("getCacheSns", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        C92714n l = this.f274997c.get(str);
        if (l == null || l.mo126922e()) {
            this.f274997c.remove(str);
            C98985g.m128893d(str);
            SnsMethodCalculate.markEndTimeMs("getCacheSns", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return null;
        }
        SnsMethodCalculate.markEndTimeMs("getCacheSns", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return l;
    }

    /* renamed from: i0 */
    public void mo131122i0(C101804kv2 kv22) {
        SnsMethodCalculate.markStartTimeMs("unSetShowPlay", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        this.f275004j.put(kv22.f298689d, 2);
        SnsMethodCalculate.markEndTimeMs("unSetShowPlay", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    /* renamed from: j */
    public Bitmap mo131123j(String str, int i, C94914k kVar) {
        SnsMethodCalculate.markStartTimeMs("getCommentEmojiIcon", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        Bitmap a = C102688b.f303300a.mo142498a(str);
        if (a == null) {
            C94866e1.ky0().execute(new C94905c(this, str, kVar));
        }
        SnsMethodCalculate.markEndTimeMs("getCommentEmojiIcon", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return a;
    }

    /* renamed from: j0 */
    public final void mo131124j0(View view) {
        SnsMethodCalculate.markStartTimeMs("updateDefaultImg", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (view instanceof QImageView) {
            ((QImageView) view).setImageDrawable(new ColorDrawable(view.getResources().getColor(C0966R.color.f2930d)));
            SnsMethodCalculate.markEndTimeMs("updateDefaultImg", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        } else if (view instanceof ImageView) {
            ((ImageView) view).setImageDrawable(new ColorDrawable(view.getResources().getColor(C0966R.color.f2930d)));
            SnsMethodCalculate.markEndTimeMs("updateDefaultImg", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        } else {
            SnsMethodCalculate.markEndTimeMs("updateDefaultImg", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        }
    }

    /* renamed from: k */
    public Bitmap mo131125k(String str, String str2, String str3, boolean z, C96983o3 o3Var, String str4, String str5) {
        String str6 = str3;
        SnsMethodCalculate.markStartTimeMs("getSnsBg", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        Bitmap bitmap = null;
        if (z || !Util.isNullOrNil(str)) {
            C101804kv2 h = C91999u.m115562h(str3, 2, str2, str2, 1, 1, "");
            C102236a0.m134780y(2, str6);
            if (str6.equals("")) {
                Bitmap o = C102236a0.m134760o(str);
                if (C102236a0.m134740e(o)) {
                    bitmap = o;
                }
                SnsMethodCalculate.markEndTimeMs("getSnsBg", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                return bitmap;
            } else if (C102236a0.m134740e((Bitmap) null)) {
                SnsMethodCalculate.markEndTimeMs("getSnsBg", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                return null;
            } else {
                String L = C102236a0.m134717L(h);
                Bitmap o2 = C102236a0.m134760o(C94938q1.m120518e(C94866e1.m120262YO(), str6) + L);
                if (!C102236a0.m134740e(o2)) {
                    o2 = C102236a0.m134760o(str);
                }
                if (o2 == null && z && !Util.isNullOrNil(str2)) {
                    C94853e Vx0 = C94866e1.Vx0();
                    Vx0.getClass();
                    SnsMethodCalculate.markStartTimeMs("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager");
                    Vx0.mo130981f(h, 3, (C102268v) null, o3Var, (String) null, str4, str5, 0);
                    SnsMethodCalculate.markEndTimeMs("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager");
                }
                if (!C102236a0.m134740e(o2)) {
                    SnsMethodCalculate.markEndTimeMs("getSnsBg", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                    return null;
                }
                SnsMethodCalculate.markEndTimeMs("getSnsBg", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                return o2;
            }
        } else {
            SnsMethodCalculate.markEndTimeMs("getSnsBg", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01c0 A[SYNTHETIC] */
    /* renamed from: k0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo131126k0(java.lang.String r23, java.lang.String r24, com.tencent.p014mm.memory.C92714n r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            java.lang.String r3 = "updateImageView"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.model.LazyerImageLoader2"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            r5 = 4
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r7 = 0
            java.lang.String r8 = "[image-flow]"
            r6[r7] = r8
            r9 = 1
            r6[r9] = r1
            r10 = 2
            r6[r10] = r2
            boolean r11 = vr2.C102236a0.m134742f(r25)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r12 = 3
            r6[r12] = r11
            java.lang.String r11 = "MicroMsg.LazyerImageLoader2"
            java.lang.String r13 = "[%s][media:%s] ImageLoader updateImageView1 key:%s bm valid:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r13, r6)
            boolean r6 = vr2.C102236a0.m134742f(r25)
            if (r6 != 0) goto L_0x005b
            java.lang.String r6 = "getCacheSns"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r4)
            o90.b<com.tencent.mm.memory.n> r13 = r0.f274997c
            java.lang.Object r13 = r13.get(r2)
            com.tencent.mm.memory.n r13 = (com.tencent.p014mm.memory.C92714n) r13
            if (r13 == 0) goto L_0x004e
            boolean r14 = r13.mo126922e()
            if (r14 == 0) goto L_0x004a
            goto L_0x004e
        L_0x004a:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r4)
            goto L_0x005d
        L_0x004e:
            o90.b<com.tencent.mm.memory.n> r13 = r0.f274997c
            r13.remove(r2)
            jq2.C98985g.m128893d(r24)
            r13 = 0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r4)
            goto L_0x005d
        L_0x005b:
            r13 = r25
        L_0x005d:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r7] = r8
            r5[r9] = r1
            r5[r10] = r2
            boolean r6 = vr2.C102236a0.m134742f(r13)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r5[r12] = r6
            java.lang.String r6 = "[%s][media:%s] ImageLoader updateImageView2 key:%s bm valid:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r6, r5)
            boolean r5 = vr2.C102236a0.m134742f(r13)
            if (r5 == 0) goto L_0x0224
            o90.b<com.tencent.mm.memory.n> r5 = r0.f274997c
            if (r5 == 0) goto L_0x0094
            if (r13 == 0) goto L_0x0094
            if (r2 == 0) goto L_0x0094
            r5.put(r2, r13)
            jq2.g$b r5 = new jq2.g$b
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference
            r6.<init>(r13)
            jq2.g$a r12 = jq2.C98985g.C98986a.RESULT_STATE_COMPLETE
            r5.<init>(r2, r6, r12)
            jq2.C98985g.m128894e(r2, r5)
        L_0x0094:
            java.util.Map<java.lang.String, java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<com.tencent.mm.plugin.sns.model.o$j>>> r5 = r0.f275000f
            java.util.concurrent.ConcurrentHashMap r5 = (java.util.concurrent.ConcurrentHashMap) r5
            java.lang.Object r5 = r5.get(r2)
            java.util.concurrent.CopyOnWriteArrayList r5 = (java.util.concurrent.CopyOnWriteArrayList) r5
            java.lang.String r6 = "SnsImageLoadReporter"
            java.lang.String r12 = "mediaId"
            java.lang.String r14 = "showBitmapFail"
            java.lang.String r15 = "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter"
            if (r5 == 0) goto L_0x01f9
            java.util.Iterator r5 = r5.iterator()
            r16 = 0
        L_0x00b0:
            boolean r17 = r5.hasNext()
            if (r17 == 0) goto L_0x01cd
            java.lang.Object r17 = r5.next()
            java.lang.ref.WeakReference r17 = (java.lang.ref.WeakReference) r17
            java.lang.Object r17 = r17.get()
            r9 = r17
            com.tencent.mm.plugin.sns.model.o$j r9 = (com.tencent.p014mm.plugin.sns.model.C94901o.C94913j) r9
            if (r9 == 0) goto L_0x01b8
            boolean r7 = r9.f275054d
            if (r7 != 0) goto L_0x00cc
            goto L_0x01b8
        L_0x00cc:
            if (r2 == 0) goto L_0x01b8
            java.lang.String r7 = "getId"
            java.lang.String r10 = "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$MMPair"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r10)
            r25 = r5
            java.lang.String r5 = r9.f275051a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r10)
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L_0x01b3
            int r5 = r9.mo131156a()
            java.util.Map<java.lang.Integer, java.lang.ref.WeakReference<java.lang.Object>> r7 = r0.f274999e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.util.concurrent.ConcurrentHashMap r7 = (java.util.concurrent.ConcurrentHashMap) r7
            java.lang.Object r5 = r7.get(r5)
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5
            if (r5 != 0) goto L_0x00f8
            goto L_0x01b3
        L_0x00f8:
            java.lang.Object r5 = r5.get()
            if (r5 != 0) goto L_0x0100
            goto L_0x01b3
        L_0x0100:
            boolean r7 = r5 instanceof com.tencent.p014mm.p136ui.widget.QFadeImageView
            if (r7 == 0) goto L_0x0160
            r7 = r5
            com.tencent.mm.ui.widget.QFadeImageView r7 = (com.tencent.p014mm.p136ui.widget.QFadeImageView) r7
            com.tencent.mm.plugin.sns.ui.e1 r9 = r0.f275006l
            if (r9 == 0) goto L_0x0160
            boolean r9 = r7 instanceof com.tencent.p014mm.plugin.sns.p106ui.TagImageView
            if (r9 == 0) goto L_0x0160
            com.tencent.mm.plugin.sns.ui.TagImageView r7 = (com.tencent.p014mm.plugin.sns.p106ui.TagImageView) r7
            int r7 = r7.getPosition()
            r9 = -1
            if (r7 == r9) goto L_0x0160
            com.tencent.mm.plugin.sns.ui.e1 r10 = r0.f275006l
            com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter r10 = (com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter) r10
            r10.getClass()
            java.lang.String r9 = "isInVis"
            r19 = r3
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r3)
            r20 = r4
            java.lang.String r4 = "getFirstVisiblePosition"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r3)
            r21 = r6
            android.widget.ListView r6 = r10.f278563O
            int r6 = r6.getFirstVisiblePosition()
            r18 = -1
            int r6 = r6 + -1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            if (r7 < r6) goto L_0x0159
            java.lang.String r4 = "getLastVisiblePosition"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r3)
            android.widget.ListView r6 = r10.f278563O
            int r6 = r6.getLastVisiblePosition()
            int r6 = r6 + -1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            if (r7 <= r6) goto L_0x0154
            goto L_0x0159
        L_0x0154:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r3)
            r3 = 1
            goto L_0x015d
        L_0x0159:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r3)
            r3 = 0
        L_0x015d:
            if (r3 != 0) goto L_0x0166
            goto L_0x01c0
        L_0x0160:
            r19 = r3
            r20 = r4
            r21 = r6
        L_0x0166:
            boolean r3 = vr2.C102236a0.m134742f(r13)
            if (r3 == 0) goto L_0x01a4
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r3 = 0
            r4[r3] = r8
            r3 = 1
            r4[r3] = r1
            java.lang.String r3 = "[%s][media:%s] ImageLoader load bitmap Success!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r3, r4)
            java.lang.String r3 = "-"
            java.lang.String[] r3 = r1.split(r3)
            ks2.f r4 = ks2.C99181f.f290857a
            java.lang.String r4 = "showBitmapSuccess"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r15)
            java.lang.String r6 = "mediaIds"
            gy3.C87412m.m108594g(r3, r6)
            int r6 = r3.length
            r7 = 0
        L_0x0190:
            if (r7 >= r6) goto L_0x019a
            r9 = r3[r7]
            ks2.C99181f.m129209o(r9)
            int r7 = r7 + 1
            goto L_0x0190
        L_0x019a:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r15)
            r3 = 1
            r0.mo131094N(r5, r2, r13, r3)
            r16 = 1
            goto L_0x01c0
        L_0x01a4:
            r3 = 1
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r4 = 0
            r5[r4] = r8
            r5[r3] = r1
            java.lang.String r3 = "[%s][media:%s] ImageLoader load bitmap Fail!!! for bitmap recycle"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r3, r5)
            goto L_0x01c0
        L_0x01b3:
            r19 = r3
            r20 = r4
            goto L_0x01be
        L_0x01b8:
            r19 = r3
            r20 = r4
            r25 = r5
        L_0x01be:
            r21 = r6
        L_0x01c0:
            r5 = r25
            r3 = r19
            r4 = r20
            r6 = r21
            r7 = 0
            r9 = 1
            r10 = 2
            goto L_0x00b0
        L_0x01cd:
            r19 = r3
            r20 = r4
            r21 = r6
            if (r16 != 0) goto L_0x021f
            ks2.f r2 = ks2.C99181f.f290857a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r15)
            gy3.C87412m.m108594g(r1, r12)
            ks2.t r2 = new ks2.t
            r2.<init>(r1)
            r3 = r21
            o40.C61926c.m72661F(r3, r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r15)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r4 = 0
            r2[r4] = r8
            r5 = 1
            r2[r5] = r1
            java.lang.String r1 = "[%s][media:%s] ImageLoader updateImageView fail for View null"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r1, r2)
            goto L_0x021f
        L_0x01f9:
            r19 = r3
            r20 = r4
            r3 = r6
            r2 = 2
            r4 = 0
            r5 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r8
            r2[r5] = r1
            java.lang.String r4 = "[%s][media:%s] ImageLoader load bitmap Fail!!! for not found ref"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r4, r2)
            ks2.f r2 = ks2.C99181f.f290857a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r15)
            gy3.C87412m.m108594g(r1, r12)
            ks2.t r2 = new ks2.t
            r2.<init>(r1)
            o40.C61926c.m72661F(r3, r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r15)
        L_0x021f:
            r1 = r19
            r2 = r20
            goto L_0x0226
        L_0x0224:
            r1 = r3
            r2 = r4
        L_0x0226:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C94901o.mo131126k0(java.lang.String, java.lang.String, com.tencent.mm.memory.n):void");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: OO} */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0161, code lost:
        r0 = th;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo131127l(te3.C101804kv2 r16, android.view.View r17, int r18, boolean r19, com.tencent.p014mm.storage.C96983o3 r20, boolean r21, com.tencent.p014mm.plugin.sns.model.C94901o.C94915l r22) {
        /*
            r15 = this;
            r0 = r16
            r11 = r22
            java.lang.String r1 = "getSnsDirect"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.LazyerImageLoader2"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            if (r0 == 0) goto L_0x0163
            java.lang.String r1 = r0.f298689d
            if (r1 == 0) goto L_0x0163
            java.lang.String r2 = ""
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x001b
            goto L_0x0163
        L_0x001b:
            r1 = 3
            java.lang.String r2 = r0.f298689d
            java.lang.String r5 = vr2.C102236a0.m134780y(r1, r2)
            java.lang.String r3 = m120385m(r16)
            com.tencent.mm.plugin.sns.model.e r1 = com.tencent.p014mm.plugin.sns.model.C94866e1.Vx0()
            java.lang.String r2 = r0.f298689d
            r1.getClass()
            java.lang.String r4 = "checkBigMediaIdDownloading"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.model.DownloadManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r6)
            byte[] r4 = r1.f274820g
            monitor-enter(r4)
            java.util.Map<java.lang.String, java.lang.Long> r6 = r1.f274827n     // Catch:{ all -> 0x0156 }
            r7 = 2
            java.lang.String r7 = vr2.C102236a0.m134714I(r7, r2)     // Catch:{ all -> 0x0156 }
            java.util.concurrent.ConcurrentHashMap r6 = (java.util.concurrent.ConcurrentHashMap) r6     // Catch:{ all -> 0x0156 }
            boolean r6 = r6.containsKey(r7)     // Catch:{ all -> 0x0156 }
            r7 = 0
            r8 = 1
            if (r6 != 0) goto L_0x0065
            java.util.Map<java.lang.String, java.lang.Long> r1 = r1.f274827n     // Catch:{ all -> 0x0156 }
            r6 = 8
            java.lang.String r2 = vr2.C102236a0.m134714I(r6, r2)     // Catch:{ all -> 0x0156 }
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1     // Catch:{ all -> 0x0156 }
            boolean r1 = r1.containsKey(r2)     // Catch:{ all -> 0x0156 }
            if (r1 == 0) goto L_0x005b
            goto L_0x0065
        L_0x005b:
            monitor-exit(r4)     // Catch:{ all -> 0x0156 }
            java.lang.String r1 = "checkBigMediaIdDownloading"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.DownloadManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            r1 = 0
            goto L_0x006e
        L_0x0065:
            monitor-exit(r4)     // Catch:{ all -> 0x0156 }
            java.lang.String r1 = "checkBigMediaIdDownloading"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.DownloadManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            r1 = 1
        L_0x006e:
            r2 = 0
            if (r1 == 0) goto L_0x00a3
            java.lang.String r1 = "MicroMsg.LazyerImageLoader2"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "zeus passed download "
            r3.append(r4)
            java.lang.String r0 = r0.f298689d
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)
            r6 = 0
            r7 = -1
            r9 = -1
            r10 = -1
            r3 = r15
            r4 = r17
            r8 = r18
            r3.mo131129m0(r4, r5, r6, r7, r8, r9, r10)
            if (r11 == 0) goto L_0x009b
            r11.mo131160a(r2)
        L_0x009b:
            java.lang.String r0 = "getSnsDirect"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.LazyerImageLoader2"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L_0x00a3:
            r12 = r15
            com.tencent.mm.plugin.sns.model.o1<java.lang.String, java.lang.ref.WeakReference<android.graphics.Bitmap>> r1 = r12.f274998d
            java.lang.String r4 = "getFromWeakReferenceB"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.model.LazyerImageLoader2"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r6)
            r1.getClass()
            java.lang.String r9 = "get"
            java.lang.String r10 = "com.tencent.mm.plugin.sns.model.SnsLRUMap"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r10)
            java.util.Map<K, com.tencent.mm.plugin.sns.model.o1<K, O>$c<O>> r13 = r1.f275076a
            java.util.HashMap r13 = (java.util.HashMap) r13
            java.lang.Object r13 = r13.get(r5)
            com.tencent.mm.plugin.sns.model.o1$c r13 = (com.tencent.p014mm.plugin.sns.model.C94917o1.C94920c) r13
            if (r13 != 0) goto L_0x00c8
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
            r1 = r2
            goto L_0x00da
        L_0x00c8:
            java.util.Map<K, com.tencent.mm.plugin.sns.model.o1<K, O>$c<O>> r1 = r1.f275076a
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r1 = r1.get(r5)
            com.tencent.mm.plugin.sns.model.o1$c r1 = (com.tencent.p014mm.plugin.sns.model.C94917o1.C94920c) r1
            r1.mo131180a()
            OO r1 = r13.f275079a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
        L_0x00da:
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "getFromWeakReference "
            r9.append(r10)
            r9.append(r5)
            java.lang.String r10 = "  "
            r9.append(r10)
            if (r1 != 0) goto L_0x00f1
            r7 = 1
        L_0x00f1:
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            java.lang.String r8 = "MicroMsg.LazyerImageLoader2"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)
            if (r1 != 0) goto L_0x0103
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r6)
            goto L_0x010d
        L_0x0103:
            java.lang.Object r1 = r1.get()
            r2 = r1
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r6)
        L_0x010d:
            boolean r1 = vr2.C102236a0.m134740e(r2)
            if (r1 == 0) goto L_0x0132
            java.lang.String r0 = "MicroMsg.LazyerImageLoader2"
            java.lang.String r1 = "get bmp from cache."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r1)
            r6 = 0
            r7 = -1
            int r9 = r2.getWidth()
            int r10 = r2.getHeight()
            r3 = r15
            r4 = r17
            r8 = r18
            r3.mo131129m0(r4, r5, r6, r7, r8, r9, r10)
            if (r11 == 0) goto L_0x014e
            r11.mo131160a(r2)
            goto L_0x014e
        L_0x0132:
            java.util.concurrent.ExecutorService r13 = com.tencent.p014mm.plugin.sns.model.C94866e1.Cx0()
            com.tencent.mm.plugin.sns.model.o$b r14 = new com.tencent.mm.plugin.sns.model.o$b
            r1 = r14
            r2 = r15
            r4 = r17
            r6 = r18
            r7 = r19
            r8 = r16
            r9 = r21
            r10 = r20
            r11 = r22
            r1.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13.execute(r14)
        L_0x014e:
            java.lang.String r0 = "getSnsDirect"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.LazyerImageLoader2"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L_0x0156:
            r0 = move-exception
            r12 = r15
        L_0x0158:
            monitor-exit(r4)     // Catch:{ all -> 0x0161 }
            java.lang.String r1 = "checkBigMediaIdDownloading"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.DownloadManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            throw r0
        L_0x0161:
            r0 = move-exception
            goto L_0x0158
        L_0x0163:
            r12 = r15
            java.lang.String r0 = "getSnsDirect"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.LazyerImageLoader2"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C94901o.mo131127l(te3.kv2, android.view.View, int, boolean, com.tencent.mm.storage.o3, boolean, com.tencent.mm.plugin.sns.model.o$l):void");
    }

    /* renamed from: l0 */
    public final void mo131128l0(Object obj, String str, boolean z, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("updateImageViewToKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        mo131131n0(obj, str, z, i, i2, -1, -1, C94911h.IMG_SCENE_NONE);
        SnsMethodCalculate.markEndTimeMs("updateImageViewToKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    /* renamed from: m0 */
    public final void mo131129m0(Object obj, String str, boolean z, int i, int i2, int i3, int i4) {
        SnsMethodCalculate.markStartTimeMs("updateImageViewToKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        mo131131n0(obj, str, z, i, i2, i3, i4, C94911h.IMG_SCENE_NONE);
        SnsMethodCalculate.markEndTimeMs("updateImageViewToKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    /* renamed from: n */
    public Bitmap mo131130n(C101804kv2 kv22) {
        String str;
        SnsMethodCalculate.markStartTimeMs("getSnsDirectThumb", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (kv22 == null || (str = kv22.f298689d) == null || str.equals("")) {
            SnsMethodCalculate.markEndTimeMs("getSnsDirectThumb", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return null;
        }
        String y = C102236a0.m134780y(1, kv22.f298689d);
        C92714n i = mo131121i(y, kv22.f298689d);
        if (C102236a0.m134742f(i)) {
            i.f266822h = false;
            Bitmap bitmap = i.f266818d;
            SnsMethodCalculate.markEndTimeMs("getSnsDirectThumb", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return bitmap;
        }
        String str2 = C94938q1.m120518e(C94866e1.m120262YO(), kv22.f298689d) + C102236a0.m134729X(kv22);
        if (C86013q1.m106450k(str2)) {
            C92714n c = kv22.f298689d.startsWith("pre_temp_extend_pic") ? C92714n.m116851c(C100408j0.m131394mL(str2)) : C102236a0.m134758n(str2);
            if (C102236a0.m134742f(c)) {
                mo131087G(y, c);
                c.f266822h = false;
                Bitmap bitmap2 = c.f266818d;
                SnsMethodCalculate.markEndTimeMs("getSnsDirectThumb", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                return bitmap2;
            }
            SnsMethodCalculate.markEndTimeMs("getSnsDirectThumb", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return null;
        }
        SnsMethodCalculate.markEndTimeMs("getSnsDirectThumb", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return null;
    }

    /* renamed from: n0 */
    public final void mo131131n0(Object obj, String str, boolean z, int i, int i2, int i3, int i4, C94911h hVar) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        Object obj2 = obj;
        int i5 = i;
        int i6 = i3;
        int i7 = i4;
        SnsMethodCalculate.markStartTimeMs("updateImageViewToKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (obj2 == null) {
            SnsMethodCalculate.markEndTimeMs("updateImageViewToKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return;
        }
        String str2 = TextUtils.isEmpty(str) ? "default" : str;
        int hashCode = obj.hashCode();
        int i8 = 0;
        this.f275003i.remove(new C94913j((String) null, hashCode, 0, false));
        C94913j jVar = new C94913j(str2, hashCode, i2, z);
        this.f275003i.add(jVar);
        CopyOnWriteArrayList copyOnWriteArrayList2 = (CopyOnWriteArrayList) ((ConcurrentHashMap) this.f275000f).get(str2);
        if (copyOnWriteArrayList2 == null) {
            copyOnWriteArrayList2 = new CopyOnWriteArrayList();
            ((ConcurrentHashMap) this.f275000f).put(str2, copyOnWriteArrayList2);
        }
        copyOnWriteArrayList2.add(new WeakReference(jVar));
        Log.m105925i("MicroMsg.LazyerImageLoader2", "[%s]updateImageViewToKey cache key:%s", "[image-flow]", str2);
        View view = (View) obj2;
        String str3 = (String) view.getTag(2130706432);
        if (!(str3 == null || (copyOnWriteArrayList = (CopyOnWriteArrayList) ((ConcurrentHashMap) this.f275000f).get(str3)) == null || copyOnWriteArrayList.isEmpty())) {
            while (true) {
                if (i8 >= copyOnWriteArrayList.size()) {
                    i8 = -1;
                    break;
                }
                C94913j jVar2 = (C94913j) ((WeakReference) copyOnWriteArrayList.get(i8)).get();
                if (jVar2 != null && jVar2.f275052b == hashCode) {
                    break;
                }
                i8++;
            }
            if (i8 != -1) {
                Log.m105927v("MicroMsg.LazyerImageLoader2", "updateImageViewToKey remove last pair %s", str3);
                copyOnWriteArrayList.remove(i8);
            }
        }
        view.setTag(2130706432, str2);
        ((ConcurrentHashMap) this.f274999e).put(Integer.valueOf(hashCode), new WeakReference(obj2));
        if (i5 != -1) {
            if (obj2 instanceof QFadeImageView) {
                ((QFadeImageView) obj2).setImageResource(i5);
            } else if (obj2 instanceof ImageView) {
                ImageView imageView = (ImageView) obj2;
                imageView.setImageDrawable(C76577a.m92158i(imageView.getContext(), i5));
            } else {
                ((C94571a) obj2).mo130071b((String) null, !this.f275007m, 0);
            }
        }
        if (hVar == C94911h.IMG_SCENE_SNSUSER && ((obj2 instanceof ImageView) || (obj2 instanceof QFadeImageView))) {
            ForceGpuUtil.setLayerType(view);
        } else if (str2 != null && str2.startsWith("3") && ((obj2 instanceof ImageView) || (obj2 instanceof QFadeImageView))) {
            ForceGpuUtil.decideLayerType(view, i6, i7);
            Log.m105918d("MicroMsg.LazyerImageLoader2", "try to setLayerType " + i6 + " " + i7);
        }
        SnsMethodCalculate.markEndTimeMs("updateImageViewToKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    /* renamed from: o0 */
    public final void mo131132o0(Object obj, String str, boolean z, int i, int i2, C94911h hVar) {
        SnsMethodCalculate.markStartTimeMs("updateImageViewToKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        mo131131n0(obj, str, z, i, i2, -1, -1, hVar);
        SnsMethodCalculate.markEndTimeMs("updateImageViewToKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    /* renamed from: p */
    public int mo131133p(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("isAutoAdDownload", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        int q = mo131134q(snsInfo, (int[]) null);
        SnsMethodCalculate.markEndTimeMs("isAutoAdDownload", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return q;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e4, code lost:
        if (r12.f275014t.get(java.lang.Integer.valueOf(r7)).booleanValue() != false) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0119, code lost:
        if (r12.f275013s.get(java.lang.Integer.valueOf(r7)).booleanValue() != false) goto L_0x011b;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo131134q(com.tencent.p014mm.plugin.sns.storage.SnsInfo r13, int[] r14) {
        /*
            r12 = this;
            java.lang.String r0 = "MicroMsg.LazyerImageLoader2"
            java.lang.String r1 = "isAutoAdDownload"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.LazyerImageLoader2"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            r3 = 5
            r4 = 10
            r5 = 1
            r6 = 0
            if (r14 != 0) goto L_0x001e
            long r7 = r12.f275009o
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r7)
            r9 = 60000(0xea60, double:2.9644E-319)
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x0054
        L_0x001e:
            com.tencent.mm.pointers.PInt r7 = new com.tencent.mm.pointers.PInt
            r7.<init>()
            com.tencent.mm.pointers.PInt r8 = new com.tencent.mm.pointers.PInt
            r8.<init>()
            java.lang.Class<jn.b> r9 = p575jn.C98950b.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            jn.b r9 = (p575jn.C98950b) r9
            boolean r9 = r9.mo59101SD(r7, r8)
            if (r9 == 0) goto L_0x0039
            r12.f275015u = r3
            goto L_0x003b
        L_0x0039:
            r12.f275015u = r4
        L_0x003b:
            if (r14 == 0) goto L_0x004a
            int r9 = r7.value
            if (r9 != 0) goto L_0x0043
            r9 = 0
            goto L_0x0044
        L_0x0043:
            r9 = 1
        L_0x0044:
            r14[r6] = r9
            int r8 = r8.value
            r14[r5] = r8
        L_0x004a:
            int r14 = r7.value
            r12.f275016v = r14
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r12.f275009o = r7
        L_0x0054:
            int r14 = r12.f275016v
            if (r14 == 0) goto L_0x0159
            if (r13 != 0) goto L_0x005c
            goto L_0x0159
        L_0x005c:
            java.util.HashMap<java.lang.Long, java.lang.Integer> r14 = r12.f275017w
            long r7 = r13.field_snsId
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            boolean r14 = r14.containsKey(r7)
            if (r14 == 0) goto L_0x0080
            java.util.HashMap<java.lang.Long, java.lang.Integer> r14 = r12.f275017w
            long r3 = r13.field_snsId
            java.lang.Long r13 = java.lang.Long.valueOf(r3)
            java.lang.Object r13 = r14.get(r13)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r13
        L_0x0080:
            te3.y74 r14 = new te3.y74
            r14.<init>()
            com.tencent.mm.protocal.protobuf.SnsObject r7 = new com.tencent.mm.protocal.protobuf.SnsObject     // Catch:{ Exception -> 0x014b }
            r7.<init>()     // Catch:{ Exception -> 0x014b }
            byte[] r8 = r13.field_attrBuf     // Catch:{ Exception -> 0x014b }
            pe3.a r7 = r7.parseFrom(r8)     // Catch:{ Exception -> 0x014b }
            com.tencent.mm.protocal.protobuf.SnsObject r7 = (com.tencent.p014mm.protocal.protobuf.SnsObject) r7     // Catch:{ Exception -> 0x014b }
            te3.qv3 r7 = r7.ObjectOperations     // Catch:{ Exception -> 0x014b }
            if (r7 != 0) goto L_0x009c
            int r13 = r12.f275015u     // Catch:{ Exception -> 0x014b }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r13
        L_0x009c:
            pe3.b r7 = r7.f140574f     // Catch:{ Exception -> 0x014b }
            byte[] r7 = r7.f257327a     // Catch:{ Exception -> 0x014b }
            r14.parseFrom(r7)     // Catch:{ Exception -> 0x014b }
            te3.xg3 r14 = r14.f145163h     // Catch:{ Exception -> 0x014b }
            if (r14 == 0) goto L_0x0145
            java.lang.String r14 = r14.f144643f     // Catch:{ Exception -> 0x014b }
            if (r14 != 0) goto L_0x00ad
            goto L_0x0145
        L_0x00ad:
            int r7 = r14.hashCode()
            int r8 = r12.f275016v
            if (r8 != r5) goto L_0x00ea
            java.util.HashMap<java.lang.Integer, java.lang.Boolean> r8 = r12.f275014t
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            boolean r8 = r8.containsKey(r9)
            if (r8 != 0) goto L_0x00d4
            java.util.HashMap<java.lang.Integer, java.lang.Boolean> r8 = r12.f275014t
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            int r10 = r12.f275016v
            boolean r14 = r12.mo131081A(r14, r10)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            r8.put(r9, r14)
        L_0x00d4:
            java.util.HashMap<java.lang.Integer, java.lang.Boolean> r14 = r12.f275014t
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object r14 = r14.get(r7)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x00e7
            goto L_0x011b
        L_0x00e7:
            r3 = 10
            goto L_0x011b
        L_0x00ea:
            java.util.HashMap<java.lang.Integer, java.lang.Boolean> r8 = r12.f275013s
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            boolean r8 = r8.containsKey(r9)
            if (r8 != 0) goto L_0x0109
            java.util.HashMap<java.lang.Integer, java.lang.Boolean> r8 = r12.f275013s
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            int r10 = r12.f275016v
            boolean r14 = r12.mo131081A(r14, r10)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            r8.put(r9, r14)
        L_0x0109:
            java.util.HashMap<java.lang.Integer, java.lang.Boolean> r14 = r12.f275013s
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object r14 = r14.get(r7)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x00e7
        L_0x011b:
            r14 = 2
            java.lang.Object[] r14 = new java.lang.Object[r14]
            long r7 = r13.field_snsId
            java.lang.Long r4 = java.lang.Long.valueOf(r7)
            r14[r6] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r14[r5] = r4
            java.lang.String r4 = "isAutoAdDownload(sight_autodownload) snsID:%d, result:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r4, r14)
            java.util.HashMap<java.lang.Long, java.lang.Integer> r14 = r12.f275017w
            long r4 = r13.field_snsId
            java.lang.Long r13 = java.lang.Long.valueOf(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r14.put(r13, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r3
        L_0x0145:
            int r13 = r12.f275010p     // Catch:{ Exception -> 0x014b }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r13
        L_0x014b:
            r13 = move-exception
            java.lang.Object[] r14 = new java.lang.Object[r6]
            java.lang.String r3 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r13, r3, r14)
            int r13 = r12.f275015u
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r13
        L_0x0159:
            int r13 = r12.f275015u
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C94901o.mo131134q(com.tencent.mm.plugin.sns.storage.SnsInfo, int[]):int");
    }

    /* renamed from: r */
    public int mo131135r(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("isAutoDownload", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        int s = mo131136s(snsInfo, (int[]) null);
        SnsMethodCalculate.markEndTimeMs("isAutoDownload", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return s;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ee, code lost:
        if (r13.f275014t.get(java.lang.Integer.valueOf(r8)).booleanValue() != false) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0123, code lost:
        if (r13.f275013s.get(java.lang.Integer.valueOf(r8)).booleanValue() != false) goto L_0x0125;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo131136s(com.tencent.p014mm.plugin.sns.storage.SnsInfo r14, int[] r15) {
        /*
            r13 = this;
            java.lang.String r0 = "MicroMsg.LazyerImageLoader2"
            java.lang.String r1 = "isAutoDownload"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.LazyerImageLoader2"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            r3 = 2
            r4 = 5
            r5 = 10
            r6 = 1
            r7 = 0
            if (r15 != 0) goto L_0x001f
            long r8 = r13.f275008n
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r8)
            r10 = 60000(0xea60, double:2.9644E-319)
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x005e
        L_0x001f:
            com.tencent.mm.pointers.PInt r8 = new com.tencent.mm.pointers.PInt
            r8.<init>()
            com.tencent.mm.pointers.PInt r9 = new com.tencent.mm.pointers.PInt
            r9.<init>()
            com.tencent.mm.pointers.PInt r10 = new com.tencent.mm.pointers.PInt
            r10.<init>()
            java.lang.Class<jn.b> r11 = p575jn.C98950b.class
            di3.d r11 = di3.C86312j.m106911c(r11)
            jn.b r11 = (p575jn.C98950b) r11
            boolean r11 = r11.mo59103fn(r8, r9, r10)
            if (r11 == 0) goto L_0x003f
            r13.f275010p = r4
            goto L_0x0041
        L_0x003f:
            r13.f275010p = r5
        L_0x0041:
            if (r15 == 0) goto L_0x0054
            int r11 = r8.value
            if (r11 != 0) goto L_0x0049
            r11 = 0
            goto L_0x004a
        L_0x0049:
            r11 = 1
        L_0x004a:
            r15[r7] = r11
            int r9 = r9.value
            r15[r6] = r9
            int r9 = r10.value
            r15[r3] = r9
        L_0x0054:
            int r15 = r8.value
            r13.f275011q = r15
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r13.f275008n = r8
        L_0x005e:
            int r15 = r13.f275011q
            if (r15 == 0) goto L_0x0162
            if (r14 != 0) goto L_0x0066
            goto L_0x0162
        L_0x0066:
            java.util.HashMap<java.lang.Long, java.lang.Integer> r15 = r13.f275012r
            long r8 = r14.field_snsId
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            boolean r15 = r15.containsKey(r8)
            if (r15 == 0) goto L_0x008a
            java.util.HashMap<java.lang.Long, java.lang.Integer> r15 = r13.f275012r
            long r3 = r14.field_snsId
            java.lang.Long r14 = java.lang.Long.valueOf(r3)
            java.lang.Object r14 = r15.get(r14)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r14
        L_0x008a:
            te3.y74 r15 = new te3.y74
            r15.<init>()
            com.tencent.mm.protocal.protobuf.SnsObject r8 = new com.tencent.mm.protocal.protobuf.SnsObject     // Catch:{ Exception -> 0x0154 }
            r8.<init>()     // Catch:{ Exception -> 0x0154 }
            byte[] r9 = r14.field_attrBuf     // Catch:{ Exception -> 0x0154 }
            pe3.a r8 = r8.parseFrom(r9)     // Catch:{ Exception -> 0x0154 }
            com.tencent.mm.protocal.protobuf.SnsObject r8 = (com.tencent.p014mm.protocal.protobuf.SnsObject) r8     // Catch:{ Exception -> 0x0154 }
            te3.qv3 r8 = r8.ObjectOperations     // Catch:{ Exception -> 0x0154 }
            if (r8 != 0) goto L_0x00a6
            int r14 = r13.f275010p     // Catch:{ Exception -> 0x0154 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r14
        L_0x00a6:
            pe3.b r8 = r8.f140574f     // Catch:{ Exception -> 0x0154 }
            byte[] r8 = r8.f257327a     // Catch:{ Exception -> 0x0154 }
            r15.parseFrom(r8)     // Catch:{ Exception -> 0x0154 }
            te3.xg3 r15 = r15.f145163h     // Catch:{ Exception -> 0x0154 }
            if (r15 == 0) goto L_0x014e
            java.lang.String r15 = r15.f144643f     // Catch:{ Exception -> 0x0154 }
            if (r15 != 0) goto L_0x00b7
            goto L_0x014e
        L_0x00b7:
            int r8 = r15.hashCode()
            int r9 = r13.f275011q
            if (r9 != r6) goto L_0x00f4
            java.util.HashMap<java.lang.Integer, java.lang.Boolean> r9 = r13.f275014t
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            boolean r9 = r9.containsKey(r10)
            if (r9 != 0) goto L_0x00de
            java.util.HashMap<java.lang.Integer, java.lang.Boolean> r9 = r13.f275014t
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            int r11 = r13.f275011q
            boolean r15 = r13.mo131081A(r15, r11)
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r15)
            r9.put(r10, r15)
        L_0x00de:
            java.util.HashMap<java.lang.Integer, java.lang.Boolean> r15 = r13.f275014t
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object r15 = r15.get(r8)
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto L_0x00f1
            goto L_0x0125
        L_0x00f1:
            r4 = 10
            goto L_0x0125
        L_0x00f4:
            java.util.HashMap<java.lang.Integer, java.lang.Boolean> r9 = r13.f275013s
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            boolean r9 = r9.containsKey(r10)
            if (r9 != 0) goto L_0x0113
            java.util.HashMap<java.lang.Integer, java.lang.Boolean> r9 = r13.f275013s
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            int r11 = r13.f275011q
            boolean r15 = r13.mo131081A(r15, r11)
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r15)
            r9.put(r10, r15)
        L_0x0113:
            java.util.HashMap<java.lang.Integer, java.lang.Boolean> r15 = r13.f275013s
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object r15 = r15.get(r8)
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto L_0x00f1
        L_0x0125:
            java.lang.Object[] r15 = new java.lang.Object[r3]
            long r8 = r14.field_snsId
            java.lang.Long r3 = java.lang.Long.valueOf(r8)
            r15[r7] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r15[r6] = r3
            java.lang.String r3 = "isAutoDownload(sight_autodownload) snsID:%d, result:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r15)
            java.util.HashMap<java.lang.Long, java.lang.Integer> r15 = r13.f275012r
            long r5 = r14.field_snsId
            java.lang.Long r14 = java.lang.Long.valueOf(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r15.put(r14, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r4
        L_0x014e:
            int r14 = r13.f275010p     // Catch:{ Exception -> 0x0154 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r14
        L_0x0154:
            r14 = move-exception
            java.lang.Object[] r15 = new java.lang.Object[r7]
            java.lang.String r3 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r14, r3, r15)
            int r14 = r13.f275010p
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r14
        L_0x0162:
            int r14 = r13.f275010p
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C94901o.mo131136s(com.tencent.mm.plugin.sns.storage.SnsInfo, int[]):int");
    }

    /* renamed from: t */
    public boolean mo131137t(C101804kv2 kv22) {
        SnsMethodCalculate.markStartTimeMs("isError", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (!this.f275004j.containsKey(kv22.f298689d)) {
            SnsMethodCalculate.markEndTimeMs("isError", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return false;
        } else if (this.f275004j.get(kv22.f298689d).intValue() == 4) {
            SnsMethodCalculate.markEndTimeMs("isError", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return true;
        } else {
            SnsMethodCalculate.markEndTimeMs("isError", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return false;
        }
    }

    /* renamed from: u */
    public boolean mo131138u(C101804kv2 kv22) {
        String str;
        SnsMethodCalculate.markStartTimeMs("isFileExist", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (kv22 == null || (str = kv22.f298689d) == null || str.equals("")) {
            SnsMethodCalculate.markEndTimeMs("isFileExist", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return false;
        }
        if (C86013q1.m106450k(C94938q1.m120518e(C94866e1.m120262YO(), kv22.f298689d) + C102236a0.m134745g0(kv22))) {
            SnsMethodCalculate.markEndTimeMs("isFileExist", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return true;
        }
        if (C86013q1.m106450k(C94938q1.m120518e(C94866e1.m120262YO(), kv22.f298689d) + C102236a0.m134729X(kv22))) {
            SnsMethodCalculate.markEndTimeMs("isFileExist", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return true;
        }
        boolean f = C102236a0.m134742f(this.f274997c.get(C102236a0.m134780y(1, kv22.f298689d)));
        SnsMethodCalculate.markEndTimeMs("isFileExist", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return f;
    }

    /* renamed from: v */
    public boolean mo131139v(C101804kv2 kv22) {
        SnsMethodCalculate.markStartTimeMs("isHidePlay", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (!this.f275004j.containsKey(kv22.f298689d)) {
            SnsMethodCalculate.markEndTimeMs("isHidePlay", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return false;
        } else if (this.f275004j.get(kv22.f298689d).intValue() == 2) {
            SnsMethodCalculate.markEndTimeMs("isHidePlay", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return true;
        } else {
            SnsMethodCalculate.markEndTimeMs("isHidePlay", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return false;
        }
    }

    /* renamed from: w */
    public boolean mo131140w(C101804kv2 kv22) {
        SnsMethodCalculate.markStartTimeMs("isLoadBar", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (!this.f275004j.containsKey(kv22.f298689d)) {
            SnsMethodCalculate.markEndTimeMs("isLoadBar", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return false;
        } else if (this.f275004j.get(kv22.f298689d).intValue() == 3) {
            SnsMethodCalculate.markEndTimeMs("isLoadBar", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return true;
        } else {
            SnsMethodCalculate.markEndTimeMs("isLoadBar", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return false;
        }
    }

    /* renamed from: x */
    public boolean mo131141x(C101804kv2 kv22) {
        SnsMethodCalculate.markStartTimeMs("isMediaSightExist", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        String e = C94938q1.m120518e(C94866e1.m120262YO(), kv22.f298689d);
        String T = C102236a0.m134725T(kv22);
        if (C86013q1.m106450k(e + T)) {
            SnsMethodCalculate.markEndTimeMs("isMediaSightExist", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return true;
        }
        if (!C86013q1.m106450k(e + C102236a0.m134735b0(kv22)) || Util.isNullOrNil(kv22.f298689d) || !kv22.f298689d.startsWith("Locall_path")) {
            SnsMethodCalculate.markEndTimeMs("isMediaSightExist", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return false;
        }
        SnsMethodCalculate.markEndTimeMs("isMediaSightExist", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return true;
    }

    /* renamed from: y */
    public boolean mo131142y() {
        SnsMethodCalculate.markStartTimeMs("isRun", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        boolean z = this.f275007m;
        SnsMethodCalculate.markEndTimeMs("isRun", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return z;
    }

    /* renamed from: z */
    public boolean mo131143z(C101804kv2 kv22) {
        SnsMethodCalculate.markStartTimeMs("isShowPlay", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (!this.f275004j.containsKey(kv22.f298689d)) {
            SnsMethodCalculate.markEndTimeMs("isShowPlay", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return false;
        } else if (this.f275004j.get(kv22.f298689d).intValue() == 1) {
            SnsMethodCalculate.markEndTimeMs("isShowPlay", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return true;
        } else {
            SnsMethodCalculate.markEndTimeMs("isShowPlay", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return false;
        }
    }
}
