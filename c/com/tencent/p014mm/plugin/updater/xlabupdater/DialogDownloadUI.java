package com.tencent.p014mm.plugin.updater.xlabupdater;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53930o0;
import a14.C53934p0;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.app.ActionBar;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f14.C58901s;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import nj3.C88990b;
import o13.C11329e;
import p1081gi.C98124g;
import p663qo.C77384i;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.rg4;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/updater/xlabupdater/DialogDownloadUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "plugin-updater_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.updater.xlabupdater.DialogDownloadUI */
public abstract class DialogDownloadUI extends MMSecDataActivity {

    /* renamed from: g */
    public static final /* synthetic */ int f21639g = 0;

    /* renamed from: d */
    public int f21640d;

    /* renamed from: e */
    public final C13601g f21641e = C36568h.m40985a(new C5668a(this));

    /* renamed from: f */
    public final C5669b f21642f = new C5669b(this);

    /* renamed from: com.tencent.mm.plugin.updater.xlabupdater.DialogDownloadUI$a */
    public static final class C5668a extends C87413o implements C32224a<rg4> {

        /* renamed from: d */
        public final /* synthetic */ DialogDownloadUI f21643d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5668a(DialogDownloadUI dialogDownloadUI) {
            super(0);
            this.f21643d = dialogDownloadUI;
        }

        public Object invoke() {
            rg4 rg4 = new rg4();
            rg4.toPb(this.f21643d.getIntent().getStringExtra("x_dialoginfo"));
            return rg4;
        }
    }

    /* renamed from: com.tencent.mm.plugin.updater.xlabupdater.DialogDownloadUI$b */
    public static final class C5669b implements C11329e.C11330a {

        /* renamed from: a */
        public final /* synthetic */ DialogDownloadUI f21644a;

        public C5669b(DialogDownloadUI dialogDownloadUI) {
            this.f21644a = dialogDownloadUI;
        }

        /* renamed from: a */
        public void mo6699a(String str, double d) {
            C87412m.m108594g(str, "mediaId");
            Log.m105924i("MicroMsg.XUpdate.DialogDownloadUI", "onDownloadProgress: " + d);
            C11329e eVar = C11329e.f33285a;
            String str2 = this.f21644a.mo6692I7().f259805p;
            C87412m.m108593f(str2, "dialogInfo.cdnUrl");
            eVar.mo11360i(str2, 1);
            this.f21644a.mo6694K7(d);
        }

        /* renamed from: b */
        public void mo6700b(String str, String str2) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(str2, "path");
            Log.m105924i("MicroMsg.XUpdate.DialogDownloadUI", "onDownloadSuccess: " + str2);
            C11329e eVar = C11329e.f33285a;
            String str3 = this.f21644a.mo6692I7().f259805p;
            C87412m.m108593f(str3, "dialogInfo.cdnUrl");
            eVar.mo11360i(str3, 2);
            DialogDownloadUI dialogDownloadUI = this.f21644a;
            dialogDownloadUI.mo6695L7(dialogDownloadUI.mo6692I7());
        }

