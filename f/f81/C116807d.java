package f81;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import com.tencent.p014mm.feature.expt.forward.ForwardReport;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.HellSessionCloudConfig;
import com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.HellSessionPageCloudConfig;
import com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.HellSessionUBACloudConfig;
import com.tencent.p014mm.plugin.expt.pageflow.MMPageFlowService;
import com.tencent.p014mm.plugin.expt.shell.ExptServiceShell;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import d91.C20450b;
import d91.C20451c;
import d91.C20452d;
import d91.C20453e;
import di3.C86301e;
import e91.C116711b;
import e91.C20552a;
import ei3.C86522b;
import f40.C86709a0;
import f40.C86718e;
import f91.C116850b;
import ga1.C20819a;
import h81.C20928j;
import h81.C32735h;
import ha1.C20933a;
import i20.C21043a;
import i81.C117143b;
import i81.C117145h;
import i81.C21058a;
import i81.C87675c;
import i81.C87676d;
import i81.C87677e;
import i81.C87678f;
import i81.C87679g;
import i91.C21062c;
import j40.C87829b;
import ja1.C21208a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l91.C21398a;
import la1.C61258b;
import ma1.C117543a;
import n91.C117614e;
import n91.C21608a;
import n91.C21619f;
import na1.C34747b;
import na1.C34749c;
import oa1.C117731d;
import pa1.C117998b;
import pa1.C35418c;
import pa1.C47444d;
import rx3.C13598b0;
import rx3.C13604l;
import rx3.C36570n;
import sf0.C90189z;
import sn0.C90259e;
import sx3.C90363p0;
import sx3.C90364q0;
import t91.C22463h;
import t91.C22464i;
import t91.C22466j;
import t91.C22471n;
import t91.C36981l;
import v91.C22731f;
import w91.C22880b;
import y91.C118948a;
import z91.C23462b;
import zh3.C91753f;

@C86522b
/* renamed from: f81.d */
public class C116807d extends C86301e implements C7998c {

    /* renamed from: e */
    public static HashMap<Integer, C91753f.C66827b> f350154e;

    /* renamed from: d */
    public C90189z.C90190a f350155d;

    /* renamed from: f81.d$a */
    public class C45763a implements C91753f.C66827b {
        /* renamed from: a */
        public String[] mo6410a() {
            return C47444d.f127266e;
        }
    }

    /* renamed from: f81.d$b */
    public class C116808b implements C91753f.C66827b {
        /* renamed from: a */
        public String[] mo6410a() {
            return C117998b.f352692e;
        }
    }

