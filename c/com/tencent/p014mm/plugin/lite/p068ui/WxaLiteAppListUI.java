package com.tencent.p014mm.plugin.lite.p068ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.liteapp.report.WxaLiteAppStartReport;
import com.tencent.liteapp.storage.WxaLiteAppBaselibInfo;
import com.tencent.liteapp.storage.WxaLiteAppInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.lite.C115472a;
import com.tencent.p014mm.plugin.lite.C115478f;
import com.tencent.p014mm.plugin.lite.C56832d;
import com.tencent.p014mm.plugin.lite.LiteAppCenter;
import com.tencent.p014mm.plugin.lite.logic.C115492q;
import com.tencent.p014mm.plugin.lite.storage.C115508j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p144dt.C7516d;
import p172io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import p244tt.C14088e;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.lite.ui.WxaLiteAppListUI */
public class WxaLiteAppListUI extends MMActivity {

    /* renamed from: h */
    public static Map<String, String> f346332h = new C115510a();

    /* renamed from: d */
    public ListView f346333d;

    /* renamed from: e */
    public ListView f346334e;

    /* renamed from: f */
    public C115513f f346335f;

    /* renamed from: g */
    public TextView f346336g;

    /* renamed from: com.tencent.mm.plugin.lite.ui.WxaLiteAppListUI$g */
    public static class C30153g implements C80883e<Bundle, Bundle> {
        private C30153g() {
        }

