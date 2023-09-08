package vx2;

import a70.C112760b;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C39630m0;
import ay2.C67121f;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.p014mm.vfs.VFSStrategy$$b;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import com.tencent.xweb.file.XVFSFile;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import fy3.C32224a;
import gc0.C20828a;
import gy3.C87412m;
import gy3.C87413o;
import hc0.C20937c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p261wl.C38166b;
import rx3.C13598b0;
import te3.C64459j13;
import vx2.C65902r;
import wx2.C66204d;
import zh3.C91753f;
import zt3.C119157j;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS})
/* renamed from: vx2.i */
public final class C65900i extends C86301e implements C37860g, C0123n0 {

    /* renamed from: d */
    public C65902r f189462d;

    /* renamed from: e */
    public final C39630m0 f189463e = new C39630m0();

    /* renamed from: vx2.i$a */
    public static final class C15019a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C15019a f41152d = new C15019a();

        public C15019a() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: vx2.i$b */
    public static final class C15020b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Bundle f41153d;

        /* renamed from: e */
        public final /* synthetic */ String f41154e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15020b(Bundle bundle, String str) {
            super(0);
            this.f41153d = bundle;
            this.f41154e = str;
        }

        public Object invoke() {
            this.f41153d.putString("path", this.f41154e);
            C80907o.m98781d(WeChatProcess.PROCESS_MAIN, this.f41153d, C65899a.class, C15027j.f41164d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: vx2.i$c */
    public static final class C15021c<T> implements C1256g {

        /* renamed from: d */
        public static final C15021c<T> f41155d = new C15021c<>();

        /* renamed from: a */
        public void mo894a(Object obj) {
            Bundle bundle = (Bundle) obj;
            StringBuilder sb = new StringBuilder();
            sb.append("invoker callback result:");
            sb.append(bundle != null ? bundle.getBoolean("result") : false);
            Log.m105924i("MicroMsg.TaskBar.PluginTaskBar", sb.toString());
        }
    }

    /* renamed from: vx2.i$d */
    public static final class C15022d<T> implements C1256g {

        /* renamed from: d */
        public static final C15022d<T> f41156d = new C15022d<>();

        /* renamed from: a */
        public void mo894a(Object obj) {
            Bundle bundle = (Bundle) obj;
            StringBuilder sb = new StringBuilder();
            sb.append("removeTaskInfo invoker callback result:");
            sb.append(bundle != null ? bundle.getBoolean("result") : false);
            Log.m105924i("MicroMsg.TaskBar.PluginTaskBar", sb.toString());
        }
    }

    /* renamed from: vx2.i$e */
    public static final class C15023e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f41157d;

        /* renamed from: e */
        public final /* synthetic */ String f41158e;

        /* renamed from: f */
        public final /* synthetic */ C32224a<C13598b0> f41159f;

        public C15023e(Bitmap bitmap, String str, C32224a<C13598b0> aVar) {
            this.f41157d = bitmap;
            this.f41158e = str;
            this.f41159f = aVar;
        }

        public final void run() {
            try {
                BitmapUtil.saveBitmapToImage(this.f41157d, 100, Bitmap.CompressFormat.JPEG, this.f41158e, false);
            } catch (Throwable th) {
                this.f41159f.invoke();
                throw th;
            }
            this.f41159f.invoke();
        }
    }

    /* renamed from: vx2.i$f */
    public static final class C15024f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C15024f f41160d = new C15024f();

        public C15024f() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: vx2.i$g */
    public static final class C15025g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Bundle f41161d;

        /* renamed from: e */
        public final /* synthetic */ String f41162e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15025g(Bundle bundle, String str) {
            super(0);
            this.f41161d = bundle;
            this.f41162e = str;
        }

        public Object invoke() {
            this.f41161d.putString("path", this.f41162e);
            C80907o.m98781d(WeChatProcess.PROCESS_MAIN, this.f41161d, C65899a.class, C15028k.f41165d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: vx2.i$h */
    public static final class C15026h<T> implements C1256g {

        /* renamed from: d */
        public static final C15026h<T> f41163d = new C15026h<>();

        /* renamed from: a */
        public void mo894a(Object obj) {
            Bundle bundle = (Bundle) obj;
            StringBuilder sb = new StringBuilder();
            sb.append("invoker callback result:");
            sb.append(bundle != null ? bundle.getBoolean("result") : false);
            Log.m105924i("MicroMsg.TaskBar.PluginTaskBar", sb.toString());
        }
    }

    public final void Ax0(String str, int i, C64459j13 j132, byte[] bArr, boolean z) {
        C87412m.m108594g(str, "id");
        MultiTaskInfo wx02 = wx0(str);
        if (wx02 != null) {
            Log.m105924i("MicroMsg.TaskBar.PluginTaskBar", "updateTaskInfo id:" + str + " type:" + i + " updateBitmapOnly:" + z);
            wx02.field_updateTime = System.currentTimeMillis();
            if (!z) {
                wx02.field_showData = j132;
                if (bArr != null) {
                    wx02.field_data = bArr;
                }
            }
            C65902r xx02 = xx0();
            if (xx02 != null) {
                xx02.update(wx02, new String[0]);
            }
        }
    }

    /* renamed from: E1 */
    public void mo61365E1(String str, boolean z, int i) {
        MultiTaskInfo jo;
        Log.m105924i("MicroMsg.TaskBar.PluginTaskBar", "removeTaskInfo " + str + ' ' + z + ' ' + i);
        if (!MMApplicationContext.isMainProcess()) {
            Bundle bundle = new Bundle();
            bundle.putString("id", str);
            bundle.putInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i);
            C80907o.m98781d(WeChatProcess.PROCESS_MAIN, bundle, C15018b.class, C15022d.f41156d);
        } else if (C86709a0.m107522a() && str != null) {
            StringBuilder sb = new StringBuilder();
            String str2 = C15029q.f41166a;
            sb.append(C15029q.f41166a);
            sb.append(str);
            String sb4 = sb.toString();
            if (C86013q1.m106450k(sb4)) {
                C86013q1.m106447h(sb4);
            }
            C65902r xx02 = xx0();
            if (xx02 != null && (jo = xx02.mo89954jo(str)) != null) {
                Log.m105924i("MicroMsg.TaskBarStorage", ShareConstants.RES_DEL_TITLE + jo.field_type + ' ' + jo.field_id + ' ' + jo.mo80305m2().f183752e + ' ' + i);
                xx02.delete(jo, false, new String[0]);
                if (z) {
                    C65902r.C65903a aVar = new C65902r.C65903a();
                    aVar.f189467a = jo;
                    aVar.f189468b = i;
                    xx02.doNotify(MStorageEventData.EventType.SINGLE, 5, aVar);
                }
            }
        }
    }

    public C39630m0 getViewModelStore() {
        return this.f189463e;
    }

    public void onAccountReleased(Context context) {
        C87412m.m108594g(context, "context");
        Log.m105924i("MicroMsg.TaskBar.PluginTaskBar", "onAccountRelease");
        this.f189462d = null;
    }

    /* renamed from: p5 */
    public List<MultiTaskInfo> mo61366p5(int i) {
        C65902r xx02 = xx0();
        if (xx02 == null) {
            return new ArrayList();
        }
        Cursor rawQuery = xx02.f189466d.rawQuery("SELECT * FROM TaskBarInfo WHERE type = ? ORDER BY updateTime DESC;", new String[]{String.valueOf(i)});
        ArrayList arrayList = new ArrayList();
        while (rawQuery.moveToNext()) {
            MultiTaskInfo multiTaskInfo = new MultiTaskInfo();
            multiTaskInfo.convertFrom(rawQuery);
            arrayList.add(multiTaskInfo);
        }
        rawQuery.close();
        return arrayList;
    }

    /* renamed from: q5 */
    public void mo61367q5(String str, int i, C64459j13 j132, Bitmap bitmap, byte[] bArr, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("updateTaskInfoByBitmap id:");
        sb.append(str);
        sb.append(" type:");
        sb.append(i);
        sb.append(" bitmap:");
        byte[] bArr2 = null;
        sb.append(bitmap != null ? Integer.valueOf(bitmap.getByteCount()) : null);
        sb.append(" updateBitmapOnly:");
        sb.append(z);
        Log.m105924i("MicroMsg.TaskBar.PluginTaskBar", sb.toString());
        if (str != null) {
            if (!MMApplicationContext.isMainProcess()) {
                Bundle bundle = new Bundle();
                bundle.putInt("addType", 2);
                bundle.putString("id", str);
                bundle.putInt("type", i);
                if (j132 != null) {
                    bArr2 = j132.toByteArray();
                }
                bundle.putByteArray("showData", bArr2);
                bundle.putByteArray("data", bArr);
                bundle.putBoolean("updateBitmapOnly", z);
                if (bitmap != null) {
                    StringBuilder sb4 = new StringBuilder();
                    VFSStrategy$$b vFSStrategy$$b = VFSStrategy.f348871a;
                    sb4.append(C112760b.m154236i0("taskbar").mo119971i());
                    sb4.append(XVFSFile.SEPARATOR_CHAR);
                    sb4.append(str);
                    String sb5 = sb4.toString();
                    if (C86013q1.m106450k(sb5)) {
                        C86013q1.m106447h(sb5);
                    }
                    zx0(bitmap, sb5, new C15025g(bundle, sb5));
                    return;
                }
                C80907o.m98781d(WeChatProcess.PROCESS_MAIN, bundle, C65899a.class, C15026h.f41163d);
            } else if (C86709a0.m107522a()) {
                if (bitmap != null) {
                    C65901p pVar = C65901p.f189464a;
                    String b = pVar.mo89952b(str);
                    if (C86013q1.m106450k(b)) {
                        C86013q1.m106447h(b);
                    }
                    zx0(bitmap, b, C15024f.f41160d);
                    if (C67121f.f192724e.mo55826b(i)) {
                        C20937c cVar = C78493o.f229929b;
                        C87412m.m108593f(cVar, "SNAPSHOT_LOADER_OPTION");
                        C20828a.m22825b().mo32526o(pVar.mo89951a(b, cVar), bitmap);
                    }
                }
                Ax0(str, i, j132, bArr, z);
            }
        }
    }

    public final void vx0(String str, int i, C64459j13 j132, byte[] bArr) {
        C87412m.m108594g(str, "id");
        MultiTaskInfo wx02 = wx0(str);
        if (wx02 != null) {
            Log.m105924i("MicroMsg.TaskBar.PluginTaskBar", "updateTaskInfo id:" + str + " type:" + i);
            wx02.field_updateTime = System.currentTimeMillis();
            wx02.field_showData = j132;
            if (bArr != null) {
                wx02.field_data = bArr;
            }
            C65902r xx02 = xx0();
            if ((xx02 != null ? Boolean.valueOf(xx02.update(wx02, new String[0])) : null) != null) {
                return;
            }
        }
        Log.m105924i("MicroMsg.TaskBar.PluginTaskBar", "addTaskInfo id:" + str + " type:" + i);
        MultiTaskInfo multiTaskInfo = new MultiTaskInfo();
        multiTaskInfo.field_id = str;
        multiTaskInfo.field_type = i;
        multiTaskInfo.field_createTime = System.currentTimeMillis();
        multiTaskInfo.field_updateTime = System.currentTimeMillis();
        multiTaskInfo.field_showData = j132;
        multiTaskInfo.field_data = bArr;
        C65902r xx03 = xx0();
        if (xx03 != null) {
            xx03.insert(multiTaskInfo);
        }
    }

    public final MultiTaskInfo wx0(String str) {
        C87412m.m108594g(str, "id");
        C65902r xx02 = xx0();
        if (xx02 != null) {
            return xx02.mo89954jo(str);
        }
        return null;
    }

    public final C65902r xx0() {
        if (this.f189462d == null && C86709a0.m107522a()) {
            synchronized (this) {
                if (this.f189462d == null) {
                    C91753f fVar = C86709a0.m107535s().f251811i;
                    C87412m.m108593f(fVar, "storage().dataDB");
                    this.f189462d = new C65902r(fVar);
                }
            }
        }
        return this.f189462d;
    }

    /* renamed from: y3 */
    public void mo61368y3(String str, int i, C64459j13 j132, Bitmap bitmap, byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("addTaskInfoByBitmap id:");
        sb.append(str);
        sb.append(" type:");
        sb.append(i);
        sb.append(" bitmap:");
        byte[] bArr2 = null;
        sb.append(bitmap != null ? Integer.valueOf(bitmap.getByteCount()) : null);
        Log.m105924i("MicroMsg.TaskBar.PluginTaskBar", sb.toString());
        if (str != null) {
            if (!MMApplicationContext.isMainProcess()) {
                Bundle bundle = new Bundle();
                bundle.putInt("addType", 1);
                bundle.putString("id", str);
                bundle.putInt("type", i);
                if (j132 != null) {
                    bArr2 = j132.toByteArray();
                }
                bundle.putByteArray("showData", bArr2);
                bundle.putByteArray("data", bArr);
                if (bitmap != null) {
                    StringBuilder sb4 = new StringBuilder();
                    VFSStrategy$$b vFSStrategy$$b = VFSStrategy.f348871a;
                    sb4.append(C112760b.m154236i0("taskbar").mo119971i());
                    sb4.append(XVFSFile.SEPARATOR_CHAR);
                    sb4.append(str);
                    String sb5 = sb4.toString();
                    if (C86013q1.m106450k(sb5)) {
                        C86013q1.m106447h(sb5);
                    }
                    zx0(bitmap, sb5, new C15020b(bundle, sb5));
                    return;
                }
                C80907o.m98781d(WeChatProcess.PROCESS_MAIN, bundle, C65899a.class, C15021c.f41155d);
            } else if (C86709a0.m107522a()) {
                if (bitmap != null) {
                    C65901p pVar = C65901p.f189464a;
                    String b = pVar.mo89952b(str);
                    if (C86013q1.m106450k(b)) {
                        C86013q1.m106447h(b);
                    }
                    zx0(bitmap, b, C15019a.f41152d);
                    if (C67121f.f192724e.mo55826b(i)) {
                        C20937c cVar = C78493o.f229929b;
                        C87412m.m108593f(cVar, "SNAPSHOT_LOADER_OPTION");
                        String a = pVar.mo89951a(b, cVar);
                        C20828a.m22825b().mo32527p(a);
                        C20828a.m22825b().mo32526o(a, bitmap);
                    }
                }
                vx0(str, i, j132, bArr);
            }
        }
    }

    public final void yx0(MultiTaskInfo multiTaskInfo) {
        C87412m.m108594g(multiTaskInfo, "multiTaskInfo");
        C78494v vVar = (C78494v) C86312j.m106911c(C78494v.class);
        vVar.getClass();
        Log.m105924i("MicroMsg.TaskBarViewService", "notifyRemoveTaskBarItem " + multiTaskInfo.mo80305m2().f183752e + ' ' + multiTaskInfo.field_id + ' ' + multiTaskInfo.field_type);
        HashSet<C66204d.C66205b> hashSet = vVar.f229931d.get(multiTaskInfo.field_type);
        if (hashSet != null) {
            for (C66204d.C66205b D1 : hashSet) {
                D1.mo90306D1(multiTaskInfo);
            }
        }
        C38166b.m41756c(C66204d.C38350a.class, Integer.valueOf(multiTaskInfo.field_type), new C37868u(multiTaskInfo));
    }

    public final void zx0(Bitmap bitmap, String str, C32224a<C13598b0> aVar) {
        ((C119157j) C119157j.f356862d).mo183884o(new C15023e(bitmap, str, aVar));
    }
}
