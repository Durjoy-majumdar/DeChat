package com.tencent.p014mm.plugin.multitask;

import a70.C112760b;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C39630m0;
import c02.C92331c;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.MulitTaskEvent;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.mvvm.MvvmStorage;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.p014mm.vfs.VFSStrategy$$b;
import com.tencent.xweb.file.XVFSFile;
import di3.C86301e;
import di3.C86312j;
import eb0.C31543z5;
import ei3.C86522b;
import f40.C86709a0;
import gc0.C20828a;
import gy3.C87412m;
import i40.C46166d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import l92.C109294b;
import m92.C61444a;
import m92.C99797b;
import n92.C117617a;
import o92.C110004g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p92.C117997g;
import rx3.C13598b0;
import te3.C110964i13;
import te3.C64272c13;
import te3.C64459j13;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND})
/* renamed from: com.tencent.mm.plugin.multitask.s */
public final class C105923s extends C86301e implements C105918j, C0123n0 {

    /* renamed from: n */
    public static final HashMap<Integer, Class<? extends C117997g>> f315122n = new HashMap<>();

    /* renamed from: o */
    public static C30306a f315123o;

    /* renamed from: d */
    public final String f315124d = "MicroMsg.MultiTask.PluginMultiTask";

    /* renamed from: e */
    public volatile C61444a f315125e;

    /* renamed from: f */
    public volatile boolean f315126f;

    /* renamed from: g */
    public final CopyOnWriteArrayList<String> f315127g = new CopyOnWriteArrayList<>();

    /* renamed from: h */
    public final String f315128h = "multitask";

    /* renamed from: i */
    public final String f315129i = "multi_task_storage";

    /* renamed from: j */
    public final C39630m0 f315130j = new C39630m0();

    /* renamed from: com.tencent.mm.plugin.multitask.s$a */
    public interface C30306a {
        /* renamed from: B4 */
        boolean mo57273B4();

        /* renamed from: E */
        boolean mo57274E(String str);

        /* renamed from: P */
        String mo57275P(String str, int i, int i2);

        /* renamed from: f */
        void mo57276f(boolean z);
    }

    /* renamed from: com.tencent.mm.plugin.multitask.s$b */
    public static final class C30307b<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ C105923s f81829d;