        public void invoke(Object obj, C1256g gVar) {
            Bundle bundle = (Bundle) obj;
            if (gVar != null) {
                gVar.mo894a(null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.lite.ui.WxaLiteAppListUI$b */
    public class C56843b implements AdapterView.OnItemClickListener {

        /* renamed from: com.tencent.mm.plugin.lite.ui.WxaLiteAppListUI$b$a */
        public class C56844a implements C56832d.C56833a {

            /* renamed from: a */
            public final /* synthetic */ C56832d f162875a;

            public C56844a(C56843b bVar, C56832d dVar) {
                this.f162875a = dVar;
            }

            /* renamed from: a */
            public String mo80258a(String str, String str2) {
                return "\"sync from native\"";
            }

            /* renamed from: b */
            public boolean mo80259b(long j, String str, String str2, int i) {
                if (str.equals("setData")) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new C56832d.C56834b("nativePointer", "\"setData from native\""));
                    this.f162875a.mo80257a(arrayList);
                    return false;
                }
                str.equals("throwError");
                return false;
            }
        }

        public C56843b() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/lite/ui/WxaLiteAppListUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            WxaLiteAppInfo a = WxaLiteAppListUI.this.f346335f.getItem(i);
            if (a != null) {
                Bundle bundle = new Bundle();
                bundle.putString("appId", a.f339290d);
                if (!LiteAppCenter.LITE_APP_BASE_LIB.equals(a.f339290d)) {
                    if (a.f339290d.equals("wxalite9f49cc96fb30017059f65139fee9f535")) {
                        bundle.putBoolean("transparent", true);
                    }
                    C56832d dVar = new C56832d();
                    dVar.f162866c = new C56844a(this, dVar);
                    ((C14088e) C86312j.m106911c(C14088e.class)).gc0(MMApplicationContext.getContext(), bundle, false, true, dVar, (C14088e.C14090b) null);
                } else {
                    C76701a.makeText((Context) WxaLiteAppListUI.this.getContext(), (CharSequence) "Is Base Lib ", 0).show();
                }
            } else {
                Map<String, String> map = WxaLiteAppListUI.f346332h;
                Log.m105918d("MicroMsg.WxaLiteAppListUI", "info is null.");
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/lite/ui/WxaLiteAppListUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.lite.ui.WxaLiteAppListUI$c */
    public class C56845c implements AdapterView.OnItemLongClickListener {
        public C56845c() {
        }

        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            WxaLiteAppInfo a = WxaLiteAppListUI.this.f346335f.getItem(i);
            if (a != null) {
                Bundle bundle = new Bundle();
                bundle.putString("appId", a.f339290d);
                bundle.putBoolean("isHalfScreen", true);
                bundle.putDouble("heightPercent", 0.75d);
                if (!LiteAppCenter.LITE_APP_BASE_LIB.equals(a.f339290d)) {
                    ((C14088e) C86312j.m106911c(C14088e.class)).mo13510OP(MMApplicationContext.getContext(), bundle, true, false, (C14088e.C14090b) null);
                } else {
                    C76701a.makeText((Context) WxaLiteAppListUI.this.getContext(), (CharSequence) "Is Base Lib ", 0).show();
                }
            } else {
                Map<String, String> map = WxaLiteAppListUI.f346332h;
                Log.m105918d("MicroMsg.WxaLiteAppListUI", "info is null.");
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.lite.ui.WxaLiteAppListUI$a */
    public class C115510a extends HashMap<String, String> {
        public C115510a() {
            put("wxalited0d6cb88ac866bcdf3b738f1f3df8872", "游戏中心视频流");
            put("wxalite57af7e6c7eea13b5e789762aecade923", "测试用例页面");
            put("wxalitecce81f5fba338df4dd5f74df8229c600", "游戏中心攻略页");
            put("wxalitea95723728764364c6f996b4bdab3af52", "游戏中心福利页");
        }
    }

    /* renamed from: com.tencent.mm.plugin.lite.ui.WxaLiteAppListUI$d */
    public class C115511d extends BaseAdapter {

        /* renamed from: d */
        public List<WxaLiteAppBaselibInfo> f346337d;

        public C115511d(Context context) {
            Bundle bundle;
            C115492q.m162360g().getClass();
            ArrayList arrayList = null;
            try {
                bundle = C115508j.m162396a("getLiteAppBaselibList", (String) null, (Bundle) null);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.LiteApp.LiteAppLogic", e, "", new Object[0]);
                bundle = null;
            }
            if (bundle == null) {
                Log.m105924i("MicroMsg.LiteApp.LiteAppLogic", "getLiteAppBaselibList bundle is null.");
            } else {
                bundle.setClassLoader(WxaLiteAppBaselibInfo.class.getClassLoader());
                if (bundle.containsKey("LiteAppBaselibList")) {
                    arrayList = bundle.getParcelableArrayList("LiteAppBaselibList");
                }
            }
            this.f346337d = arrayList;
        }

        public int getCount() {
            List<WxaLiteAppBaselibInfo> list = this.f346337d;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public Object getItem(int i) {
            List<WxaLiteAppBaselibInfo> list = this.f346337d;
            if (list == null || list.size() <= i) {
                return null;
            }
            return this.f346337d.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C115512e eVar;
            WxaLiteAppBaselibInfo wxaLiteAppBaselibInfo = this.f346337d.get(i);
            if (view == null || view.getTag() == null) {
                view = LayoutInflater.from(WxaLiteAppListUI.this.getContext()).inflate(C0966R.C0971layout.f359852b60, (ViewGroup) null, false);
                eVar = new C115512e(WxaLiteAppListUI.this, view);
                view.setTag(eVar);
            } else {
                eVar = (C115512e) view.getTag();
            }
            eVar.f346339a.setText("基础库 大版本号：" + wxaLiteAppBaselibInfo.f339281d);
            eVar.f346340b.setText("");
            return view;
        }
    }

    /* renamed from: com.tencent.mm.plugin.lite.ui.WxaLiteAppListUI$e */
    public class C115512e {

        /* renamed from: a */
        public TextView f346339a;

        /* renamed from: b */
        public TextView f346340b;

        public C115512e(WxaLiteAppListUI wxaLiteAppListUI, View view) {
            this.f346339a = (TextView) view.findViewById(C0966R.C0970id.knx);
            this.f346340b = (TextView) view.findViewById(C0966R.C0970id.k9f);
        }
    }

    /* renamed from: com.tencent.mm.plugin.lite.ui.WxaLiteAppListUI$f */
    public class C115513f extends BaseAdapter {

        /* renamed from: d */
        public List<WxaLiteAppInfo> f346341d = C115492q.m162360g().mo175473k();

        public C115513f(Context context) {
        }

        /* renamed from: a */
        public WxaLiteAppInfo getItem(int i) {
            List<WxaLiteAppInfo> list = this.f346341d;
            if (list == null || list.size() <= i) {
                return null;
            }
            return this.f346341d.get(i);
        }

        public int getCount() {
            List<WxaLiteAppInfo> list = this.f346341d;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
            /*
                r4 = this;
                java.util.List<com.tencent.liteapp.storage.WxaLiteAppInfo> r7 = r4.f346341d
                java.lang.Object r5 = r7.get(r5)
                com.tencent.liteapp.storage.WxaLiteAppInfo r5 = (com.tencent.liteapp.storage.WxaLiteAppInfo) r5
                if (r6 == 0) goto L_0x0017
                java.lang.Object r7 = r6.getTag()
                if (r7 == 0) goto L_0x0017
                java.lang.Object r7 = r6.getTag()
                com.tencent.mm.plugin.lite.ui.WxaLiteAppListUI$e r7 = (com.tencent.p014mm.plugin.lite.p068ui.WxaLiteAppListUI.C115512e) r7
                goto L_0x0034
            L_0x0017:
                com.tencent.mm.plugin.lite.ui.WxaLiteAppListUI r6 = com.tencent.p014mm.plugin.lite.p068ui.WxaLiteAppListUI.this
                androidx.appcompat.app.AppCompatActivity r6 = r6.getContext()
                android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
                r7 = 2131496211(0x7f0c0d13, float:1.861598E38)
                r0 = 0
                r1 = 0
                android.view.View r6 = r6.inflate(r7, r0, r1)
                com.tencent.mm.plugin.lite.ui.WxaLiteAppListUI$e r7 = new com.tencent.mm.plugin.lite.ui.WxaLiteAppListUI$e
                com.tencent.mm.plugin.lite.ui.WxaLiteAppListUI r0 = com.tencent.p014mm.plugin.lite.p068ui.WxaLiteAppListUI.this
                r7.<init>(r0, r6)
                r6.setTag(r7)
            L_0x0034:
                java.lang.String r0 = r5.f339290d
                java.lang.String r1 = r5.f339295i
                java.lang.String r2 = r5.f339294h
                com.tencent.p014mm.plugin.lite.C115478f.initLib()
                java.lang.String r1 = com.tencent.p014mm.plugin.lite.LiteAppCenter.getLiteAppMinBaseLibMajorVersion(r0, r1, r2)
                if (r1 == 0) goto L_0x0049
                int r2 = r1.length()
                if (r2 != 0) goto L_0x004b
            L_0x0049:
                java.lang.String r1 = "undefined"
            L_0x004b:
                java.util.Map<java.lang.String, java.lang.String> r2 = com.tencent.p014mm.plugin.lite.p068ui.WxaLiteAppListUI.f346332h
                java.lang.String r3 = r5.f339290d
                java.util.HashMap r2 = (java.util.HashMap) r2
                boolean r2 = r2.containsKey(r3)
                if (r2 == 0) goto L_0x0064
                java.util.Map<java.lang.String, java.lang.String> r0 = com.tencent.p014mm.plugin.lite.p068ui.WxaLiteAppListUI.f346332h
                java.lang.String r5 = r5.f339290d
                java.util.HashMap r0 = (java.util.HashMap) r0
                java.lang.Object r5 = r0.get(r5)
                r0 = r5
                java.lang.String r0 = (java.lang.String) r0
            L_0x0064:
                android.widget.TextView r5 = r7.f346339a
                r5.setText(r0)
                android.widget.TextView r5 = r7.f346340b
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r0 = "minBaselibMajorVersion: "
                r7.append(r0)
                r7.append(r1)
                java.lang.String r7 = r7.toString()
                r5.setText(r7)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.lite.p068ui.WxaLiteAppListUI.C115513f.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359853b61;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C115472a.f346202a.mo175446b(7, new WxaLiteAppStartReport());
        ((C7516d) C86312j.m106911c(C7516d.class)).mo8639v8("wxalitec8a16f9bf80f65dffb97cdf7760c1142", FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT, (C7516d.C7517a) null);
        this.f346336g = (TextView) findViewById(C0966R.C0970id.a7s);
        C115478f.initLib();
        String baseLibMajorVersion = LiteAppCenter.getBaseLibMajorVersion();
        TextView textView = this.f346336g;
        textView.setText("基础库列表  当前基础库大版本：" + baseLibMajorVersion);
        ((TextView) findViewById(C0966R.C0970id.f5856qj)).setText("App列表");
        this.f346333d = (ListView) findViewById(C0966R.C0970id.a7t);
        this.f346333d.setAdapter(new C115511d(this));
        this.f346334e = (ListView) findViewById(C0966R.C0970id.f5857qk);
        C115513f fVar = new C115513f(this);
        this.f346335f = fVar;
        this.f346334e.setAdapter(fVar);
        this.f346334e.setOnItemClickListener(new C56843b());
        this.f346334e.setOnItemLongClickListener(new C56845c());
    }

    public void onResume() {
        super.onResume();
        C115478f.initLib();
        String baseLibMajorVersion = LiteAppCenter.getBaseLibMajorVersion();
        TextView textView = this.f346336g;
        textView.setText("基础库列表  当前基础库大版本：" + baseLibMajorVersion);
        this.f346335f.notifyDataSetChanged();
    }
}
