package kr1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import c30.C104289g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorPanelHolder;
import com.tencent.p014mm.plugin.xlabeffect.XEffectConfig;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import is3.C108485b;
import is3.C108486c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import ks3.C109054b;
import ks3.C61158a;
import lh2.C109344g0;
import org.json.JSONObject;
import qh2.C101198e;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import z04.C112551y;

/* renamed from: kr1.b */
public final class C109039b implements C109344g0 {

    /* renamed from: v */
    public static final C109042c f326557v;

    /* renamed from: w */
    public static final ArrayList<HashMap<Integer, Integer>> f326558w = new ArrayList<>(3);

    /* renamed from: x */
    public static final String f326559x = "{\n                \"skin_smooth\":35,\n                \"face_morph\":20,\n                \"eye_morph\":10,\n                \"skin_bright\":20,\n                \"eye_bright\":40,\n                \"rosy\":0,\n                \"eye_pouch\":80,\n                \"smile_folds\":80,\n                \"sharpen\":40,\n                \"teeth_bright\":30,\n                \"small_head\":0,\n                \"cheek_bone\":10,\n                \"lower_jawbone\":10,\n                \"wing_of_nose\":10\n                }";

    /* renamed from: y */
    public static final String f326560y = "{\n                \"skin_smooth\":60,\n                \"face_morph\":30,\n                \"eye_morph\":30,\n                \"skin_bright\":40,\n                \"eye_bright\":40,\n                \"rosy\":0,\n                \"eye_pouch\":90,\n                \"smile_folds\":90,\n                \"sharpen\":40,\n                \"teeth_bright\":30,\n                \"small_head\":0,\n                \"cheek_bone\":20,\n                \"lower_jawbone\":30,\n                \"wing_of_nose\":20\n        }";

    /* renamed from: z */
    public static final String f326561z = "{\n                \"skin_smooth\":90,\n                \"face_morph\":40,\n                \"eye_morph\":35,\n                \"skin_bright\":70,\n                \"eye_bright\":40,\n                \"rosy\":0,\n                \"eye_pouch\":100,\n                \"smile_folds\":100,\n                \"sharpen\":40,\n                \"teeth_bright\":30,\n                \"small_head\":0,\n                \"cheek_bone\":40,\n                \"lower_jawbone\":50,\n                \"wing_of_nose\":30\n        }";

    /* renamed from: d */
    public ViewGroup f326562d;

    /* renamed from: e */
    public View f326563e;

    /* renamed from: f */
    public C101198e f326564f;

    /* renamed from: g */
    public boolean f326565g;

    /* renamed from: h */
    public boolean f326566h = true;

    /* renamed from: i */
    public boolean f326567i = true;

    /* renamed from: j */
    public boolean f326568j = true;

    /* renamed from: n */
    public final EditorPanelHolder f326569n;

    /* renamed from: o */
    public boolean f326570o;

    /* renamed from: p */
    public final C13601g f326571p;

    /* renamed from: q */
    public int f326572q;

    /* renamed from: r */
    public final XEffectConfig f326573r;

    /* renamed from: s */
    public final C13601g f326574s;

    /* renamed from: t */
    public final C13601g<List<C109054b>> f326575t;

    /* renamed from: u */
    public final Vibrator f326576u;

    /* renamed from: kr1.b$d */
    public static final class C61145d extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C61145d f174081d = new C61145d();