        /* renamed from: c */
        public void mo6701c(String str, String str2) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(str2, "msg");
            Log.m105924i("MicroMsg.XUpdate.DialogDownloadUI", "onDownloadFail: " + str2);
            C11329e eVar = C11329e.f33285a;
            String str3 = this.f21644a.mo6692I7().f259805p;
            C87412m.m108593f(str3, "dialogInfo.cdnUrl");
            eVar.mo11360i(str3, 0);
            String str4 = this.f21644a.mo6692I7().f259805p;
            C87412m.m108593f(str4, "dialogInfo.cdnUrl");
            MultiProcessMMKV.getMMKV("MMKV_NAME_FILE_NAME").remove(str4);
            MultiProcessMMKV.getMMKV("MMKV_NAME_MEDIA_ID").remove(str4);
            this.f21644a.mo6693J7(str2);
        }

        /* renamed from: d */
        public void mo6702d(String str, rg4 rg4) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(rg4, "info");
            C11329e eVar = C11329e.f33285a;
            String str2 = this.f21644a.mo6692I7().f259805p;
            C87412m.m108593f(str2, "dialogInfo.cdnUrl");
            eVar.mo11360i(str2, 4);
            this.f21644a.mo6697N7(str, rg4);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.updater.xlabupdater.DialogDownloadUI$onCreate$2", mo125469f = "DialogDownloadUI.kt", mo125470l = {65}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.updater.xlabupdater.DialogDownloadUI$c */
    public static final class C5670c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f21645d;

        /* renamed from: e */
        public final /* synthetic */ DialogDownloadUI f21646e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5670c(DialogDownloadUI dialogDownloadUI, C15601d<? super C5670c> dVar) {
            super(2, dVar);
            this.f21646e = dialogDownloadUI;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C5670c(this.f21646e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C5670c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f21645d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C11329e eVar = C11329e.f33285a;
                String str = this.f21646e.mo6692I7().f259805p;
                C87412m.m108593f(str, "dialogInfo.cdnUrl");
                String g = eVar.mo11358g(str);
                this.f21645d = 1;
                eVar.getClass();
                obj = ((C77384i) C86312j.m106911c(C77384i.class)).mo107506oY(g, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            Log.m105924i("MicroMsg.XUpdate.DialogDownloadUI", "isCdnDownloading: " + booleanValue);
            DialogDownloadUI dialogDownloadUI = this.f21646e;
            int i2 = DialogDownloadUI.f21639g;
            dialogDownloadUI.getClass();
            if (booleanValue) {
                C11329e eVar2 = C11329e.f33285a;
                String str2 = dialogDownloadUI.mo6692I7().f259805p;
                C87412m.m108593f(str2, "dialogInfo.cdnUrl");
                if (eVar2.mo11356e(str2) != 1) {
                    String str3 = dialogDownloadUI.mo6692I7().f259805p;
                    C87412m.m108593f(str3, "dialogInfo.cdnUrl");
                    eVar2.mo11360i(str3, 1);
                }
            }
            if (!booleanValue) {
                C11329e eVar3 = C11329e.f33285a;
                String str4 = dialogDownloadUI.mo6692I7().f259805p;
                C87412m.m108593f(str4, "dialogInfo.cdnUrl");
                if (eVar3.mo11356e(str4) == 1) {
                    String str5 = dialogDownloadUI.mo6692I7().f259805p;
                    C87412m.m108593f(str5, "dialogInfo.cdnUrl");
                    eVar3.mo11360i(str5, 0);
                }
            }
            if (!booleanValue) {
                C11329e eVar4 = C11329e.f33285a;
                String str6 = dialogDownloadUI.mo6692I7().f259805p;
                C87412m.m108593f(str6, "dialogInfo.cdnUrl");
                if (dialogDownloadUI.mo6691H7(eVar4.mo11357f(str6))) {
                    String str7 = dialogDownloadUI.mo6692I7().f259805p;
                    C87412m.m108593f(str7, "dialogInfo.cdnUrl");
                    eVar4.mo11360i(str7, 2);
                }
            }
            if (!booleanValue) {
                C11329e eVar5 = C11329e.f33285a;
                String str8 = dialogDownloadUI.mo6692I7().f259805p;
                C87412m.m108593f(str8, "dialogInfo.cdnUrl");
                if (!dialogDownloadUI.mo6691H7(eVar5.mo11357f(str8))) {
                    String str9 = dialogDownloadUI.mo6692I7().f259805p;
                    C87412m.m108593f(str9, "dialogInfo.cdnUrl");
                    eVar5.mo11360i(str9, 0);
                }
            }
            this.f21646e.mo6696M7();
            if (!booleanValue) {
                C11329e eVar6 = C11329e.f33285a;
                String str10 = this.f21646e.mo6692I7().f259805p;
                C87412m.m108593f(str10, "dialogInfo.cdnUrl");
                if (eVar6.mo11356e(str10) == 2) {
                    DialogDownloadUI dialogDownloadUI2 = this.f21646e;
                    String str11 = dialogDownloadUI2.mo6692I7().f259805p;
                    C87412m.m108593f(str11, "dialogInfo.cdnUrl");
                    if (dialogDownloadUI2.mo6691H7(eVar6.mo11357f(str11))) {
                        DialogDownloadUI dialogDownloadUI3 = this.f21646e;
                        dialogDownloadUI3.mo6695L7(dialogDownloadUI3.mo6692I7());
                        Log.m105924i("MicroMsg.XUpdate.DialogDownloadUI", "startDownload but has been success");
                        return C13598b0.f38549a;
                    }
                }
            }
            if (booleanValue) {
                this.f21646e.mo6698O7();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: H7 */
    public final boolean mo6691H7(String str) {
        return C86013q1.m106450k(str) && C86013q1.m106451l(str) > 0;
    }

    /* renamed from: I7 */
    public final rg4 mo6692I7() {
        return (rg4) ((C36570n) this.f21641e).getValue();
    }

    /* renamed from: J7 */
    public abstract void mo6693J7(String str);

    /* renamed from: K7 */
    public abstract void mo6694K7(double d);

    /* renamed from: L7 */
    public abstract void mo6695L7(rg4 rg4);

    /* renamed from: M7 */
    public abstract void mo6696M7();

    /* renamed from: N7 */
    public abstract void mo6697N7(String str, rg4 rg4);

    /* renamed from: O7 */
    public final void mo6698O7() {
        Log.m105924i("MicroMsg.XUpdate.DialogDownloadUI", "startDownload!");
        C11329e eVar = C11329e.f33285a;
        String str = mo6692I7().f259805p;
        C87412m.m108593f(str, "dialogInfo.cdnUrl");
        String str2 = mo6692I7().f259805p;
        C87412m.m108593f(str2, "dialogInfo.cdnUrl");
        String g = eVar.mo11358g(str2);
        String str3 = mo6692I7().f259805p;
        C87412m.m108593f(str3, "dialogInfo.cdnUrl");
        String f = eVar.mo11357f(str3);
        String str4 = mo6692I7().f259806q;
        C87412m.m108593f(str4, "dialogInfo.patchMd5");
        C5669b bVar = this.f21642f;
        eVar.getClass();
        C87412m.m108594g(bVar, "callback");
        Log.m105924i("MicroMsg.XUpdate.XUpdateHelper", "startDownloadCore() called with: cdnurl = " + str + ", mediaId = " + g + ", fullPath = " + f + ", md5 = " + str4);
        C98124g gVar = new C98124g();
        gVar.f287660d = "task_ApkPatchDownload";
        gVar.f287672s = str;
        gVar.field_mediaId = g;
        gVar.field_fullpath = f;
        gVar.field_filemd5 = str4;
        gVar.field_fileType = 30003;
        gVar.f287673t = 20;
        gVar.f287674u = 3600;
        ((C77384i) C86312j.m106911c(C77384i.class)).mo107504hs(gVar, new WeakReference(C11329e.f33292h));
        Map<String, Set<WeakReference<C11329e.C11330a>>> map = C11329e.f33286b;
        eVar.mo11353b(g, map);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object obj = linkedHashMap.get(g);
        if (obj == null) {
            obj = new LinkedHashSet();
            linkedHashMap.put(g, obj);
        }
        ((Set) obj).add(new WeakReference(bVar));
        StringBuilder sb = new StringBuilder();
        sb.append("addCallback ");
        sb.append(g);
        sb.append(' ');
        sb.append(bVar.hashCode());
        sb.append(' ');
        Set set = (Set) linkedHashMap.get(g);
        sb.append(set != null ? Integer.valueOf(set.size()) : null);
        Log.m105924i("MicroMsg.XUpdate.XUpdateHelper", sb.toString());
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("MMKV_NAME_XUPDATE_DOWNLOAD_PROGRESS");
        String str5 = mo6692I7().f259805p;
        C87412m.m108593f(str5, "dialogInfo.cdnUrl");
        this.f21640d = mmkv.getInt(eVar.mo11358g(str5), 0);
    }

    public void onCreate(Bundle bundle) {
        overridePendingTransition(-1, -1);
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.XUpdate.DialogDownloadUI", mo6692I7().toJSON().toString());
        if (TextUtils.isEmpty(mo6692I7().f259805p)) {
            Log.m105920e("MicroMsg.XUpdate.DialogDownloadUI", "cdnUrl empty, finish!");
            finish();
            return;
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo91112w(new ColorDrawable(0));
            supportActionBar.mo91104o();
        }
        C88990b.m111194c(this, (C88990b.C61771c) null);
        C53896h0 h0Var = C53872d1.f151117a;
        C53895h.m60466d(C53930o0.m60554a(C58901s.f168555a), (C66212f) null, (C53934p0) null, new C5670c(this, (C15601d<? super C5670c>) null), 3, (Object) null);
    }

    public void onDestroy() {
        super.onDestroy();
        C11329e eVar = C11329e.f33285a;
        rg4 I7 = mo6692I7();
        eVar.getClass();
        C87412m.m108594g(I7, "info");
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("MMKV_NAME_XUPDATE_DIALOGINFO");
        String str = I7.f259805p;
        C87412m.m108593f(str, "info.cdnUrl");
        mmkv.putString(eVar.mo11358g(str), I7.toJSON().toString());
    }
}
