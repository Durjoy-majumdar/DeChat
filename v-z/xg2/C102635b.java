package xg2;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ViewGroup;
import c30.C104289g;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.autogen.mmdata.rpt.SightVideoLogStruct;
import com.tencent.p014mm.plugin.recordvideo.activity.MMRecordUI;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.plugin.parent.BasePluginLayout;
import com.tencent.p014mm.plugin.recordvideo.plugin.parent.DirectSendPhotoPluginLayout;
import com.tencent.p014mm.plugin.recordvideo.plugin.parent.EditPhotoPluginLayout;
import com.tencent.p014mm.plugin.recordvideo.plugin.parent.EditorVideoPluginLayoutNew;
import com.tencent.p014mm.plugin.recordvideo.plugin.parent.RecordPluginLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import gy3.C8480h;
import gy3.C87412m;
import h90.C98324b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import th2.C101891f;
import th2.C110992d;
import wg2.C102440a;
import zt3.C119157j;

/* renamed from: xg2.b */
public final class C102635b implements C102440a {

    /* renamed from: j */
    public static final C102636a f302228j = new C102636a((C8480h) null);

    /* renamed from: a */
    public final Context f302229a;

    /* renamed from: b */
    public final ViewGroup f302230b;

    /* renamed from: c */
    public final RecordConfigProvider f302231c;

    /* renamed from: d */
    public final SparseArray<Class<?>> f302232d;

    /* renamed from: e */
    public final Map<Integer, BasePluginLayout> f302233e = Collections.synchronizedMap(new HashMap());

    /* renamed from: f */
    public BasePluginLayout f302234f;

    /* renamed from: g */
    public boolean f302235g;

    /* renamed from: h */
    public boolean f302236h;

    /* renamed from: i */
    public int f302237i = -2;

    /* renamed from: xg2.b$a */
    public static final class C102636a {
        public C102636a(C8480h hVar) {
        }

        /* renamed from: a */
        public final int mo142293a(int i, List<String> list, List<String> list2) {
            int i2;
            int i3;
            if (-1 != i) {
                return i;
            }
            if (list == null || list.isEmpty()) {
                i2 = 0;
            } else {
                C87412m.m108591d(list);
                i2 = list.size();
            }
            if (list2 == null || list2.isEmpty()) {
                i3 = 0;
            } else {
                C87412m.m108591d(list2);
                i3 = list2.size();
            }
            if (i2 <= 2 && i3 == 0) {
                return 1;
            }
            if (i2 > 2 && i3 == 0) {
                return 3;
            }
            if ((i2 <= 0 || i3 <= 0) && i3 <= 1 && i2 <= 1) {
                return (i2 == 0 && i3 == 1) ? 2 : 0;
            }
            return 4;
        }
    }

    /* renamed from: xg2.b$b */
    public static final class C102637b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C102635b f302238d;

        public C102637b(C102635b bVar) {
            this.f302238d = bVar;
        }