        public C61145d() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getMMKV("record_beauty_" + C86709a0.m107523b().mo121110g());
        }
    }

    /* renamed from: kr1.b$a */
    public static final class C109040a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C109039b f326577d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109040a(C109039b bVar) {
            super(1);
            this.f326577d = bVar;
        }

        /* JADX WARNING: type inference failed for: r0v5, types: [android.view.View] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "PARAM_1_BOOLEAN"
                r0.putBoolean(r1, r4)
                kr1.b r1 = r3.f326577d
                qh2.e r1 = r1.f326564f
                qh2.e$b r2 = qh2.C101198e.C101199b.RECORD_BEAUTIFY_SETTING
                r1.mo14585p(r2, r0)
                if (r4 != 0) goto L_0x0052
                kr1.b r4 = r3.f326577d
                android.view.View r4 = r4.mo160167f()
                r0 = 2131303210(0x7f091b2a, float:1.8224528E38)
                android.view.View r4 = r4.findViewById(r0)
                boolean r0 = r4 instanceof is3.C108486c
                r1 = 0
                if (r0 == 0) goto L_0x0030
                is3.c r4 = (is3.C108486c) r4
                goto L_0x0031
            L_0x0030:
                r4 = r1
            L_0x0031:
                kr1.b r0 = r3.f326577d
                android.view.View r0 = r0.mo160167f()
                r2 = 2131303202(0x7f091b22, float:1.8224512E38)
                android.view.View r0 = r0.findViewById(r2)
                boolean r2 = r0 instanceof is3.C108485b
                if (r2 == 0) goto L_0x0045
                r1 = r0
                is3.b r1 = (is3.C108485b) r1
            L_0x0045:
                if (r4 != 0) goto L_0x0048
                goto L_0x004c
            L_0x0048:
                r0 = 1
                r4.setSuitMode(r0)
            L_0x004c:
                if (r1 == 0) goto L_0x0052
                r4 = 0
                r1.mo149675b(r4)
            L_0x0052:
                rx3.b0 r4 = rx3.C13598b0.f38549a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: kr1.C109039b.C109040a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: kr1.b$b */
    public static final class C109041b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C109039b f326578d;

        public C109041b(C109039b bVar) {
            this.f326578d = bVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/video/plugin/FinderRecordBeautifyPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C109039b bVar = this.f326578d;
            if (!bVar.f326570o) {
                bVar.mo160167f().findViewById(C0966R.C0970id.dfu).setOnClickListener(new C109045c(bVar));
                View findViewById = bVar.mo160167f().findViewById(C0966R.C0970id.f358108dg3);
                C108486c cVar = findViewById instanceof C108486c ? (C108486c) findViewById : null;
                View findViewById2 = bVar.mo160167f().findViewById(C0966R.C0970id.dfv);
                C108485b bVar2 = findViewById2 instanceof C108485b ? (C108485b) findViewById2 : null;
                if (cVar != null) {
                    cVar.setOnModeSwitch(new C109046d(bVar2));
                }
                if (cVar != null) {
                    cVar.setOnSuitSwitch(new C109047e(bVar2, bVar));
                }
                if (cVar != null) {
                    cVar.setSuit(bVar.f326572q);
                }
                if (bVar2 != null) {
                    bVar2.setOnRequestSeekByKey(new C109048f(bVar, cVar));
                }
                if (bVar2 != null) {
                    bVar2.setOnRequestDefaultSeekByKey(new C109049g(bVar, cVar));
                }
                if (bVar2 != null) {
                    bVar2.setOnSeekChanging(new C109050h(bVar));
                }
                if (bVar2 != null) {
                    bVar2.setOnSeekDone(C34024i.f91832d);
                }
                if (bVar2 != null) {
                    bVar2.setOnRequestReset(new C109051j(cVar, bVar, bVar2));
                }
                if (bVar2 != null) {
                    bVar2.setEffectItems((List) ((C36570n) bVar.f326575t).getValue());
                }
                EditorPanelHolder editorPanelHolder = this.f326578d.f326569n;
                C87412m.m108593f(editorPanelHolder, "settingHolder");
                EditorPanelHolder.m142603c(editorPanelHolder, this.f326578d.mo160167f(), (ViewGroup.LayoutParams) null, 2, (Object) null);
                this.f326578d.f326570o = true;
            }
            this.f326578d.f326569n.setShow(true);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/video/plugin/FinderRecordBeautifyPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: kr1.b$c */
    public static final class C109042c {
        public C109042c(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo160173a(String str, HashMap<Integer, Integer> hashMap, int i) {
            try {
                C109042c cVar = C109039b.f326557v;
                Log.m105924i("MicroMsg.FinderRecordBeautifyPlugin", "extractJsonToMap: " + str);
                C104289g gVar = new C104289g(str);
                hashMap.put(0, Integer.valueOf(gVar.optInt("skin_smooth", i)));
                hashMap.put(1, Integer.valueOf(gVar.optInt("face_morph", i)));
                hashMap.put(4, Integer.valueOf(gVar.optInt("eye_morph", i)));
                hashMap.put(2, Integer.valueOf(gVar.optInt("skin_bright", i)));
                hashMap.put(5, Integer.valueOf(gVar.optInt("eye_bright", i)));
                hashMap.put(3, Integer.valueOf(gVar.optInt("rosy", i)));
                hashMap.put(6, Integer.valueOf(gVar.optInt("eye_pouch", i)));
                hashMap.put(7, Integer.valueOf(gVar.optInt("smile_folds", i)));
                hashMap.put(8, Integer.valueOf(gVar.optInt("sharpen", i)));
                hashMap.put(9, Integer.valueOf(gVar.optInt("teeth_bright", i)));
                hashMap.put(10, Integer.valueOf(gVar.optInt("small_head", i)));
                hashMap.put(11, Integer.valueOf(gVar.optInt("cheek_bone", i)));
                hashMap.put(12, Integer.valueOf(gVar.optInt("lower_jawbone", i)));
                hashMap.put(13, Integer.valueOf(gVar.optInt("wing_of_nose", i)));
            } catch (Exception e) {
                C109042c cVar2 = C109039b.f326557v;
                Log.printErrStackTrace("MicroMsg.FinderRecordBeautifyPlugin", e, "json error: ", new Object[0]);
            }
        }
    }

    /* renamed from: kr1.b$e */
    public static final class C109043e extends C87413o implements C32224a<List<C109054b>> {

        /* renamed from: d */
        public final /* synthetic */ C109039b f326579d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109043e(C109039b bVar) {
            super(0);
            this.f326579d = bVar;
        }

        public Object invoke() {
            ArrayList arrayList = new ArrayList();
            C109039b bVar = this.f326579d;
            String string = bVar.f326562d.getContext().getResources().getString(C0966R.string.dhu);
            C87412m.m108593f(string, "parent.context.resources…_live_beauty_smooth_face)");
            arrayList.add(new C109054b(0, string, false, 4, (C8480h) null));
            String string2 = bVar.f326562d.getContext().getResources().getString(C0966R.string.dhr);
            C87412m.m108593f(string2, "parent.context.resources…nder_live_beauty_sharpen)");
            arrayList.add(new C109054b(8, string2, false, 4, (C8480h) null));
            String string3 = bVar.f326562d.getContext().getResources().getString(C0966R.string.dhm);
            C87412m.m108593f(string3, "parent.context.resources…r_live_beauty_morph_face)");
            arrayList.add(new C109054b(1, string3, false, 4, (C8480h) null));
            String string4 = bVar.f326562d.getContext().getResources().getString(C0966R.string.dhe);
            C87412m.m108593f(string4, "parent.context.resources…_live_beauty_bright_face)");
            arrayList.add(new C109054b(2, string4, false, 4, (C8480h) null));
            String string5 = bVar.f326562d.getContext().getResources().getString(C0966R.string.dhq);
            C87412m.m108593f(string5, "parent.context.resources….finder_live_beauty_rosy)");
            arrayList.add(new C109054b(3, string5, false, 4, (C8480h) null));
            String string6 = bVar.f326562d.getContext().getResources().getString(C0966R.string.dhs);
            C87412m.m108593f(string6, "parent.context.resources…r_live_beauty_small_head)");
            arrayList.add(new C109054b(10, string6, false, 4, (C8480h) null));
            String string7 = bVar.f326562d.getContext().getResources().getString(C0966R.string.dhl);
            C87412m.m108593f(string7, "parent.context.resources…er_live_beauty_morph_eye)");
            arrayList.add(new C109054b(4, string7, false, 4, (C8480h) null));
            String string8 = bVar.f326562d.getContext().getResources().getString(C0966R.string.dhd);
            C87412m.m108593f(string8, "parent.context.resources…r_live_beauty_bright_eye)");
            arrayList.add(new C109054b(5, string8, false, 4, (C8480h) null));
            String string9 = bVar.f326562d.getContext().getResources().getString(C0966R.string.dhh);
            C87412m.m108593f(string9, "parent.context.resources…er_live_beauty_eye_pouch)");
            arrayList.add(new C109054b(6, string9, false, 4, (C8480h) null));
            String string10 = bVar.f326562d.getContext().getResources().getString(C0966R.string.dht);
            C87412m.m108593f(string10, "parent.context.resources…_live_beauty_smile_folds)");
            arrayList.add(new C109054b(7, string10, false, 4, (C8480h) null));
            String string11 = bVar.f326562d.getContext().getResources().getString(C0966R.string.dhw);
            C87412m.m108593f(string11, "parent.context.resources…live_beauty_wing_of_nose)");
            arrayList.add(new C109054b(13, string11, false, 4, (C8480h) null));
            String string12 = bVar.f326562d.getContext().getResources().getString(C0966R.string.dhf);
            C87412m.m108593f(string12, "parent.context.resources…r_live_beauty_cheek_bone)");
            arrayList.add(new C109054b(11, string12, false, 4, (C8480h) null));
            String string13 = bVar.f326562d.getContext().getResources().getString(C0966R.string.dhk);
            C87412m.m108593f(string13, "parent.context.resources…nder_live_beauty_jawbone)");
            arrayList.add(new C109054b(12, string13, false, 4, (C8480h) null));
            String string14 = bVar.f326562d.getContext().getResources().getString(C0966R.string.dhv);
            C87412m.m108593f(string14, "parent.context.resources…live_beauty_teeth_bright)");
            arrayList.add(new C109054b(9, string14, false, 4, (C8480h) null));
            return arrayList;
        }
    }

    /* renamed from: kr1.b$f */
    public static final class C109044f extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C109039b f326580d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109044f(C109039b bVar) {
            super(0);
            this.f326580d = bVar;
        }

        public Object invoke() {
            return LayoutInflater.from(this.f326580d.f326563e.getContext()).inflate(C0966R.C0971layout.aok, this.f326580d.f326569n, false);
        }
    }

    static {
        C109042c cVar = new C109042c((C8480h) null);
        f326557v = cVar;
        HashMap hashMap = new HashMap();
        String I = C86709a0.m107535s().mo121142i().mo119675I(C72994y1.C72995a.USREINFO_FINDER_RECORD_BEAUTY_CONFIG_STRING, "{\n                \"skin_smooth\":35,\n                \"face_morph\":20,\n                \"eye_morph\":10,\n                \"skin_bright\":20,\n                \"eye_bright\":40,\n                \"rosy\":0,\n                \"eye_pouch\":80,\n                \"smile_folds\":80,\n                \"sharpen\":40,\n                \"teeth_bright\":30,\n                \"small_head\":0,\n                \"cheek_bone\":10,\n                \"lower_jawbone\":10,\n                \"wing_of_nose\":10\n                }");
        C87412m.m108593f(I, "selectedValue");
        cVar.mo160173a(I, hashMap, -1);
    }

    public C109039b(ViewGroup viewGroup, View view, C101198e eVar) {
        C87412m.m108594g(viewGroup, "parent");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(eVar, "status");
        this.f326562d = viewGroup;
        this.f326563e = view;
        this.f326564f = eVar;
        EditorPanelHolder editorPanelHolder = (EditorPanelHolder) viewGroup.findViewById(C0966R.C0970id.e6b);
        this.f326569n = editorPanelHolder;
        this.f326571p = C36568h.m40985a(new C109044f(this));
        this.f326573r = new XEffectConfig();
        this.f326574s = C36568h.m40985a(C61145d.f174081d);
        this.f326575t = C36568h.m40985a(new C109043e(this));
        Object systemService = this.f326563e.getContext().getSystemService("vibrator");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        this.f326576u = (Vibrator) systemService;
        editorPanelHolder.setOnVisibleChangeCallback(new C109040a(this));
        this.f326563e.setOnClickListener(new C109041b(this));
        MultiProcessMMKV b = mo160164b();
        int i = C61158a.f174107a;
        this.f326572q = b.getInt("beauty_suit", -1000);
        C109042c cVar = f326557v;
        Class cls = C32735h.class;
        String Y60 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_finder_record_beauty_config, f326559x);
        HashMap hashMap = new HashMap();
        C87412m.m108593f(Y60, "defaultValueJson");
        cVar.mo160173a(Y60, hashMap, 0);
        ArrayList<HashMap<Integer, Integer>> arrayList = f326558w;
        arrayList.add(hashMap);
        String Y602 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_finder_record_beauty_config2, f326560y);
        HashMap hashMap2 = new HashMap();
        C87412m.m108593f(Y602, "defaultValueJson2");
        cVar.mo160173a(Y602, hashMap2, 0);
        arrayList.add(hashMap2);
        String Y603 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_finder_record_beauty_config3, f326561z);
        HashMap hashMap3 = new HashMap();
        C87412m.m108593f(Y603, "defaultValueJson3");
        cVar.mo160173a(Y603, hashMap3, 0);
        arrayList.add(hashMap3);
    }

    /* renamed from: a */
    public final int mo160163a(int i, int i2) {
        if (i < 0) {
            return 0;
        }
        return mo160164b().getInt(mo160166d(i, i2), mo160165c(i, i2));
    }

    /* renamed from: b */
    public final MultiProcessMMKV mo160164b() {
        return (MultiProcessMMKV) this.f326574s.getValue();
    }

    /* renamed from: c */
    public final int mo160165c(int i, int i2) {
        HashMap hashMap = (HashMap) C110818d0.m150917O(f326558w, i);
        Integer num = hashMap != null ? (Integer) hashMap.get(Integer.valueOf(i2)) : null;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: d */
    public final String mo160166d(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append('-');
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: e */
    public boolean mo78564e() {
        if (!this.f326569n.mo151464b()) {
            return false;
        }
        this.f326569n.setShow(false);
        return true;
    }

    /* renamed from: f */
    public final View mo160167f() {
        Object value = ((C36570n) this.f326571p).getValue();
        C87412m.m108593f(value, "<get-settingView>(...)");
        return (View) value;
    }

    /* renamed from: g */
    public final void mo160168g() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("PARAM_BEAUTIFY_CONFIG", this.f326573r);
        this.f326564f.mo14585p(C101198e.C101199b.RECORD_BEAUTIFY_CONFIG, bundle);
    }

    /* renamed from: h */
    public final void mo160169h(int i, int i2) {
        switch (i) {
            case 0:
                this.f326573r.f318443g = i2;
                return;
            case 1:
                this.f326573r.f318445i = i2;
                return;
            case 2:
                this.f326573r.f318446j = i2;
                return;
            case 3:
                this.f326573r.f318448o = i2;
                return;
            case 4:
                this.f326573r.f318444h = i2;
                return;
            case 5:
                this.f326573r.f318447n = i2;
                return;
            case 6:
                this.f326573r.f318449p = i2;
                return;
            case 7:
                this.f326573r.f318450q = i2;
                return;
            case 8:
                this.f326573r.f318451r = i2;
                return;
            case 9:
                this.f326573r.f318452s = i2;
                return;
            case 10:
                this.f326573r.f318453t = i2;
                return;
            case 11:
                this.f326573r.f318454u = i2;
                return;
            case 12:
                this.f326573r.f318455v = i2;
                return;
            case 13:
                this.f326573r.f318456w = i2;
                return;
            default:
                return;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo160170i(boolean r5) {
        /*
            r4 = this;
            th2.d r0 = th2.C110992d.f332425a
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            java.lang.String r2 = "KEY_RECORD_IS_BEAUTIFY"
            r0.mo162677k(r2, r1)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "PARAM_BEAUTIFY_ENABLE"
            r0.putBoolean(r1, r5)
            qh2.e r1 = r4.f326564f
            qh2.e$b r2 = qh2.C101198e.C101199b.RECORD_BEAUTIFY
            r1.mo14585p(r2, r0)
            if (r5 == 0) goto L_0x008b
            int r0 = r4.f326572q
            int r1 = ks3.C61158a.f174107a
            r1 = -1000(0xfffffffffffffc18, float:NaN)
            if (r0 != r1) goto L_0x0062
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r1 = 12290(0x3002, float:1.7222E-41)
            r2 = 0
            java.lang.Object r0 = r0.mo119684e(r1, r2)
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x003c
            r2 = r0
            java.lang.Integer r2 = (java.lang.Integer) r2
        L_0x003c:
            r0 = 0
            if (r2 == 0) goto L_0x0044
            int r1 = r2.intValue()
            goto L_0x0045
        L_0x0044:
            r1 = 0
        L_0x0045:
            r2 = 2
            r3 = 1
            if (r1 != r2) goto L_0x004b
            r1 = 1
            goto L_0x004c
        L_0x004b:
            r1 = 0
        L_0x004c:
            if (r1 == 0) goto L_0x0053
            int r0 = ks3.C61159e.f174108a
            r4.f326572q = r3
            goto L_0x0057
        L_0x0053:
            int r1 = ks3.C61159e.f174108a
            r4.f326572q = r0
        L_0x0057:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = r4.mo160164b()
            int r1 = r4.f326572q
            java.lang.String r2 = "beauty_suit"
            r0.putInt(r2, r1)
        L_0x0062:
            rx3.g<java.util.List<ks3.b>> r0 = r4.f326575t
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0070:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0088
            java.lang.Object r1 = r0.next()
            ks3.b r1 = (ks3.C109054b) r1
            int r1 = r1.f326602a
            int r2 = r4.f326572q
            int r2 = r4.mo160163a(r2, r1)
            r4.mo160169h(r1, r2)
            goto L_0x0070
        L_0x0088:
            r4.mo160168g()
        L_0x008b:
            com.tencent.mm.plugin.xlabeffect.XEffectConfig r0 = r4.f326573r
            r0.f318441e = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kr1.C109039b.mo160170i(boolean):void");
    }

    /* renamed from: j */
    public final void mo160171j() {
        this.f326573r.f318440d = this.f326572q;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int i2 = 1;
            if (i < 14) {
                if (mo160163a(this.f326572q, i) != mo160165c(this.f326572q, i)) {
                    switch (i) {
                        case 1:
                            break;
                        case 2:
                            i2 = 2;
                            break;
                        case 3:
                            i2 = 12;
                            break;
                        case 4:
                            i2 = 3;
                            break;
                        case 5:
                            i2 = 4;
                            break;
                        case 6:
                            i2 = 9;
                            break;
                        case 7:
                            i2 = 10;
                            break;
                        case 8:
                            i2 = 11;
                            break;
                        case 9:
                            i2 = 13;
                            break;
                        case 10:
                            i2 = 5;
                            break;
                        case 11:
                            i2 = 6;
                            break;
                        case 12:
                            i2 = 7;
                            break;
                        case 13:
                            i2 = 8;
                            break;
                        default:
                            i2 = 0;
                            break;
                    }
                    arrayList.add(Integer.valueOf(i2));
                }
                i++;
            } else {
                JSONObject jSONObject = new JSONObject();
                int i3 = this.f326572q;
                jSONObject.put("suit", i3 < 0 ? 0 : i3 + 1);
                if (this.f326572q < 0) {
                    i2 = 0;
                }
                jSONObject.put("isBeauty", i2);
                if (this.f326573r.f318441e) {
                    jSONObject.put("beautyList", C110818d0.m150921S(arrayList, "#", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null));
                }
                XEffectConfig xEffectConfig = this.f326573r;
                String jSONObject2 = jSONObject.toString();
                C87412m.m108593f(jSONObject2, "json.toString()");
                xEffectConfig.f318439I = C112551y.m153814n(jSONObject2, ",", ";", false);
                return;
            }
        }
    }

    public String name() {
        return C109039b.class.getName();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttach() {
    }

    public void onDetach() {
    }

    public void onPause() {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C109344g0.C61280a.m71860a(this, i, strArr, iArr);
    }

    public void onResume() {
    }

    public void release() {
    }

    public void reset() {
    }

    public void setVisibility(int i) {
        if (this.f326565g) {
            View view = this.f326563e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/video/plugin/FinderRecordBeautifyPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/video/plugin/FinderRecordBeautifyPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
    }
}