    static {
        HashMap<Integer, C91753f.C66827b> hashMap = new HashMap<>();
        f350154e = hashMap;
        hashMap.put(1209385830, new C45763a());
        f350154e.put(-575865227, new C116808b());
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        boolean z = false;
        Log.m105925i("MicroMsg.PluginExpt", "Plugin expt onAccountInitialized [%d] [%d]", Integer.valueOf(hashCode()), Integer.valueOf(C117543a.Cx0().hashCode()));
        vx0();
        C90189z.C90190a aVar = this.f350155d;
        if (aVar != null) {
            if (aVar != null) {
                aVar.mo124435t(hashCode());
            }
            this.f350155d = null;
            C117543a Cx0 = C117543a.Cx0();
            Cx0.f351658d = null;
            Cx0.f351659e = null;
        }
        this.f350155d = C90189z.m112866a(hashCode(), C86709a0.m107535s().f251807e + "WxExpt.db", f350154e, true);
        C117543a Cx02 = C117543a.Cx0();
        C90189z.C90190a aVar2 = this.f350155d;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(Cx02.hashCode());
        if (aVar2 != null) {
            z = true;
        }
        objArr[1] = Boolean.valueOf(z);
        Log.m105925i("MicroMsg.ExptService", "reset DB [%d] dataDB[%b]", objArr);
        if (aVar2 != null) {
            Cx02.f351658d = new C47444d(aVar2);
            Cx02.f351659e = new C117998b(aVar2);
        }
        ExptServiceShell.f81005a.clear();
        if (WeChatEnvironment.hasDebugger()) {
            Log.m105924i("MicroMsg.ExptServiceShell", "setup");
            ExptServiceShell.f81006b.alive();
        }
        C34749c cVar = C34749c.f93410a;
        Log.m105918d("AssetMonitor", "onAccountInitialized() called process:" + MMApplicationContext.getProcessName());
        C34749c.f93414e.alive();
    }

    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        Log.m105925i("MicroMsg.PluginExpt", "Plugin expt onAccountRelease [%d] [%d]", Integer.valueOf(hashCode()), Integer.valueOf(C117543a.Cx0().hashCode()));
        C34749c.f93414e.dead();
        if (MMApplicationContext.isMainProcess()) {
            long currentTicks = Util.currentTicks();
            C117731d.m166007c().getClass();
            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("WxExptConfig");
            Log.m105925i("MicroMsg.PluginExpt", "reset uin to mmkv uin[%d] save[%b] cost[%d]", 0, Boolean.valueOf(mmkv != null ? mmkv.putInt("expt_uin", 0).commit() : false), Long.valueOf(Util.ticksToNow(currentTicks)));
        }
        C90189z.C90190a aVar = this.f350155d;
        if (aVar != null) {
            aVar.mo124435t(hashCode());
        }
        this.f350155d = null;
        C117543a Cx0 = C117543a.Cx0();
        Cx0.f351658d = null;
        Cx0.f351659e = null;
    }

    public void onCreate(Context context) {
        super.onCreate(context);
        C87829b a = C86709a0.m107531m().mo58407a();
        vx0();
        if (a.f124990c != null) {
            if (Util.getInt(C35418c.m40699b().mo60251c(C32735h.C32737c.clicfg_weixin_register_mm_life_call, "", false), 0) > 0) {
                a.f124990c.registerActivityLifecycleCallbacks(MMPageFlowService.wx0());
            }
            a.f124990c.registerActivityLifecycleCallbacks(C61258b.vx0());
        }
        Class cls = C20928j.class;
        Log.m105924i("HABBYGE-MALI.HellhoundService", "IHellhoundService Start !!!");
        C86709a0.m107532n(cls, new C20453e());
        C20928j jVar = (C20928j) C86709a0.m107533q(cls);
        HellSessionCloudConfig.m162211a().f345914a.alive();
        HellSessionPageCloudConfig.m162212a().f345917a.alive();
        HellSessionUBACloudConfig.m162216a().f345920a.alive();
        jVar.mo32001a4(C20453e.f57484e);
        jVar.mo32002hb(new C20450b());
        C20552a a2 = C20552a.m22323a();
        C20451c cVar = new C20451c();
        a2.getClass();
        C21062c.m23249d().f59586a.f59587a.f59588a = cVar;
        jVar.mo32000ZC(new C20452d());
        jVar.mo32003tx(a.f124990c);
        C22880b.m26858f(104, "", 0, 0);
        C20819a aVar = C23462b.m28021f().f67289a;
        aVar.getClass();
        Log.m105924i("HABBYGE-MALI.FloatBallSessionHandler", "FloatBallSessionHandler, startMonitor");
        C21043a.m23197h().mo32758l(aVar.f58824a, aVar.f58825b);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Pair.create("processOnItemClick", "(II)V"));
        HashMap hashMap = new HashMap();
        hashMap.put("com/tencent/mm/ui/PlusSubMenuHelper", arrayList);
        C21043a.m23197h().mo32758l(hashMap, C21208a.f59983b);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Pair.create("onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z"));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("com/tencent/mm/ui/AbstractTabChildPreference", arrayList2);
        C21043a.m23197h().mo32758l(hashMap2, C20933a.f59284c);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new Pair("requestPermissions", "([Ljava/lang/String;I)V"));
        C21043a.m23197h().mo32755i(arrayList3, C118948a.f356271d);
        Map<String, WeakReference<View>> map = C117614e.f351842a;
        C21619f fVar = (C21619f) ((C36570n) C117614e.f351843b).getValue();
        C117614e.C21617c cVar2 = C117614e.f351846e;
        fVar.f61210a = cVar2;
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(new Pair("onClick", "(Landroid/view/View;)V"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("android/view/View$OnClickListener", arrayList4);
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(new Pair("onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z"));
        linkedHashMap.put("android/view/View$OnDragListener", arrayList5);
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add(new Pair("onLongClick", "(Landroid/view/View;)Z"));
        linkedHashMap.put("android/view/View$OnLongClickListener", arrayList6);
        ArrayList arrayList7 = new ArrayList();
        arrayList7.add(new Pair("onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z"));
        linkedHashMap.put("android/view/View$OnKeyListener", arrayList7);
        ArrayList arrayList8 = new ArrayList();
        arrayList8.add(new Pair("onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z"));
        linkedHashMap.put("android/view/View$OnTouchListener", arrayList8);
        ArrayList arrayList9 = new ArrayList();
        arrayList9.add(new Pair("onHover", "(Landroid/view/View;Landroid/view/MotionEvent;)Z"));
        linkedHashMap.put("android/view/View$OnHoverListener", arrayList9);
        ArrayList arrayList10 = new ArrayList();
        arrayList10.add(new Pair("onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"));
        linkedHashMap.put("android/widget/AdapterView$OnItemClickListener", arrayList10);
        ArrayList arrayList11 = new ArrayList();
        arrayList11.add(new Pair("onItemLongClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"));
        linkedHashMap.put("android/widget/AdapterView$OnItemLongClickListener", arrayList11);
        ArrayList arrayList12 = new ArrayList();
        arrayList12.add(new Pair("onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"));
        linkedHashMap.put("android/widget/AdapterView$OnItemSelectedListener", arrayList12);
        ArrayList arrayList13 = new ArrayList();
        arrayList13.add(new Pair("onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V"));
        linkedHashMap.put("androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", arrayList13);
        ArrayList arrayList14 = new ArrayList();
        arrayList14.add(new Pair("onClick", "(Landroid/view/View;)V"));
        linkedHashMap.put("android/text/style/ClickableSpan", arrayList14);
        ArrayList arrayList15 = new ArrayList();
        arrayList15.add(new Pair("onClick", "(Landroid/view/View;)V"));
        linkedHashMap.put("com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", arrayList15);
        C21043a.m23197h().mo32758l(linkedHashMap, fVar.f61214e);
        ArrayList arrayList16 = new ArrayList();
        arrayList16.add(new Pair("onTouchEvent", "(Landroid/view/MotionEvent;)Z"));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView", arrayList16);
        C21043a.m23197h().mo32758l(linkedHashMap2, fVar.f61216g);
        C21608a aVar2 = (C21608a) ((C36570n) C117614e.f351844c).getValue();
        aVar2.f61183a = cVar2;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        ArrayList arrayList17 = new ArrayList();
        arrayList17.add(new Pair("onSingleTapUp", "(Landroid/view/MotionEvent;)Z"));
        arrayList17.add(new Pair(C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V"));
        linkedHashMap3.put("android/view/GestureDetector$OnGestureListener", arrayList17);
        ArrayList arrayList18 = new ArrayList();
        arrayList18.add(new Pair("onDoubleTap", "(Landroid/view/MotionEvent;)Z"));
        linkedHashMap3.put("android/view/GestureDetector$OnDoubleTapListener", arrayList18);
        ArrayList arrayList19 = new ArrayList();
        arrayList19.add(new Pair("onContextClick", "(Landroid/view/MotionEvent;)Z"));
        linkedHashMap3.put("android/view/GestureDetector$OnContextClickListener", arrayList19);
        ArrayList arrayList20 = new ArrayList();
        arrayList20.add(new Pair("onSingleTapUp", "(Landroid/view/MotionEvent;)Z"));
        arrayList20.add(new Pair(C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V"));
        arrayList20.add(new Pair("onDoubleTap", "(Landroid/view/MotionEvent;)Z"));
        arrayList20.add(new Pair("onContextClick", "(Landroid/view/MotionEvent;)Z"));
        linkedHashMap3.put("android/view/GestureDetector$SimpleOnGestureListener", arrayList20);
        C21043a.m23197h().mo32758l(linkedHashMap3, aVar2.f61186d);
        ArrayList arrayList21 = new ArrayList();
        arrayList21.add(new Pair("onTouchEvent", "(Landroid/view/MotionEvent;)Z"));
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("android/view/GestureDetector", arrayList21);
        C21043a.m23197h().mo32756j(linkedHashMap4, aVar2.f61185c);
        C22466j jVar2 = C22466j.f63621a;
        Log.m105924i("HABBYGE-MALI.RecyclerCallback", "monitor...");
        C21043a.m23197h().mo32758l(C22466j.f63622b, C22466j.f63623c);
        C36981l lVar = C22466j.f63627g;
        lVar.getClass();
        Log.m105924i("HABBYGE-MALI.RefreshLoadMoreCallback", "startMonitor...");
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList22 = new ArrayList();
        arrayList22.add(Pair.create("onRefreshBegin", "(I)V"));
        arrayList22.add(Pair.create("onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V"));
        arrayList22.add(Pair.create("onLoadMoreBegin", "()V"));
        arrayList22.add(Pair.create("onLoadMoreEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V"));
        hashMap3.put("com/tencent/mm/view/RefreshLoadMoreLayout$ActionCallback", arrayList22);
        C22463h hVar = new C22463h();
        Log.m105924i("HABBYGE-MALI.RLBeginCallback", "startMonitor...");
        C21043a.m23197h().mo32758l(hashMap3, hVar);
        C22464i iVar = new C22464i(lVar);
        Log.m105924i("HABBYGE-MALI.RLEndCallback", "startMonitor...");
        C21043a.m23197h().mo32758l(iVar.f63618b, iVar.f63619c);
        C22471n nVar = new C22471n(lVar);
        C21043a.m23197h().mo32758l(nVar.f63639b, nVar.f63640c);
        C22731f.C22732a aVar3 = C22731f.f65379a;
        synchronized (aVar3) {
            if (C116711b.m164589n()) {
                Log.m105924i("HABBYGE-MALI.PageStatisticsDao", "reset");
                C116850b.m164834d("hell_pge_sttics_d_1", new byte[0]);
            }
        }
        aVar3.mo35824i();
        C21398a.f60539b = false;
        C21398a.f60540c = false;
        C21398a.f60541d = false;
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        ArrayList arrayList23 = new ArrayList();
        arrayList23.add(new Pair("doAttach", "(Landroid/content/Context;)V"));
        arrayList23.add(new Pair("onEnterBegin", "()V"));
        arrayList23.add(new Pair("onExitBegin", "()V"));
        arrayList23.add(new Pair("doResume", "()V"));
        arrayList23.add(new Pair("doPause", "()V"));
        arrayList23.add(new Pair("onExitEnd", "()V"));
        linkedHashMap5.put("com/tencent/mm/ui/chatting/ChattingUIFragment", arrayList23);
        C21043a.m23197h().mo32758l(linkedHashMap5, C21398a.f60544g);
        Map<String, List<Pair<String, String>>> map2 = C117143b.f350976a;
        ArrayList arrayList24 = new ArrayList();
        arrayList24.add(Pair.create("killProcess", "(I)V"));
        Map<String, List<Pair<String, String>>> map3 = C117143b.f350976a;
        HashMap hashMap4 = (HashMap) map3;
        hashMap4.put("android/os/Process", arrayList24);
        ArrayList arrayList25 = new ArrayList();
        arrayList25.add(Pair.create("exit", "(I)V"));
        hashMap4.put("java/lang/System", arrayList25);
        C21043a.m23197h().mo32756j(map3, C117143b.f350977b);
        HashMap<String, Map<String, List<Pair<String, String>>>> hashMap5 = C21058a.f59577a;
        ArrayList arrayList26 = new ArrayList();
        arrayList26.add(new Pair("onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z"));
        HashMap hashMap6 = new HashMap();
        hashMap6.put("android/view/View$OnTouchListener", arrayList26);
        HashMap<String, Map<String, List<Pair<String, String>>>> hashMap7 = C21058a.f59577a;
        hashMap7.put("com/tencent/mm/ui/chatting/ChattingListEventListener$ChattingListTouchListener", hashMap6);
        C21043a.m23197h().mo32760n(hashMap7, C21058a.f59578b);
        HashMap<String, List<Pair<String, String>>> hashMap8 = C117145h.f350978a;
        ArrayList arrayList27 = new ArrayList();
        arrayList27.add(Pair.create("listen", "(Landroid/telephony/PhoneStateListener;I)V"));
        HashMap<String, List<Pair<String, String>>> hashMap9 = C117145h.f350978a;
        hashMap9.put("android/telephony/TelephonyManager", arrayList27);
        C21043a.m23197h().mo32756j(hashMap9, C117145h.f350979b);
        HashMap<String, List<Pair<String, String>>> hashMap10 = C87679g.f253959b;
        ArrayList arrayList28 = new ArrayList();
        arrayList28.add(Pair.create("getConnectionInfo", "()Landroid/net/wifi/WifiInfo;"));
        arrayList28.add(Pair.create("getScanResults", "()Ljava/util/List;"));
        arrayList28.add(Pair.create("startScan", "()Z"));
        hashMap10.put("android/net/wifi/WifiManager", arrayList28);
        C21043a.m23197h().mo32757k(hashMap10, new C87675c());
        HashMap<String, List<Pair<String, String>>> hashMap11 = C87679g.f253960c;
        ArrayList arrayList29 = new ArrayList();
        arrayList29.add(Pair.create("getAllCellInfo", "()Ljava/util/List;"));
        arrayList29.add(Pair.create("getCellLocation", "()Landroid/telephony/CellLocation;"));
        arrayList29.add(Pair.create("getSubscriberId", "()Ljava/lang/String;"));
        arrayList29.add(Pair.create("getLine1Number", "()Ljava/lang/String;"));
        arrayList29.add(Pair.create("getDeviceId", "()Ljava/lang/String;"));
        arrayList29.add(Pair.create("getImei", "()Ljava/lang/String;"));
        arrayList29.add(Pair.create("getImei", "(I)Ljava/lang/String;"));
        arrayList29.add(Pair.create("getMeid", "()Ljava/lang/String;"));
        arrayList29.add(Pair.create("getMeid", "(I)Ljava/lang/String;"));
        hashMap11.put("android/telephony/TelephonyManager", arrayList29);
        C21043a.m23197h().mo32757k(hashMap11, new C87676d());
        HashMap<String, List<Pair<String, String>>> hashMap12 = C87679g.f253961d;
        ArrayList arrayList30 = new ArrayList();
        arrayList30.add(Pair.create("startDiscovery", "()Z"));
        arrayList30.add(Pair.create("startLeScan", "([Ljava/util/UUID;Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)Z"));
        arrayList30.add(Pair.create("startLeScan", "(Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)Z"));
        hashMap12.put("android/bluetooth/BluetoothAdapter", arrayList30);
        ArrayList arrayList31 = new ArrayList();
        arrayList31.add(Pair.create("startScan", "(Landroid/bluetooth/le/ScanCallback;)V"));
        arrayList31.add(Pair.create("startScan", "(Ljava/util/List;Landroid/bluetooth/le/ScanSettings;Landroid/bluetooth/le/ScanCallback;)V"));
        arrayList31.add(Pair.create("startScan", "(Ljava/util/List;Landroid/bluetooth/le/ScanSettings;Landroid/app/PendingIntent;)I"));
        hashMap12.put("android/bluetooth/le/BluetoothLeScanner", arrayList31);
        C21043a.m23197h().mo32757k(hashMap12, new C87677e());
        HashMap<String, List<Pair<String, String>>> hashMap13 = C87679g.f253962e;
        ArrayList arrayList32 = new ArrayList();
        arrayList32.add(Pair.create("getString", "(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;"));
        hashMap13.put("android/provider/Settings$Secure", arrayList32);
        C21043a.m23197h().mo32757k(hashMap13, new C87678f());
        C34749c cVar3 = C34749c.f93410a;
        Log.m105924i("AssetMonitor", "monitor() called");
        ArrayList arrayList33 = new ArrayList();
        arrayList33.add(Pair.create(WeChatBrands.Business.GROUP_OPEN, "(Ljava/lang/String;)Ljava/io/InputStream;"));
        Map b = C90363p0.m113143b(new C13604l("android/content/res/AssetManager", arrayList33));
        ArrayList arrayList34 = new ArrayList();
        arrayList34.add(Pair.create("getDrawableForDensity", "(IILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;"));
        arrayList34.add(Pair.create("getXml", "(I)Landroid/content/res/XmlResourceParser;"));
        arrayList34.add(Pair.create("openRawResource", "(I)Ljava/io/InputStream;"));
        C13598b0 b0Var = C13598b0.f38549a;
        ArrayList arrayList35 = new ArrayList();
        arrayList35.add(Pair.create("inflate", "(ILandroid/view/ViewGroup;Z)Landroid/view/View;"));
        Map f = C90364q0.m113147f(new C13604l("com/tencent/mm/resources/MMResources", arrayList34), new C13604l("com/tencent/mm/ui/MMLayoutInflater$MMLayoutInflaterWrapper", arrayList35));
        ArrayList arrayList36 = new ArrayList();
        arrayList36.add(Pair.create("onCreate", "(Landroid/os/Bundle;)V"));
        arrayList36.add(Pair.create("onDestroy", "()V"));
        ArrayList arrayList37 = new ArrayList();
        arrayList37.add(Pair.create("onActivityPreCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V"));
        arrayList37.add(Pair.create("onActivityPostDestroyed", "(Landroid/app/Activity;)V"));
        Map f2 = C90364q0.m113147f(new C13604l("com/tencent/mm/ui/MMFragmentActivity", arrayList36), new C13604l("com/tencent/mm/ui/vas/lifecycle/VASLifeCycleMonitor", arrayList37));
        C21043a.m23197h().mo32756j(b, C34749c.f93411b);
        C21043a.m23197h().mo32758l(f, C34749c.f93412c);
        C21043a.m23197h().mo32758l(f2, C34749c.f93413d);
        ForwardReport.f266739e.alive();
        MMFragmentActivity.aMonitor = C34747b.f93408b;
    }

    public final void vx0() {
        boolean z;
        if (MMApplicationContext.isMainProcess()) {
            long currentTicks = Util.currentTicks();
            int g = C86709a0.m107522a() ? C86709a0.m107523b().mo121110g() : C86718e.m107549h();
            if (g != 0) {
                C117731d.m166007c().getClass();
                MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("WxExptConfig");
                if (mmkv != null) {
                    z = mmkv.putInt("expt_uin", g).commit();
                    Log.m105925i("MicroMsg.PluginExpt", "save uin to mmkv uin[%d] save[%b] cost[%d]", Integer.valueOf(g), Boolean.valueOf(z), Long.valueOf(Util.ticksToNow(currentTicks)));
                }
            }
            z = false;
            Log.m105925i("MicroMsg.PluginExpt", "save uin to mmkv uin[%d] save[%b] cost[%d]", Integer.valueOf(g), Boolean.valueOf(z), Long.valueOf(Util.ticksToNow(currentTicks)));
        }
    }
}