        public C30307b(C105923s sVar) {
            this.f81829d = sVar;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            Bundle bundle = (Bundle) obj;
            String str = this.f81829d.f315124d;
            StringBuilder sb = new StringBuilder();
            sb.append("addTaskInfoByBitmap invoker callback result:");
            sb.append(bundle != null ? bundle.getBoolean("result") : false);
            Log.m105924i(str, sb.toString());
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitask.s$d */
    public static final class C30308d<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ C105923s f81830d;

        public C30308d(C105923s sVar) {
            this.f81830d = sVar;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            Bundle bundle = (Bundle) obj;
            String str = this.f81830d.f315124d;
            StringBuilder sb = new StringBuilder();
            sb.append("hideMultiTaskUIC invoker callback result:");
            sb.append(bundle != null ? bundle.getBoolean("result") : false);
            Log.m105924i(str, sb.toString());
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitask.s$e */
    public static final class C30309e<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ C105923s f81831d;

        public C30309e(C105923s sVar) {
            this.f81831d = sVar;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            Bundle bundle = (Bundle) obj;
            String str = this.f81831d.f315124d;
            StringBuilder sb = new StringBuilder();
            sb.append("updateTaskInfoByBitmap invoker callback result:");
            sb.append(bundle != null ? bundle.getBoolean("result") : false);
            Log.m105924i(str, sb.toString());
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitask.s$f */
    public static final class C30310f<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ C105923s f81832d;

        public C30310f(C105923s sVar) {
            this.f81832d = sVar;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            Bundle bundle = (Bundle) obj;
            String str = this.f81832d.f315124d;
            StringBuilder sb = new StringBuilder();
            sb.append("updateTaskInfoByTitle invoker callback result:");
            sb.append(bundle != null ? bundle.getBoolean("result") : false);
            Log.m105924i(str, sb.toString());
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitask.s$c */
    public static final class C105924c<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ C109294b f315131d;

        public C105924c(C109294b bVar) {
            this.f315131d = bVar;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            MultiTaskListParcel multiTaskListParcel = (MultiTaskListParcel) obj;
            if ((multiTaskListParcel != null ? multiTaskListParcel.f315101d : null) != null) {
                List<? extends MultiTaskInfo> list = multiTaskListParcel.f315101d;
                boolean z = false;
                if (list != null && !list.isEmpty()) {
                    z = true;
                }
                if (z) {
                    C109294b bVar = this.f315131d;
                    if (bVar != null) {
                        bVar.mo114815a(multiTaskListParcel.f315101d);
                        return;
                    }
                    return;
                }
            }
            C109294b bVar2 = this.f315131d;
            if (bVar2 != null) {
                bVar2.mo114815a(new ArrayList());
            }
        }
    }

    public final void Ax0(String str, int i, C64459j13 j132, byte[] bArr) {
        MultiTaskInfo c3;
        C87412m.m108594g(str, "id");
        C87412m.m108594g(j132, "showData");
        C61444a vx02 = vx0();
        if (vx02 != null && (c3 = vx02.mo86416c3(str)) != null) {
            c3.field_updateTime = C31543z5.m39453c();
            c3.field_type = i;
            c3.field_showData = j132;
            if (bArr != null) {
                c3.field_data = bArr;
            }
            C61444a vx03 = vx0();
            if (vx03 != null) {
                MvvmStorage.update$default(vx03, c3, false, false, 6, (Object) null);
            }
            ((C92331c) C86312j.m106911c(C92331c.class)).nd0(c3);
        }
    }

    /* renamed from: B4 */
    public boolean mo151015B4() {
        C30306a aVar = f315123o;
        if (aVar != null) {
            return aVar.mo57273B4();
        }
        C61444a vx02 = vx0();
        if (vx02 != null) {
            return ((ArrayList) vx02.mo86418d3()).isEmpty();
        }
        return false;
    }

    /* renamed from: D3 */
    public void mo151016D3(String str, int i, C64459j13 j132, Bitmap bitmap, byte[] bArr) {
        C87412m.m108594g(str, "id");
        C87412m.m108594g(j132, "showData");
        String str2 = this.f315124d;
        StringBuilder sb = new StringBuilder();
        sb.append("updateTaskInfoByBitmap id:");
        sb.append(str);
        sb.append(" type:");
        sb.append(i);
        sb.append(" bitmap:");
        C13598b0 b0Var = null;
        sb.append(bitmap != null ? Integer.valueOf(bitmap.getByteCount()) : null);
        Log.m105924i(str2, sb.toString());
        if (MMApplicationContext.isMainProcess()) {
            j132.f183758n = false;
            if (bitmap != null) {
                String b = C56888q.f162957a.mo80311b(str);
                if (C86013q1.m106450k(b)) {
                    C86013q1.m106447h(b);
                }
                C20828a.m22825b().mo32527p(C56887p.f162956a.mo80309a(b, C56888q.f162958b));
                BitmapUtil.saveBitmapToImage(bitmap, 100, Bitmap.CompressFormat.JPEG, b, false);
            } else {
                j132.f183758n = true;
                Log.m105924i(this.f315124d, "updateTaskInfoByBitmap showData defaultBg mainProcess");
            }
            Ax0(str, i, j132, bArr);
            return;
        }
        Bundle bundle = new Bundle();
        j132.f183758n = false;
        if (bitmap != null) {
            StringBuilder sb4 = new StringBuilder();
            VFSStrategy$$b vFSStrategy$$b = VFSStrategy.f348871a;
            sb4.append(C112760b.m154236i0("multitask").mo119971i());
            sb4.append(XVFSFile.SEPARATOR_CHAR);
            sb4.append(str);
            String sb5 = sb4.toString();
            if (C86013q1.m106450k(sb5)) {
                C86013q1.m106447h(sb5);
            }
            BitmapUtil.saveBitmapToImage(bitmap, 100, Bitmap.CompressFormat.JPEG, sb5, false);
            bundle.putString("path", sb5);
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            j132.f183758n = true;
            Log.m105924i(this.f315124d, "updateTaskInfoByBitmap showData defaultBg");
        }
        bundle.putString("id", str);
        bundle.putInt("type", i);
        bundle.putByteArray("showData", j132.toByteArray());
        bundle.putByteArray("data", bArr);
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, bundle, C56890y.class, new C30309e(this));
    }

    /* renamed from: H3 */
    public void mo151017H3(C109294b bVar) {
        Log.m105924i(this.f315124d, "getMultiTaskInfoList");
        if (!MMApplicationContext.isMainProcess()) {
            XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, IPCVoid.f10316d, C105917h.class, new C105924c(bVar));
        } else if (bVar != null) {
            C61444a vx02 = vx0();
            bVar.mo114815a(vx02 != null ? vx02.mo86418d3() : new ArrayList());
        }
    }

    /* renamed from: P */
    public String mo151018P(String str, int i, int i2) {
        C87412m.m108594g(str, "id");
        if (MMApplicationContext.isMainProcess()) {
            C30306a aVar = f315123o;
            if (aVar != null) {
                return aVar.mo57275P(str, i, i2);
            }
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("id", str);
        bundle.putInt("curPos", i);
        bundle.putInt("way", i2);
        IPCString iPCString = (IPCString) C80907o.m98783f(WeChatProcess.PROCESS_MAIN, bundle, C30316z.class);
        if (iPCString != null) {
            return iPCString.f10315d;
        }
        return null;
    }

    /* renamed from: S5 */
    public boolean mo151019S5(MultiTaskInfo multiTaskInfo) {
        boolean z;
        MultiTaskInfo multiTaskInfo2;
        C87412m.m108594g(multiTaskInfo, "multiTaskInfo");
        if (C86709a0.m107522a()) {
            requireAccountInitialized();
        }
        String decodeString = MultiProcessMMKV.getMMKV(this.f315129i).decodeString(this.f315128h);
        boolean z2 = false;
        if (!Util.isNullOrNil(decodeString) || this.f315126f) {
            Log.m105919d(this.f315124d, "load, savedMuliTaskInfos:%s", decodeString);
            try {
                JSONArray jSONArray = new JSONArray(decodeString);
                if (jSONArray.length() > 0) {
                    int length = jSONArray.length();
                    int i = 0;
                    z = false;
                    while (i < length) {
                        try {
                            JSONObject optJSONObject = jSONArray.optJSONObject(i);
                            if (optJSONObject != null) {
                                IAutoDBItem.MAutoDBInfo mAutoDBInfo = MultiTaskInfo.f162955x;
                                try {
                                    String string = optJSONObject.getString("field_id");
                                    multiTaskInfo2 = new MultiTaskInfo();
                                    multiTaskInfo2.field_id = string;
                                } catch (Exception e) {
                                    Log.printErrStackTrace("MicroMsg.MultiTaskInfo", e, "convertJSONObjectToMultiTaskInfo fail, exception:%s", e);
                                    multiTaskInfo2 = null;
                                }
                                if (multiTaskInfo2 != null && TextUtils.equals(multiTaskInfo2.field_id, multiTaskInfo.field_id)) {
                                    z = true;
                                }
                            }
                            i++;
                        } catch (JSONException e2) {
                            e = e2;
                            Log.printErrStackTrace(this.f315124d, e, "load fail, exception:%s", e);
                            z2 = z;
                            String str = this.f315124d;
                            Log.m105924i(str, "load, hasTaskInfoByMMKV: " + z2);
                            return z2;
                        }
                    }
                    z2 = z;
                }
            } catch (JSONException e3) {
                e = e3;
                z = false;
                Log.printErrStackTrace(this.f315124d, e, "load fail, exception:%s", e);
                z2 = z;
                String str2 = this.f315124d;
                Log.m105924i(str2, "load, hasTaskInfoByMMKV: " + z2);
                return z2;
            }
            String str22 = this.f315124d;
            Log.m105924i(str22, "load, hasTaskInfoByMMKV: " + z2);
        } else if (MMApplicationContext.isMainProcess()) {
            String str3 = multiTaskInfo.field_id;
            C87412m.m108593f(str3, "multiTaskInfo.field_id");
            return wx0(str3);
        } else {
            IPCBoolean iPCBoolean = (IPCBoolean) C80907o.m98783f(WeChatProcess.PROCESS_MAIN, new IPCString(multiTaskInfo.field_id), C4895i.class);
            if (iPCBoolean != null) {
                z2 = iPCBoolean.f10312d;
            }
        }
        return z2;
    }

    /* renamed from: Ub */
    public void mo151020Ub(String str) {
        Boolean bool;
        if (str != null) {
            String b = C56888q.f162957a.mo80311b(str);
            if (C86013q1.m106450k(b)) {
                C86013q1.m106447h(b);
            }
            C61444a vx02 = vx0();
            if (vx02 != null) {
                MultiTaskInfo c3 = vx02.mo86416c3(str);
                boolean z = false;
                if (c3 != null && MvvmStorage.delete$default(vx02, c3, false, false, 6, (Object) null) > 0) {
                    z = true;
                }
                bool = Boolean.valueOf(z);
            } else {
                bool = null;
            }
            ((C92331c) C86312j.m106911c(C92331c.class)).mo58359Ls(str);
            if (C87412m.m108589b(bool, Boolean.TRUE) && this.f315127g.contains(str)) {
                this.f315127g.remove(str);
                zx0();
            }
            String str2 = this.f315124d;
            Log.m105924i(str2, "removeTaskInfo id:" + str + " success:" + bool);
        }
    }

    /* renamed from: b4 */
    public Point mo151021b4() {
        return new Point(0, C105922o.f315121k);
    }

    public C39630m0 getViewModelStore() {
        return this.f315130j;
    }

    /* renamed from: kF */
    public boolean mo151022kF() {
        return C85875k4.m106163T();
    }

    /* renamed from: l0 */
    public void mo151023l0(String str, int i, C64459j13 j132, Bitmap bitmap, byte[] bArr, C110964i13 i132) {
        C13598b0 b0Var;
        C87412m.m108594g(str, "id");
        C87412m.m108594g(j132, "showData");
        String str2 = this.f315124d;
        StringBuilder sb = new StringBuilder();
        sb.append("addTaskInfoByBitmap id:");
        sb.append(str);
        sb.append(" type:");
        sb.append(i);
        sb.append(" bitmap:");
        byte[] bArr2 = null;
        sb.append(bitmap != null ? Integer.valueOf(bitmap.getByteCount()) : null);
        Log.m105924i(str2, sb.toString());
        if (MMApplicationContext.isMainProcess()) {
            j132.f183758n = false;
            if (bitmap != null) {
                String b = C56888q.f162957a.mo80311b(str);
                if (C86013q1.m106450k(b)) {
                    C86013q1.m106447h(b);
                }
                C20828a.m22825b().mo32527p(C56887p.f162956a.mo80309a(b, C56888q.f162958b));
                BitmapUtil.saveBitmapToImage(bitmap, 100, Bitmap.CompressFormat.JPEG, b, false);
            } else {
                j132.f183758n = true;
                Log.m105924i(this.f315124d, "addTaskInfoByBitmap showData defaultBg mainProcess");
            }
            r40(str, i, j132, bArr, i132);
            return;
        }
        Bundle bundle = new Bundle();
        j132.f183758n = false;
        if (bitmap != null) {
            StringBuilder sb4 = new StringBuilder();
            VFSStrategy$$b vFSStrategy$$b = VFSStrategy.f348871a;
            sb4.append(C112760b.m154236i0("multitask").mo119971i());
            sb4.append(XVFSFile.SEPARATOR_CHAR);
            sb4.append(str);
            String sb5 = sb4.toString();
            if (C86013q1.m106450k(sb5)) {
                C86013q1.m106447h(sb5);
            }
            BitmapUtil.saveBitmapToImage(bitmap, 100, Bitmap.CompressFormat.JPEG, sb5, false);
            bundle.putString("path", sb5);
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            j132.f183758n = true;
            Log.m105924i(this.f315124d, "addTaskInfoByBitmap showData defaultBg");
        }
        bundle.putString("id", str);
        bundle.putInt("type", i);
        bundle.putByteArray("showData", j132.toByteArray());
        bundle.putByteArray("data", bArr);
        if (i132 != null) {
            bArr2 = i132.toByteArray();
        }
        bundle.putByteArray("reportdata", bArr2);
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, bundle, C56885a.class, new C30307b(this));
    }

    public MultiTaskInfo nm0(String str) {
        C61444a vx02;
        C87412m.m108594g(str, "id");
        if (!MMApplicationContext.isMainProcess() || (vx02 = vx0()) == null) {
            return null;
        }
        return vx02.mo86416c3(str);
    }

    public void onAccountInitialized(Context context) {
        C87412m.m108594g(context, "context");
        this.f315126f = false;
        yx0();
    }

    public void onAccountReleased(Context context) {
        C87412m.m108594g(context, "context");
        Log.m105924i(this.f315124d, "onAccountRelease");
        this.f315125e = null;
        f315123o = null;
        this.f315126f = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        cy3.C58003b.m67160a(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        throw r1;
     */
    /* renamed from: p5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo> mo151025p5(int r5) {
        /*
            r4 = this;
            m92.a r0 = r4.vx0()
            if (r0 == 0) goto L_0x0047
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.tencent.mm.sdk.storage.mvvm.IMvvmDBProvider r0 = r0.getDbProvider()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.getDB()
            if (r0 == 0) goto L_0x004c
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]
            r3 = 0
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r2[r3] = r5
            java.lang.String r5 = "SELECT * FROM MultiTaskInfo WHERE type = ? ORDER BY createTime DESC;"
            android.database.Cursor r5 = r0.rawQuery(r5, r2)
            if (r5 == 0) goto L_0x004c
            r0 = 0
        L_0x0028:
            boolean r2 = r5.moveToNext()     // Catch:{ all -> 0x0040 }
            if (r2 == 0) goto L_0x003a
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo r2 = new com.tencent.mm.plugin.multitask.model.MultiTaskInfo     // Catch:{ all -> 0x0040 }
            r2.<init>()     // Catch:{ all -> 0x0040 }
            r2.convertFrom(r5)     // Catch:{ all -> 0x0040 }
            r1.add(r2)     // Catch:{ all -> 0x0040 }
            goto L_0x0028
        L_0x003a:
            rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0040 }
            cy3.C58003b.m67160a(r5, r0)
            goto L_0x004c
        L_0x0040:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r1 = move-exception
            cy3.C58003b.m67160a(r5, r0)
            throw r1
        L_0x0047:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x004c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitask.C105923s.mo151025p5(int):java.util.List");
    }

    public void r40(String str, int i, C64459j13 j132, byte[] bArr, C110964i13 i132) {
        Boolean bool;
        C64272c13 c132;
        boolean z;
        C87412m.m108594g(str, "id");
        C87412m.m108594g(j132, "showData");
        MultiTaskInfo multiTaskInfo = new MultiTaskInfo();
        multiTaskInfo.field_id = str;
        multiTaskInfo.field_type = i;
        multiTaskInfo.field_createTime = C31543z5.m39453c();
        multiTaskInfo.field_updateTime = C31543z5.m39453c();
        multiTaskInfo.field_showData = j132;
        multiTaskInfo.field_data = bArr;
        C61444a vx02 = vx0();
        if (vx02 != null) {
            if (MvvmStorage.delete$default(vx02, multiTaskInfo, false, false, 4, (Object) null) > 0) {
                z = MvvmStorage.insert$default(vx02, multiTaskInfo, false, false, false, 12, (Object) null);
                if (z) {
                    C99797b bVar = C99797b.f292476a;
                    String str2 = multiTaskInfo.field_id;
                    C87412m.m108593f(str2, "item.field_id");
                    StorageObserverEvent storageObserverEvent = new StorageObserverEvent(bVar, str2, "MicroMsg.MultiTask.MultiTaskLiveStorage");
                    storageObserverEvent.setObj(multiTaskInfo);
                    vx02.getOwner().notify(storageObserverEvent);
                }
            } else {
                z = MvvmStorage.insert$default(vx02, multiTaskInfo, false, false, false, 14, (Object) null);
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = null;
        }
        if (!(i132 == null || (c132 = i132.f332063j) == null)) {
            C117617a.f351848a.mo182342d(multiTaskInfo, c132.f182352d, c132.f182353e, i132.f332057d, i132.f332061h);
        }
        Boolean bool2 = Boolean.TRUE;
        if (C87412m.m108589b(bool, bool2) && !this.f315127g.contains(str)) {
            this.f315127g.add(0, str);
            zx0();
            ((C92331c) C86312j.m106911c(C92331c.class)).mo58378uG(multiTaskInfo);
        }
        if (C87412m.m108589b(bool, bool2)) {
            C110004g gVar = C110004g.f329189a;
            if (!gVar.mo161346a()) {
                Log.m105924i(this.f315124d, "[enterTips] first Add!");
                gVar.mo161347b(true);
                long currentTimeMillis = System.currentTimeMillis();
                Log.m105924i("MicroMsg.MultiTaskTipsHelper", "setMultiTaskFirstAddTime, time: " + currentTimeMillis);
                MultiProcessMMKV.getMMKV("multitask_tips_config").putLong("multitask_first_add_time", currentTimeMillis);
            }
        }
        String str3 = this.f315124d;
        Log.m105924i(str3, "addTaskInfo id:" + str + " type:" + i + " success:" + bool + ' ' + multiTaskInfo.toJSON());
    }

    /* renamed from: r5 */
    public void mo151027r5(int i, String str, int i2) {
        C87412m.m108594g(str, "id");
        if (MMApplicationContext.isMainProcess()) {
            MulitTaskEvent mulitTaskEvent = new MulitTaskEvent();
            MulitTaskEvent.C67733a aVar = mulitTaskEvent.f193741d;
            aVar.f193744c = i;
            aVar.f193743b = i2;
            aVar.f193742a = str;
            mulitTaskEvent.publish();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("id", str);
        bundle.putInt("type", i2);
        bundle.putInt("event_type", i);
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, bundle, C4896n.class, new C30308d(this));
    }

    public final C61444a vx0() {
        if (this.f315125e == null && C86709a0.m107522a()) {
            synchronized (this) {
                if (this.f315125e == null) {
                    this.f315125e = new C61444a(new C46166d());
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
        return this.f315125e;
    }

    public final boolean wx0(String str) {
        C87412m.m108594g(str, "id");
        C30306a aVar = f315123o;
        if (aVar != null) {
            return aVar.mo57274E(str);
        }
        C61444a vx02 = vx0();
        return (vx02 != null ? vx02.mo86416c3(str) : null) != null;
    }

    public void xx0(int i, Class<? extends C117997g> cls) {
        String str = this.f315124d;
        Log.m105924i(str, "registerMultiTaskUIC type:" + i + " clazzUic:" + cls);
        if (MMApplicationContext.isMainProcess()) {
            f315122n.put(Integer.valueOf(i), cls);
        }
    }

    /* renamed from: y5 */
    public void mo151028y5(String str, int i, C64459j13 j132, byte[] bArr) {
        C87412m.m108594g(str, "id");
        C87412m.m108594g(j132, "showData");
        if (MMApplicationContext.isMainProcess()) {
            Ax0(str, i, j132, bArr);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("id", str);
        bundle.putInt("type", i);
        bundle.putByteArray("showData", j132.toByteArray());
        bundle.putByteArray("data", bArr);
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, bundle, C56889x.class, new C30310f(this));
    }

    public final void yx0() {
        JSONObject jSONObject;
        Log.m105924i(this.f315124d, "restore data from storage");
        if (!C86709a0.m107522a()) {
            Log.m105924i(this.f315124d, "account not ready!");
        } else if (this.f315126f) {
            Log.m105924i(this.f315124d, "restoreData already done!");
        } else {
            C61444a vx02 = vx0();
            List<MultiTaskInfo> d3 = vx02 != null ? vx02.mo86418d3() : null;
            if (d3 != null) {
                JSONArray jSONArray = new JSONArray();
                try {
                    int i = 0;
                    for (MultiTaskInfo next : d3) {
                        String str = next.field_id;
                        IAutoDBItem.MAutoDBInfo mAutoDBInfo = MultiTaskInfo.f162955x;
                        try {
                            jSONObject = new JSONObject();
                            jSONObject.put("field_id", str);
                        } catch (Exception e) {
                            Log.printErrStackTrace("MicroMsg.MultiTaskInfo", e, "convertMultiTaskToJSONObject fail, exception:%s", e);
                            jSONObject = null;
                        }
                        if (jSONObject != null) {
                            int i2 = i + 1;
                            jSONArray.put(i, jSONObject);
                            if (!this.f315127g.contains(next.field_id)) {
                                this.f315127g.add(next.field_id);
                            }
                            i = i2;
                        }
                    }
                } catch (JSONException e2) {
                    Log.printErrStackTrace(this.f315124d, e2, "restoreDataFromStorageToMMKV fail, exception:%s", e2);
                }
                String jSONArray2 = jSONArray.toString();
                C87412m.m108593f(jSONArray2, "multiTaskInfoJsonArray.toString()");
                MultiProcessMMKV.getMMKV(this.f315129i).encode(this.f315128h, jSONArray2);
                this.f315126f = true;
                Log.m105924i(this.f315124d, "restore data done!");
                C92331c cVar = (C92331c) C86312j.m106911c(C92331c.class);
                if (cVar != null) {
                    cVar.pi0(d3);
                    C13598b0 b0Var = C13598b0.f38549a;
                }
            }
        }
    }

    public final void zx0() {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        try {
            CopyOnWriteArrayList<String> copyOnWriteArrayList = this.f315127g;
            if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
                Iterator<String> it = this.f315127g.iterator();
                int i = 0;
                while (it.hasNext()) {
                    String next = it.next();
                    IAutoDBItem.MAutoDBInfo mAutoDBInfo = MultiTaskInfo.f162955x;
                    try {
                        jSONObject = new JSONObject();
                        jSONObject.put("field_id", next);
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.MultiTaskInfo", e, "convertMultiTaskToJSONObject fail, exception:%s", e);
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        int i2 = i + 1;
                        jSONArray.put(i, jSONObject);
                        i = i2;
                    }
                }
            }
        } catch (JSONException e2) {
            Log.printErrStackTrace(this.f315124d, e2, "saveMultiTaskToMMKV fail, exception:%s", e2);
        }
        String jSONArray2 = jSONArray.toString();
        C87412m.m108593f(jSONArray2, "multiTaskInfosJsonArray.toString()");
        if (C86709a0.m107522a()) {
            requireAccountInitialized();
        }
        MultiProcessMMKV.getMMKV(this.f315129i).encode(this.f315128h, jSONArray2);
    }
}
