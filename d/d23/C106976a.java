package d23;

import a70.C112760b;
import ac3.C91992q0;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Pair;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.vlog.model.C106205q0;
import com.tencent.p014mm.plugin.vlog.model.C30517h0;
import com.tencent.p014mm.plugin.vlog.model.C96551o;
import com.tencent.p014mm.plugin.vlog.model.C96552p0;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.xeffect.effect.EffectManager;
import com.tencent.p014mm.xeffect.effect.VLogEffectJNI;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import n23.C109676b;
import o40.C61926c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r23.C77461b;
import rr3.C110625c0;
import rr3.C110632i;
import rr3.C110636m;
import rx3.C13598b0;
import rx3.C13604l;
import sp3.C110794b;
import sp3.C110801c;
import sp3.C110803f;
import sp3.C110805h;
import sx3.C110818d0;
import sx3.C26236u;
import sx3.C77813z;
import sx3.C90364q0;
import uh2.C111176g;
import uh2.C111177h;
import xp3.C112168e;

/* renamed from: d23.a */
public final class C106976a {

    /* renamed from: a */
    public static final C106976a f320208a = new C106976a();

    /* renamed from: b */
    public static final String f320209b = (C112760b.m154225d() + "image_enhancement_result");

    /* renamed from: c */
    public static final Map<String, Integer> f320210c = C90364q0.m113147f(new C13604l("diehua.svg", Integer.valueOf(C0966R.raw.diehua)), new C13604l("shanhei.svg", Integer.valueOf(C0966R.raw.shanhei)), new C13604l("shanbai.svg", Integer.valueOf(C0966R.raw.shanbai)), new C13604l("zuoyi.svg", Integer.valueOf(C0966R.raw.zuoyi)), new C13604l("youyi.svg", Integer.valueOf(C0966R.raw.youyi)), new C13604l("shangyi.svg", Integer.valueOf(C0966R.raw.shangyi)), new C13604l("xiayi.svg", Integer.valueOf(C0966R.raw.xiayi)), new C13604l("fangda.svg", Integer.valueOf(C0966R.raw.fangda)), new C13604l("suoxiao.svg", Integer.valueOf(C0966R.raw.suoxiao)), new C13604l("youzhuan.svg", Integer.valueOf(C0966R.raw.youzhuan)), new C13604l("zuozhuan.svg", Integer.valueOf(C0966R.raw.zuozhuan)));

    /* renamed from: d */
    public static final LinkedList<C75321a> f320211d = new LinkedList<>();

    /* renamed from: e */
    public static final LinkedList<C31054c> f320212e = new LinkedList<>();

    /* renamed from: f */
    public static C106977b f320213f;

    /* renamed from: g */
    public static C31054c f320214g;

    /* renamed from: h */
    public static EffectManager f320215h;

    /* renamed from: i */
    public static WeakReference<C77461b> f320216i;

    /* renamed from: j */
    public static HashMap<String, String> f320217j = new HashMap<>();

    /* renamed from: k */
    public static boolean f320218k;

    /* renamed from: l */
    public static HashMap<String, Pair<Integer, Long>> f320219l = new HashMap<>();

    /* renamed from: m */
    public static final List<Integer> f320220m;

    /* renamed from: d23.a$c */
    public static final class C31054c {