        public final void run() {
            Map<Integer, BasePluginLayout> map = this.f302238d.f302233e;
            C87412m.m108593f(map, "viewMap");
            for (Map.Entry<Integer, BasePluginLayout> value : map.entrySet()) {
                ((BasePluginLayout) value.getValue()).release();
            }
        }
    }

    /* renamed from: xg2.b$c */
    public static final class C102638c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f302239d;

        /* renamed from: e */
        public final /* synthetic */ C102635b f302240e;

        /* renamed from: f */
        public final /* synthetic */ C98324b f302241f;

        /* renamed from: g */
        public final /* synthetic */ int f302242g;

        public C102638c(int i, C102635b bVar, C98324b bVar2, int i2) {
            this.f302239d = i;
            this.f302240e = bVar;
            this.f302241f = bVar2;
            this.f302242g = i2;
        }

        public final void run() {
            int i = this.f302239d;
            if (i == 0) {
                C102635b bVar = this.f302240e;
                if (!bVar.f302235g) {
                    Context context = bVar.f302229a;
                    C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.activity.MMRecordUI");
                    ((MMRecordUI) context).finish();
                    return;
                }
            }
            if (this.f302240e.f302233e.get(Integer.valueOf(i)) == null) {
                if (this.f302240e.f302232d.get(this.f302239d) == null) {
                    Log.m105920e("MicroMsg.RecordUIRouter", "No corresponding " + this.f302239d);
                    return;
                }
                Class<?> cls = this.f302240e.f302232d.get(this.f302239d);
                C87412m.m108592e(cls, "null cannot be cast to non-null type java.lang.Class<*>");
                Class cls2 = cls;
                Log.m105924i("MicroMsg.RecordUIRouter", "create BasePluginLayout :" + cls2.getSimpleName());
                this.f302240e.mo142292c(this.f302239d, cls2, false);
            }
            C102635b bVar2 = this.f302240e;
            BasePluginLayout basePluginLayout = bVar2.f302234f;
            bVar2.f302234f = bVar2.f302233e.get(Integer.valueOf(this.f302239d));
            BasePluginLayout basePluginLayout2 = this.f302240e.f302234f;
            if (basePluginLayout2 != null) {
                basePluginLayout2.mo129855l(this.f302241f);
            }
            BasePluginLayout basePluginLayout3 = this.f302240e.f302234f;
            if (basePluginLayout3 != null) {
                basePluginLayout3.bringToFront();
            }
            if (basePluginLayout != null) {
                basePluginLayout.onPause();
            }
            if (basePluginLayout != null) {
                basePluginLayout.onDetach();
            }
            int i2 = this.f302239d;
            if (i2 == 1) {
                C110992d.f332425a.mo162677k("KEY_EXIT_TIME_MS_LONG", Long.valueOf(System.currentTimeMillis()));
            } else if (i2 == 2) {
                C110992d.f332425a.mo162677k("KEY_EXIT_TIME_MS_LONG", Long.valueOf(System.currentTimeMillis()));
            } else if (i2 == 3) {
                C110992d dVar = C110992d.f332425a;
                dVar.mo162670d(19);
                dVar.mo162677k("KEY_EXIT_TIME_MS_LONG", Long.valueOf(System.currentTimeMillis()));
            }
            C101891f fVar = C101891f.f300035a;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            String simpleName = this.f302240e.f302232d.get(this.f302242g).getSimpleName();
            Log.m105924i("MicroMsg.VideoWidgetReporter", "setRouterLog >> time: " + elapsedRealtime + ", clazzName: " + simpleName);
            C104289g gVar = new C104289g();
            gVar.mo145954o("time", elapsedRealtime - C101891f.f300037c);
            gVar.put("clazz", simpleName);
            C101891f.f300038d.add(gVar.toString());
        }
    }

    public C102635b(Context context, ViewGroup viewGroup, RecordConfigProvider recordConfigProvider, int i) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(recordConfigProvider, "provider");
        this.f302229a = context;
        this.f302230b = viewGroup;
        this.f302231c = recordConfigProvider;
        SparseArray<Class<?>> sparseArray = new SparseArray<>();
        this.f302232d = sparseArray;
        Log.m105924i("MicroMsg.RecordUIRouter", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        sparseArray.put(0, RecordPluginLayout.class);
        if (recordConfigProvider.f272917S) {
            sparseArray.put(1, DirectSendPhotoPluginLayout.class);
        } else {
            sparseArray.put(1, EditPhotoPluginLayout.class);
        }
        sparseArray.put(2, EditorVideoPluginLayoutNew.class);
        HashMap hashMap = recordConfigProvider.f272914P;
        C87412m.m108593f(hashMap, "routerMap");
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                StringBuilder sb = new StringBuilder();
                sb.append("add route key:");
                Object key = entry.getKey();
                C87412m.m108592e(key, "null cannot be cast to non-null type kotlin.Int");
                sb.append(((Integer) key).intValue());
                sb.append(" value:");
                sb.append(entry.getValue());
                Log.m105924i("MicroMsg.RecordUIRouter", sb.toString());
                SparseArray<Class<?>> sparseArray2 = this.f302232d;
                Object key2 = entry.getKey();
                C87412m.m108592e(key2, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((Integer) key2).intValue();
                Object value = entry.getValue();
                C87412m.m108592e(value, "null cannot be cast to non-null type kotlin.String");
                sparseArray2.put(intValue, Class.forName((String) value));
            }
        }
        C101891f.f300035a.mo141377k(SystemClock.elapsedRealtime());
        SparseArray<Class<?>> sparseArray3 = this.f302232d;
        C87412m.m108594g(sparseArray3, "routeMap");
        Log.m105924i("MicroMsg.VideoWidgetReporter", "setRouterMap");
        StringBuilder sb4 = new StringBuilder();
        sb4.append("{");
        int size = sparseArray3.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb4.append(sparseArray3.valueAt(i2).getSimpleName());
            sb4.append("#");
        }
        sb4.append("}");
        SightVideoLogStruct sightVideoLogStruct = C101891f.f300036b;
        sightVideoLogStruct.f265892f = sightVideoLogStruct.mo86045b("RouterMap", sb4.toString(), true);
        if (i == 0) {
            this.f302235g = true;
            Class<?> cls = this.f302232d.get(0);
            C87412m.m108593f(cls, "viewTable[KEY_TO_RECORD]");
            mo142292c(0, cls, true);
        }
        Log.m105924i("MicroMsg.RecordUIRouter", "setEnableRecordPage " + this.f302235g);
    }

    /* renamed from: a */
    public void mo142011a() {
        Log.m105924i("MicroMsg.RecordUIRouter", "onDestroy " + this.f302234f);
        MMHandlerThread.postToMainThread(new C102637b(this));
    }

    /* renamed from: b */
    public void mo142012b(int i, C98324b bVar) {
        if (this.f302236h) {
            Log.m105924i("MicroMsg.RecordUIRouter", "isFinishing toWhere:" + i + "  MediaCaptureInfo:" + bVar);
            return;
        }
        C102636a aVar = f302228j;
        ArrayList<String> arrayList = null;
        ArrayList<String> arrayList2 = bVar != null ? bVar.f288190k : null;
        if (bVar != null) {
            arrayList = bVar.f288191l;
        }
        int a = aVar.mo142293a(i, arrayList2, arrayList);
        Log.m105924i("MicroMsg.RecordUIRouter", "toWhere:" + i + " real:" + a + " current:" + this.f302237i + " MediaCaptureInfo:" + bVar);
        if (a != this.f302237i) {
            this.f302237i = a;
            ((C119157j) C119157j.f356862d).mo183895z(new C102638c(a, this, bVar, i));
        }
    }

    /* renamed from: c */
    public final synchronized void mo142292c(int i, Class<?> cls, boolean z) {
        try {
            Object newInstance = cls.getConstructor(new Class[]{Context.class, AttributeSet.class}).newInstance(new Object[]{this.f302229a, null});
            C87412m.m108592e(newInstance, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout");
            BasePluginLayout basePluginLayout = (BasePluginLayout) newInstance;
            Log.m105924i("MicroMsg.RecordUIRouter", "loadViewFromClass key:" + i + " name:" + basePluginLayout.getClass().getName());
            basePluginLayout.mo128671k(this, this.f302231c);
            this.f302233e.put(Integer.valueOf(i), basePluginLayout);
            this.f302230b.addView(basePluginLayout, new ViewGroup.LayoutParams(-1, -1));
            if (!z) {
                basePluginLayout.setVisibility(8);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.RecordUIRouter", e, "", new Object[0]);
        }
        return;
    }
}