        /* renamed from: a */
        public long f83297a;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31054c)) {
                return false;
            }
            C31054c cVar = (C31054c) obj;
            cVar.getClass();
            if (!C87412m.m108589b((Object) null, (Object) null)) {
                return false;
            }
            cVar.getClass();
            if (!C87412m.m108589b((Object) null, (Object) null)) {
                return false;
            }
            cVar.getClass();
            if (!C87412m.m108589b((Object) null, (Object) null)) {
                return false;
            }
            cVar.getClass();
            if (0 != 0) {
                return false;
            }
            cVar.getClass();
            cVar.getClass();
            if (0 != 0) {
                return false;
            }
            cVar.getClass();
            cVar.getClass();
            if (!C87412m.m108589b((Object) null, (Object) null)) {
                return false;
            }
            cVar.getClass();
            if (!C87412m.m108589b((Object) null, (Object) null) || this.f83297a != cVar.f83297a) {
                return false;
            }
            cVar.getClass();
            return C87412m.m108589b((Object) null, (Object) null);
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            return "VideoTemplateInfo(path=" + null + ", musicPath=" + null + ", size=" + null + ", duration=" + 0 + ", imageNums=" + 0 + ", effectId=" + 0 + ", trackCropToTemplateSize=" + false + ", name=" + null + ", icon=" + null + ", templateEffectRangeId=" + this.f83297a + ", replacementInfo=" + null + ')';
        }
    }

    /* renamed from: d23.a$a */
    public static final class C75321a {

        /* renamed from: a */
        public String f221478a;

        /* renamed from: b */
        public int f221479b;

        /* renamed from: c */
        public String f221480c;

        /* renamed from: d */
        public int f221481d;

        /* renamed from: e */
        public long f221482e;

        /* renamed from: f */
        public C110625c0 f221483f;

        public C75321a() {
            this((String) null, 0, (String) null, 0, 0, (C110625c0) null, 63, (C8480h) null);
        }

        public C75321a(String str, int i, String str2, int i2, long j, C110625c0 c0Var, int i3, C8480h hVar) {
            str = (i3 & 1) != 0 ? "" : str;
            i = (i3 & 2) != 0 ? 0 : i;
            str2 = (i3 & 4) != 0 ? "" : str2;
            i2 = (i3 & 8) != 0 ? -1 : i2;
            j = (i3 & 16) != 0 ? 500 : j;
            c0Var = (i3 & 32) != 0 ? null : c0Var;
            C87412m.m108594g(str, "name");
            C87412m.m108594g(str2, "assetPath");
            this.f221478a = str;
            this.f221479b = i;
            this.f221480c = str2;
            this.f221481d = i2;
            this.f221482e = j;
            this.f221483f = c0Var;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C75321a)) {
                return false;
            }
            C75321a aVar = (C75321a) obj;
            return C87412m.m108589b(this.f221478a, aVar.f221478a) && this.f221479b == aVar.f221479b && C87412m.m108589b(this.f221480c, aVar.f221480c) && this.f221481d == aVar.f221481d && this.f221482e == aVar.f221482e && C87412m.m108589b(this.f221483f, aVar.f221483f);
        }

        public int hashCode() {
            long j = this.f221482e;
            int hashCode = ((((((((this.f221478a.hashCode() * 31) + this.f221479b) * 31) + this.f221480c.hashCode()) * 31) + this.f221481d) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            C110625c0 c0Var = this.f221483f;
            return hashCode + (c0Var == null ? 0 : c0Var.hashCode());
        }

        public String toString() {
            return "TransEffectInfo(name=" + this.f221478a + ", order=" + this.f221479b + ", assetPath=" + this.f221480c + ", svgPath=" + this.f221481d + ", duration=" + this.f221482e + ", effect=" + this.f221483f + ')';
        }
    }

    /* renamed from: d23.a$b */
    public static final class C106977b {

        /* renamed from: a */
        public C110636m f320221a;

        /* renamed from: b */
        public int f320222b;

        public C106977b() {
            this((C110636m) null, 0, 3, (C8480h) null);
        }

        public C106977b(C110636m mVar, int i, int i2, C8480h hVar) {
            mVar = (i2 & 1) != 0 ? null : mVar;
            i = (i2 & 2) != 0 ? 12 : i;
            this.f320221a = mVar;
            this.f320222b = i;
        }

        /* renamed from: a */
        public final long mo157411a() {
            C110636m mVar = this.f320221a;
            if (mVar != null) {
                return mVar.f330967a;
            }
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C106977b)) {
                return false;
            }
            C106977b bVar = (C106977b) obj;
            return C87412m.m108589b(this.f320221a, bVar.f320221a) && this.f320222b == bVar.f320222b;
        }

        public int hashCode() {
            C110636m mVar = this.f320221a;
            return ((mVar == null ? 0 : mVar.hashCode()) * 31) + this.f320222b;
        }

        public String toString() {
            return "VideoEnhancementEffectInfo(effect=" + this.f320221a + ", currentScene=" + this.f320222b + ')';
        }
    }

    /* renamed from: d23.a$d */
    public static final class C106978d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C106978d f320223d = new C106978d();

        public C106978d() {
            super(0);
        }

        public Object invoke() {
            Log.m105924i("MicroMsg.LocalEffectManager", "initTransResource: transition res callback");
            C111176g.f332958d.f315410c = null;
            C106976a.f320208a.mo157402f();
            Log.m105924i("MicroMsg.LocalEffectManager", "checkRefreshView: " + C106976a.f320218k);
            if (C106976a.f320218k) {
                C61926c.m72668M(C75322b.f221484d);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: d23.a$e */
    public static final class C106979e implements C112168e {

        /* renamed from: a */
        public String f320224a = "";

        /* renamed from: b */
        public final /* synthetic */ C96552p0 f320225b;

        public C106979e(C96552p0 p0Var) {
            this.f320225b = p0Var;
        }

        /* renamed from: a */
        public void mo134637a(long j) {
            String str;
            C106976a aVar = C106976a.f320208a;
            C106977b bVar = C106976a.f320213f;
            String str2 = null;
            if ((bVar != null ? bVar.f320221a : null) != null) {
                C106205q0 c = C96551o.m123873c(this.f320225b, j);
                if (!C87412m.m108589b(c != null ? c.f316490a : null, this.f320224a)) {
                    if (c != null) {
                        str2 = c.f316490a;
                    }
                    int c2 = aVar.mo157399c(str2);
                    if (((ArrayList) C106976a.f320220m).contains(Integer.valueOf(c2))) {
                        aVar.mo157407k(c2);
                    }
                    if (c == null || (str = c.f316490a) == null) {
                        str = "";
                    }
                    this.f320224a = str;
                }
            }
        }

        /* renamed from: d */
        public void mo134638d() {
        }
    }

    static {
        C110636m.C110637a[] values = C110636m.C110637a.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (C110636m.C110637a ordinal : values) {
            arrayList.add(Integer.valueOf(ordinal.ordinal()));
        }
        f320220m = arrayList;
    }

    /* renamed from: a */
    public final void mo157397a(C106205q0 q0Var, C75321a aVar) {
        C87412m.m108594g(q0Var, FFmpegMetadataRetriever.METADATA_KEY_TRACK);
        EffectManager effectManager = f320215h;
        if (effectManager != null) {
            C110625c0 c0Var = q0Var.f316501l.f331477o.f331494b;
            effectManager.mo154934n(c0Var != null ? c0Var.f330967a : 0);
        }
        C110805h hVar = q0Var.f316501l.f331477o;
        hVar.f331494b = null;
        if (aVar != null) {
            q0Var.f316499j = aVar.f221479b;
            String str = aVar.f221480c;
            C87412m.m108595h(str, "<set-?>");
            hVar.f331493a = str;
            q0Var.f316501l.f331477o.f331495c = aVar.f221482e;
            return;
        }
        q0Var.f316499j = -1;
        hVar.f331493a = "";
        hVar.f331495c = 0;
    }

    /* renamed from: b */
    public final void mo157398b(List<C106205q0> list, int i) {
        T t;
        boolean z;
        C87412m.m108594g(list, "trackList");
        Iterator<T> it = f320211d.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((C75321a) t).f221479b == i) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C75321a aVar = (C75321a) t;
        for (T a : C110818d0.m150948t0(list, list.size() - 1)) {
            f320208a.mo157397a(a, aVar);
        }
    }

    /* renamed from: c */
    public final int mo157399c(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        Pair pair = f320219l.get(str);
        Integer num = pair != null ? (Integer) pair.first : null;
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* renamed from: d */
    public final EffectManager mo157400d() {
        return f320215h;
    }

    /* renamed from: e */
    public final synchronized void mo157401e(EffectManager effectManager) {
        Log.m105924i("MicroMsg.LocalEffectManager", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        if (f320215h == null) {
            if (effectManager == null) {
                effectManager = new EffectManager();
            }
            f320215h = effectManager;
        }
        mo157402f();
        C30517h0.m39115d();
        Long l = null;
        f320213f = new C106977b((C110636m) null, 0, 3, (C8480h) null);
        StringBuilder sb = new StringBuilder();
        sb.append("initVideoEnhancementEffect effectId:");
        C106977b bVar = f320213f;
        if (bVar != null) {
            l = Long.valueOf(bVar.mo157411a());
        }
        sb.append(l);
        Log.m105924i("MicroMsg.LocalEffectManager", sb.toString());
    }

    /* renamed from: f */
    public final void mo157402f() {
        StringBuilder sb = new StringBuilder();
        sb.append("initTransResource: transition res ");
        C111176g gVar = C111176g.f332958d;
        sb.append(gVar.f315409b);
        sb.append('}');
        Log.m105924i("MicroMsg.LocalEffectManager", sb.toString());
        if (gVar.f315409b) {
            f320218k = true;
            String g = gVar.mo151277g();
            try {
                JSONArray c = gVar.mo151273c();
                C87412m.m108591d(c);
                f320211d.clear();
                int length = c.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = c.optJSONObject(i);
                    String optString = optJSONObject.optString("name");
                    String string = optJSONObject.getString("pag");
                    Integer num = f320210c.get(optJSONObject.getString("svg"));
                    int i2 = optJSONObject.getInt("order");
                    String str = g + string;
                    int intValue = num != null ? num.intValue() : -1;
                    LinkedList<C75321a> linkedList = f320211d;
                    C87412m.m108593f(optString, "transEffectName");
                    linkedList.add(new C75321a(optString, i2, str, intValue, 500, (C110625c0) null, 32, (C8480h) null));
                }
                LinkedList<C75321a> linkedList2 = f320211d;
                if (linkedList2.size() > 1) {
                    C77813z.m93909o(linkedList2, new C75323e());
                }
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.LocalEffectManager", e, "Cannot load transEffect config", new Object[0]);
            }
        } else {
            gVar.f315410c = C106978d.f320223d;
        }
    }

    /* renamed from: g */
    public final synchronized void mo157403g() {
        Log.m105924i("MicroMsg.LocalEffectManager", "reset");
        EffectManager effectManager = f320215h;
        if (effectManager != null) {
            effectManager.mo154926f();
        }
        f320217j.clear();
    }

    /* renamed from: h */
    public final void mo157404h(List<String> list) {
        Bitmap bitmap;
        C87412m.m108594g(list, "pathList");
        f320217j.clear();
        C110803f fVar = C110803f.f331490g;
        int i = C110803f.f331484a;
        C110803f.f331484a = 2000;
        fVar.mo162371a();
        for (String str : list) {
            C106976a aVar = f320208a;
            C87412m.m108594g(str, "path");
            Object obj = new Object();
            Log.m105924i("MicroMsg.LocalEffectManager", "getImageEnhancementBitmap path:" + str);
            try {
                C106205q0 q0Var = new C106205q0(str, 1, 0);
                C96552p0 p0Var = new C96552p0((List<C106205q0>) C26236u.m33719b(q0Var));
                aVar.mo157406j(p0Var, true);
                int c = aVar.mo157399c(str);
                if (((ArrayList) f320220m).contains(Integer.valueOf(c))) {
                    aVar.mo157407k(c);
                }
                C8479f0 f0Var = new C8479f0();
                p0Var.mo134623t(f320215h);
                C110794b b = C110794b.f331445i.mo162359b(p0Var.mo134611h());
                C110801c cVar = q0Var.f316501l;
                b.mo58663C(cVar.f331471i, cVar.f331472j);
                b.mo58665b(C26236u.m33719b(100L), new C97406d(q0Var, f0Var, obj));
                synchronized (obj) {
                    try {
                        obj.wait();
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.LocalEffectManager", e, "", new Object[0]);
                    }
                    C13598b0 b0Var = C13598b0.f38549a;
                }
                aVar.mo157406j(p0Var, false);
                bitmap = (Bitmap) f0Var.f27484d;
            } catch (Exception e2) {
                Log.m105920e("MicroMsg.LocalEffectManager", "getImageEnhancementBitmap parse track fail path:" + str + ", error:" + e2.getLocalizedMessage());
                bitmap = null;
            }
            if (bitmap != null) {
                String str2 = f320209b + XVFSFile.SEPARATOR_CHAR + Util.currentTicks();
                BitmapUtil.saveBitmapToImage(bitmap, 100, Bitmap.CompressFormat.JPEG, str2, false);
                f320217j.put(str, str2);
                Log.m105924i("MicroMsg.LocalEffectManager", "save enhancement image result in " + str2 + ", origin:" + str);
                if (f320217j.size() == list.size()) {
                    Log.m105924i("MicroMsg.LocalEffectManager", "save enhancement image result finish");
                }
            }
        }
        int i2 = C110803f.f331484a;
        C110803f.f331484a = i;
        Log.m105924i("MicroMsg.LocalEffectManager", "save enhancement image result finish return");
    }

    /* renamed from: i */
    public final void mo157405i(C106205q0 q0Var, int i) {
        T t;
        boolean z;
        C87412m.m108594g(q0Var, FFmpegMetadataRetriever.METADATA_KEY_TRACK);
        Iterator<T> it = f320211d.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((C75321a) t).f221479b == i) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        mo157397a(q0Var, (C75321a) t);
    }

    /* renamed from: j */
    public final void mo157406j(C96552p0 p0Var, boolean z) {
        C110636m mVar;
        C106977b bVar = f320213f;
        C110636m mVar2 = null;
        if (bVar != null) {
            if (z && bVar.f320221a == null) {
                EffectManager effectManager = f320215h;
                C110625c0 g = effectManager != null ? effectManager.mo154927g(C110632i.ImageEnhanceEffect) : null;
                EffectManager effectManager2 = f320215h;
                if (effectManager2 != null) {
                    effectManager2.mo154923c(g);
                }
                bVar.f320221a = g instanceof C110636m ? (C110636m) g : null;
            } else if (!z && (mVar = bVar.f320221a) != null) {
                EffectManager effectManager3 = f320215h;
                if (effectManager3 != null) {
                    effectManager3.mo154934n(mVar.f330967a);
                }
                bVar.f320221a = null;
            }
            if (p0Var != null) {
                p0Var.f282576i = z;
            }
            if (z) {
                C109676b.f328306a.mo160900a();
                if (p0Var != null) {
                    p0Var.f282568a.mo162380a(new C106979e(p0Var));
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("setVideoEnhancement enable:");
        sb.append(z);
        sb.append(", effectId:");
        C106977b bVar2 = f320213f;
        sb.append(bVar2 != null ? Long.valueOf(bVar2.mo157411a()) : null);
        sb.append(", rangeId:");
        C106977b bVar3 = f320213f;
        if (bVar3 != null) {
            mVar2 = bVar3.f320221a;
        }
        sb.append(mVar2);
        Log.m105924i("MicroMsg.LocalEffectManager", sb.toString());
    }

    /* renamed from: k */
    public final void mo157407k(int i) {
        if (i < 0) {
            Log.m105920e("MicroMsg.LocalEffectManager", "setVideoEnhancementScene error:" + i);
            return;
        }
        C106977b bVar = f320213f;
        if (bVar != null) {
            if (bVar.mo157411a() > 0) {
                Log.m105924i("MicroMsg.LocalEffectManager", "setVideoEnhancementScene, effectId:" + bVar.mo157411a() + ", scene:" + i);
                C110636m mVar = bVar.f320221a;
                if (mVar != null) {
                    VLogEffectJNI.INSTANCE.setScene$renderlib_release(mVar.f330969c, i);
                }
                bVar.f320222b = i;
            }
            boolean z = false;
            if (MultiProcessMMKV.getMMKV("FINDER_CONFIG_USER_KEY").getInt("USERINFO_FINDER_SHOW_IMAGE_ENHANCEMENT_FACE_LANDMARKS_INT_SYNC", 0) == 1) {
                z = true;
            }
            C106977b bVar2 = f320213f;
            if (bVar2 != null && bVar2.mo157411a() > 0) {
                Log.m105924i("MicroMsg.LocalEffectManager", "setVideoEnhancementShowFaceLandmarks, show:" + z);
                C110636m mVar2 = bVar2.f320221a;
                if (mVar2 != null) {
                    VLogEffectJNI.INSTANCE.setShowLandmarks$renderlib_release(mVar2.f330969c, z);
                }
            }
        }
    }

    /* renamed from: l */
    public final void mo157408l(C31054c cVar, long[] jArr) {
        C110625c0 c0Var;
        C110632i iVar = C110632i.PAGVideoTemplateEffect;
        C87412m.m108594g(cVar, "videoTemplate");
        C87412m.m108594g(jArr, "targets");
        EffectManager effectManager = f320215h;
        if (effectManager != null) {
            effectManager.mo154926f();
        }
        Long l = null;
        mo157406j((C96552p0) null, false);
        C31054c cVar2 = f320214g;
        if (cVar2 != null) {
            Log.m105924i("MicroMsg.LocalEffectManager", "setVideoTemplate: remove  " + Long.valueOf(cVar2.f83297a));
            EffectManager effectManager2 = f320215h;
            if (effectManager2 != null) {
                effectManager2.mo154936p(iVar);
            }
        }
        EffectManager effectManager3 = f320215h;
        if (effectManager3 != null) {
            AssetManager assets = MMApplicationContext.getContext().getAssets();
            C87412m.m108593f(assets, "getContext().assets");
            cVar.getClass();
            c0Var = effectManager3.mo154928h(iVar, assets, (String) null);
        } else {
            c0Var = null;
        }
        long j = 0;
        if (c0Var != null) {
            cVar.getClass();
            c0Var.mo162189b(0, 0);
        }
        EffectManager effectManager4 = f320215h;
        if (effectManager4 != null) {
            effectManager4.mo154923c(c0Var);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("setVideoTemplate: addEffect ");
        if (c0Var != null) {
            l = Long.valueOf(c0Var.f330967a);
        }
        sb.append(l);
        Log.m105924i("MicroMsg.LocalEffectManager", sb.toString());
        if (c0Var != null) {
            j = c0Var.f330967a;
        }
        cVar.f83297a = j;
        f320214g = cVar;
    }

    /* renamed from: m */
    public final void mo157409m() {
        String str = C91992q0.f263334d + XVFSFile.SEPARATOR_CHAR + C91992q0.f263341k;
        C111177h hVar = C111177h.f332960d;
        if ((hVar.f315409b && C86013q1.m106450k(hVar.mo162907p())) && !C86013q1.m106450k(str)) {
            C86013q1.m106463x(hVar.mo162907p(), str);
            Log.m105924i("MicroMsg.LocalEffectManager", "tryCreateX3DGlobalContext, copy image label model path, from:" + hVar.mo162907p() + " to " + str);
        }
        if (!C86013q1.m106450k(str)) {
            Log.m105920e("MicroMsg.LocalEffectManager", "tryCreateX3DGlobalContext model not exist!");
            return;
        }
        Log.m105924i("MicroMsg.LocalEffectManager", "start tryCreateX3DGlobalContext");
        Log.m105924i("MicroMsg.LocalEffectManager", "tryCreateX3DGlobalContext finish");
    }

    /* renamed from: n */
    public final synchronized void mo157410n() {
        f320211d.clear();
        Log.m105924i("MicroMsg.LocalEffectManager", "clear");
        f320219l.clear();
        EffectManager effectManager = f320215h;
        if (effectManager != null) {
            effectManager.mo154931k();
        }
        f320215h = null;
        f320213f = null;
        C111176g.f332958d.f315410c = null;
        f320216i = null;
        C86013q1.m106445f(f320209b);
        f320217j.clear();
    }
}
