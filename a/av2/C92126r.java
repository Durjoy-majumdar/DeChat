package av2;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.view.MenuItem;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.compatible.util.Exif;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.scanner.ScanCodeSheetItemLogic;
import com.tencent.p014mm.plugin.sns.model.C94847c1;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94867e2;
import com.tencent.p014mm.plugin.sns.model.C94938q1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d62.C7250m;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kg3.C76577a;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import od3.C62001a;
import p200lx.C46896e0;
import p200lx.C46900z;
import p640ox.C77049b;
import p682rz.C101488s;
import qo3.C77407n;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C101804kv2;
import te3.C64291co3;
import vr2.C102236a0;
import wc3.C15133e0;
import wc3.C78541w;
import z04.C66723k;

/* renamed from: av2.r */
public final class C92126r {

    /* renamed from: g */
    public static final C92127a f263717g = new C92127a((C8480h) null);

    /* renamed from: h */
    public static final HashMap<Integer, C54358q> f263718h;

    /* renamed from: a */
    public final Activity f263719a;

    /* renamed from: b */
    public final boolean f263720b;

    /* renamed from: c */
    public final C13601g f263721c;

    /* renamed from: d */
    public long f263722d;

    /* renamed from: e */
    public boolean f263723e;

    /* renamed from: f */
    public C46900z f263724f;

    /* renamed from: av2.r$a */
    public static final class C92127a {
        public C92127a(C8480h hVar) {
        }

        /* renamed from: a */
        public final int[] mo126112a(List<Integer> list) {
            SnsMethodCalculate.markStartTimeMs("array2int", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$Companion");
            C87412m.m108594g(list, "items");
            int[] iArr = new int[list.size()];
            int size = list.size();
            for (int i = 0; i < size; i++) {
                iArr[i] = list.get(i).intValue();
            }
            SnsMethodCalculate.markEndTimeMs("array2int", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$Companion");
            return iArr;
        }

        /* renamed from: b */
        public final void mo126113b(Activity activity, String str, String str2, C101804kv2 kv22, String str3) {
            String str4;
            String str5;
            Activity activity2 = activity;
            String str6 = str;
            C101804kv2 kv23 = kv22;
            String str7 = str3;
            SnsMethodCalculate.markStartTimeMs("shareSendVideo", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$Companion");
            C87412m.m108594g(activity2, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C87412m.m108594g(str6, "toUsers");
            C87412m.m108594g(kv23, "media");
            C87412m.m108594g(str7, "snsLoacalId");
            String str8 = "MicroMsg.ShareSheet";
            Log.m105924i(str8, "shareSendVideo >> " + str7);
            String e = C94938q1.m120518e(C94866e1.m120262YO(), kv23.f298689d);
            C87412m.m108593f(e, "getMediaFilePath(SnsCore…etAccSnsPath(), media.Id)");
            if (C86013q1.m106450k(e + C102236a0.m134735b0(kv22))) {
                str5 = e + C102236a0.m134735b0(kv22);
                str4 = e + C102236a0.m134739d0(kv22);
            } else {
                String o = C94867e2.m120296o(kv22);
                str5 = C94867e2.m120294m(str7, kv23);
                str4 = o;
            }
            if (!C86013q1.m106450k(str5)) {
                str5 = C94867e2.m120292k(str3);
                Log.m105928w(str8, "shareSendVideo get relocated video path: " + str5);
            }
            String str9 = str5;
            char c = 0;
            if (!(str9 == null || str9.length() == 0)) {
                if (!(str4 == null || str4.length() == 0) && C86013q1.m106450k(str9) && C86013q1.m106450k(str4)) {
                    Object[] array = new C66723k(",").mo90760e(str6, 0).toArray(new String[0]);
                    C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    ArrayList<String> stringsToList = Util.stringsToList((String[]) array);
                    C87412m.m108593f(stringsToList, "stringsToList(toUsers.sp…oRegex()).toTypedArray())");
                    int U = C102236a0.m134726U(str9);
                    for (String next : stringsToList) {
                        Object[] objArr = new Object[4];
                        objArr[c] = next;
                        objArr[1] = str9;
                        objArr[2] = str4;
                        objArr[3] = Integer.valueOf(U);
                        Log.m105925i(str8, "send sight to %s, videopath %s, thumbpath %s duration %d", objArr);
                        C7250m.m7431a().Ml0(activity, next, str9, str4, 62, U, false, false, "", (String) null);
                        C7250m.m7431a().mo136252Ar(str2, next);
                        str4 = str4;
                        str8 = str8;
                        str9 = str9;
                        c = 0;
                    }
                    ((C101488s) C86312j.m106911c(C101488s.class)).gh0(str7);
                    C75026b.m89951a(activity2, activity2.getString(C0966R.string.fjh));
                    SnsMethodCalculate.markEndTimeMs("shareSendVideo", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$Companion");
                    return;
                }
            }
            Log.m105920e(str8, "shareSendVideo file is error >> " + str9 + ", " + str4);
            if (C94847c1.m120217e()) {
                C75026b.m89951a(activity2, activity2.getString(C0966R.string.n4x));
            }
            SnsMethodCalculate.markEndTimeMs("shareSendVideo", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$Companion");
        }
    }

    /* renamed from: av2.r$b */
    public static final class C92128b extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C92126r f263725d;

        /* renamed from: e */
        public final /* synthetic */ boolean f263726e;

        /* renamed from: f */
        public final /* synthetic */ C101804kv2 f263727f;

        /* renamed from: g */
        public final /* synthetic */ boolean f263728g;

        /* renamed from: h */
        public final /* synthetic */ SnsInfo f263729h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92128b(C92126r rVar, boolean z, C101804kv2 kv22, boolean z2, SnsInfo snsInfo) {
            super(1);
            this.f263725d = rVar;
            this.f263726e = z;
            this.f263727f = kv22;
            this.f263728g = z2;
            this.f263729h = snsInfo;
        }

        public Object invoke(Object obj) {
            String str;
            Bitmap bitmap;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$addQuickShare$1");
            String str2 = (String) obj;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$addQuickShare$1");
            C92126r rVar = this.f263725d;
            boolean z = this.f263726e;
            C101804kv2 kv22 = this.f263727f;
            rVar.getClass();
            SnsMethodCalculate.markStartTimeMs("getMediaPath", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
            C87412m.m108594g(kv22, "media");
            if (z) {
                str = C94938q1.m120518e(C94866e1.m120262YO(), kv22.f298689d) + C102236a0.m134717L(kv22);
            } else {
                String e = C94938q1.m120518e(C94866e1.m120262YO(), kv22.f298689d);
                C87412m.m108593f(e, "getMediaFilePath(SnsCore…etAccSnsPath(), media.Id)");
                String T = C102236a0.m134725T(kv22);
                C87412m.m108593f(T, "getSnsSightName(media)");
                if (C86013q1.m106450k(e + T)) {
                    str = e + C102236a0.m134729X(kv22);
                } else {
                    str = "";
                }
            }
            SnsMethodCalculate.markEndTimeMs("getMediaPath", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
            if (this.f263726e) {
                this.f263725d.getClass();
                SnsMethodCalculate.markStartTimeMs("getThumbBitmap", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
                C87412m.m108594g(str, "path");
                if (!Util.isNullOrNil(str)) {
                    Bitmap bitmapNative = BitmapUtil.getBitmapNative(str, 140, 140, C76577a.m92156g(MMApplicationContext.getContext()));
                    int orientationInDegree = Exif.fromFile(str).getOrientationInDegree();
                    if (orientationInDegree < 0) {
                        orientationInDegree = 0;
                    }
                    bitmap = BitmapUtil.rotate(bitmapNative, (float) orientationInDegree);
                } else {
                    bitmap = null;
                }
                SnsMethodCalculate.markEndTimeMs("getThumbBitmap", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
            } else {
                this.f263725d.getClass();
                SnsMethodCalculate.markStartTimeMs("getVideoThumb", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
                C87412m.m108594g(str, "imagePath");
                bitmap = BitmapUtil.getBitmapNative(str);
                SnsMethodCalculate.markEndTimeMs("getVideoThumb", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
            }
            String str3 = str2;
            ((C78541w) C86312j.m106911c(C78541w.class)).mo108484Gd(this.f263725d.mo126100c(), str3, bitmap, this.f263725d.mo126100c().getString(C0966R.string.a2s), this.f263726e ? 3 : 2, new C92137s(this.f263725d, str3, this.f263728g, this.f263727f, this.f263729h, this.f263726e)).show();
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$addQuickShare$1");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$addQuickShare$1");
            return b0Var;
        }
    }

    /* renamed from: av2.r$c */
    public static final class C92129c extends C87413o implements C32224a<C77407n> {

        /* renamed from: d */
        public final /* synthetic */ C92126r f263730d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92129c(C92126r rVar) {
            super(0);
            this.f263730d = rVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$bottomSheet$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$bottomSheet$2");
            Activity c = this.f263730d.mo126100c();
            C92126r rVar = this.f263730d;
            rVar.getClass();
            SnsMethodCalculate.markStartTimeMs("getHasTitle", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
            boolean z = rVar.f263720b;
            SnsMethodCalculate.markEndTimeMs("getHasTitle", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
            C77407n nVar = new C77407n((Context) c, 0, z);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$bottomSheet$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$bottomSheet$2");
            return nVar;
        }
    }

    /* renamed from: av2.r$d */
    public static final class C92130d implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C11184p0 f263731d;

        public C92130d(C11184p0 p0Var) {
            this.f263731d = p0Var;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$setOnFooterMenuSelectedListener$1");
            this.f263731d.onMMMenuItemSelected(menuItem, i);
            SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$setOnFooterMenuSelectedListener$1");
        }
    }

    /* renamed from: av2.r$e */
    public static final class C92131e implements C77407n.C47880p {

        /* renamed from: a */
        public final /* synthetic */ C32224a<C13598b0> f263732a;

        /* renamed from: b */
        public final /* synthetic */ C92126r f263733b;

        public C92131e(C32224a<C13598b0> aVar, C92126r rVar) {
            this.f263732a = aVar;
            this.f263733b = rVar;
        }

        public final void onDismiss() {
            SnsMethodCalculate.markStartTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$setOnSheetDismissListener$1");
            this.f263732a.invoke();
            ((ScanCodeSheetItemLogic) this.f263733b.mo126102e()).mo67083n();
            C64291co3 f = this.f263733b.mo126103f();
            if (f != null) {
                f.f182539d = 1;
                f.f182547o = (int) (SystemClock.elapsedRealtime() - f.f182550r);
            }
            C62001a.f176265a.mo86878a(this.f263733b.mo126100c());
            SnsMethodCalculate.markEndTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$setOnSheetDismissListener$1");
        }
    }

    /* renamed from: av2.r$f */
    public static final class C92132f implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C11184p0 f263734d;

        /* renamed from: e */
        public final /* synthetic */ C92126r f263735e;

        public C92132f(C11184p0 p0Var, C92126r rVar) {
            this.f263734d = p0Var;
            this.f263735e = rVar;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$setSheetSelectedListener$1");
            this.f263734d.onMMMenuItemSelected(menuItem, i);
            this.f263735e.mo126105h(menuItem.getItemId());
            SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$setSheetSelectedListener$1");
        }
    }

    /* renamed from: av2.r$g */
    public static final class C92133g implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C11184p0 f263736d;

        /* renamed from: e */
        public final /* synthetic */ C92126r f263737e;

        public C92133g(C11184p0 p0Var, C92126r rVar) {
            this.f263736d = p0Var;
            this.f263737e = rVar;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$setSheetSelectedListener$2");
            this.f263736d.onMMMenuItemSelected(menuItem, i);
            this.f263737e.mo126105h(menuItem.getItemId());
            SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$setSheetSelectedListener$2");
        }
    }

    /* renamed from: av2.r$h */
    public static final class C92134h implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ C92126r f263738d;

        /* renamed from: e */
        public final /* synthetic */ int[] f263739e;

        public C92134h(C92126r rVar, int[] iArr) {
            this.f263738d = rVar;
            this.f263739e = iArr;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            SnsMethodCalculate.markStartTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$updateSheetMenus$1$1");
            C92126r rVar = this.f263738d;
            Activity c = rVar.mo126100c();
            int[] iArr = this.f263739e;
            C87412m.m108593f(e0Var, "menu");
            C92126r.m115801a(rVar, c, iArr, e0Var);
            SnsMethodCalculate.markEndTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$updateSheetMenus$1$1");
        }
    }

    /* renamed from: av2.r$i */
    public static final class C92135i implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ C92126r f263740d;

        /* renamed from: e */
        public final /* synthetic */ int[] f263741e;

        public C92135i(C92126r rVar, int[] iArr) {
            this.f263740d = rVar;
            this.f263741e = iArr;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            SnsMethodCalculate.markStartTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$updateSheetMenus$2$1");
            C92126r rVar = this.f263740d;
            Activity c = rVar.mo126100c();
            int[] iArr = this.f263741e;
            C87412m.m108593f(e0Var, "menu");
            C92126r.m115801a(rVar, c, iArr, e0Var);
            SnsMethodCalculate.markEndTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$updateSheetMenus$2$1");
        }
    }

    /* renamed from: av2.r$j */
    public static final class C92136j implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f263742d;

        public C92136j(C32224a<C13598b0> aVar) {
            this.f263742d = aVar;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$updateSheetMenus$3");
            C32224a<C13598b0> aVar = this.f263742d;
            if (aVar != null) {
                aVar.invoke();
            }
            SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$updateSheetMenus$3");
        }
    }

    static {
        HashMap<Integer, C54358q> hashMap = new HashMap<>();
        f263718h = hashMap;
        hashMap.put(-1, new C54358q(C0966R.string.jbl, C0966R.raw.icons_outlined_delete, 0, 4, (C8480h) null));
        hashMap.put(1000, new C54358q(C0966R.string.f361390jh2, C0966R.raw.icons_outlined_lock, 0, 4, (C8480h) null));
        hashMap.put(1002, new C54358q(C0966R.string.iam, C0966R.raw.icons_outlined_download, 0, 4, (C8480h) null));
        hashMap.put(1003, new C54358q(C0966R.string.jgc, C0966R.raw.icons_filled_share, C0966R.color.f2939n));
        hashMap.put(1004, new C54358q(C0966R.string.jcb, 0, 0, 6, (C8480h) null));
        hashMap.put(1005, new C54358q(C0966R.string.f361389jh1, C0966R.raw.icons_outlined_lock_on, 0, 4, (C8480h) null));
        hashMap.put(1015, new C54358q(C0966R.string.mym, C0966R.raw.icons_outlined_group_detail, 0, 4, (C8480h) null));
        hashMap.put(1006, new C54358q(C0966R.string.f361137hk2, C0966R.raw.bottomsheet_icon_fav, C0966R.color.ahf));
        hashMap.put(1008, new C54358q(C0966R.string.a19, C0966R.raw.icons_outlined_open, 0, 4, (C8480h) null));
        hashMap.put(1009, new C54358q(C0966R.string.b8i, C0966R.raw.icons_outlined_translate, 0, 4, (C8480h) null));
        hashMap.put(1010, new C54358q(C0966R.string.cwg, C0966R.raw.icons_filled_search_logo, C0966R.color.f2966ao));
        hashMap.put(1011, new C54358q(C0966R.string.b8f, C0966R.raw.icons_outlined_ocr, 0, 4, (C8480h) null));
        hashMap.put(1012, new C54358q(C0966R.string.b8g, C0966R.raw.icons_outlined_pencil, 0, 4, (C8480h) null));
        hashMap.put(1013, new C54358q(C0966R.string.iar, C0966R.raw.icons_outlined_download, 0, 4, (C8480h) null));
        hashMap.put(1014, new C54358q(C0966R.string.jgl, C0966R.raw.icons_outlined_download, 0, 4, (C8480h) null));
    }

    public C92126r(Activity activity, int i, boolean z, int i2) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f263719a = activity;
        this.f263720b = z;
        this.f263721c = C36568h.m40985a(new C92129c(this));
        C64291co3 f = mo126103f();
        if (f != null) {
            f.f182544i = i;
        }
    }

    /* renamed from: a */
    public static final void m115801a(C92126r rVar, Context context, int[] iArr, C76874e0 e0Var) {
        SnsMethodCalculate.markStartTimeMs("access$addMenu", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        rVar.getClass();
        SnsMethodCalculate.markStartTimeMs("addMenu", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        e0Var.clear();
        for (int i : iArr) {
            C54358q qVar = f263718h.get(Integer.valueOf(i));
            if (qVar != null) {
                SnsMethodCalculate.markStartTimeMs("getRawResId", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
                int i2 = qVar.f152527b;
                SnsMethodCalculate.markEndTimeMs("getRawResId", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
                if (i2 == -1) {
                    SnsMethodCalculate.markStartTimeMs("getNameResId", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
                    int i3 = qVar.f152526a;
                    SnsMethodCalculate.markEndTimeMs("getNameResId", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
                    e0Var.mo107142f(i, context.getString(i3));
                } else {
                    SnsMethodCalculate.markStartTimeMs("getColorResId", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
                    int i4 = qVar.f152528c;
                    SnsMethodCalculate.markEndTimeMs("getColorResId", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
                    if (i4 == -1) {
                        SnsMethodCalculate.markStartTimeMs("getNameResId", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
                        int i5 = qVar.f152526a;
                        SnsMethodCalculate.markEndTimeMs("getNameResId", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
                        String string = context.getString(i5);
                        SnsMethodCalculate.markStartTimeMs("getRawResId", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
                        int i6 = qVar.f152527b;
                        SnsMethodCalculate.markEndTimeMs("getRawResId", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
                        e0Var.mo107144g(i, string, i6);
                    } else {
                        SnsMethodCalculate.markStartTimeMs("getNameResId", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
                        int i7 = qVar.f152526a;
                        SnsMethodCalculate.markEndTimeMs("getNameResId", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
                        String string2 = context.getString(i7);
                        SnsMethodCalculate.markStartTimeMs("getRawResId", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
                        int i8 = qVar.f152527b;
                        SnsMethodCalculate.markEndTimeMs("getRawResId", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
                        Resources resources = context.getResources();
                        SnsMethodCalculate.markStartTimeMs("getColorResId", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
                        int i9 = qVar.f152528c;
                        SnsMethodCalculate.markEndTimeMs("getColorResId", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
                        e0Var.mo107146h(i, string2, i8, resources.getColor(i9));
                    }
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("addMenu", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        SnsMethodCalculate.markEndTimeMs("access$addMenu", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
    }

    /* renamed from: b */
    public final void mo126099b(SnsInfo snsInfo, C101804kv2 kv22) {
        SnsMethodCalculate.markStartTimeMs("addQuickShare", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        C87412m.m108594g(snsInfo, "snsInfo");
        C87412m.m108594g(kv22, "media");
        boolean z = snsInfo.getTimeLine().ContentObj.f298424e == 1;
        boolean z2 = snsInfo.getTimeLine().isExcerpt && !Util.isNullOrNil(snsInfo.getTimeLine().snsExcerptUrl);
        C64291co3 f = mo126103f();
        if (f != null) {
            f.f182545j = z ? "3" : "43";
        }
        C64291co3 f2 = mo126103f();
        if (f2 != null) {
            f2.f182546n = "0";
        }
        ((C15133e0) C86312j.m106911c(C15133e0.class)).Ct0().Q60(this.f263719a, mo126101d(), 4, (C32226l<? super Boolean, C13598b0>) null, new C92128b(this, z, kv22, z2, snsInfo));
        SnsMethodCalculate.markEndTimeMs("addQuickShare", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
    }

    /* renamed from: c */
    public final Activity mo126100c() {
        SnsMethodCalculate.markStartTimeMs("getActivity", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        Activity activity = this.f263719a;
        SnsMethodCalculate.markEndTimeMs("getActivity", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        return activity;
    }

    /* renamed from: d */
    public final C77407n mo126101d() {
        SnsMethodCalculate.markStartTimeMs("getBottomSheet", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        C77407n nVar = (C77407n) ((C36570n) this.f263721c).getValue();
        SnsMethodCalculate.markEndTimeMs("getBottomSheet", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        return nVar;
    }

    /* renamed from: e */
    public final C46900z mo126102e() {
        SnsMethodCalculate.markStartTimeMs("getImgScanCodeLogic", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        if (this.f263724f == null) {
            this.f263724f = ((C46896e0) C86312j.m106911c(C46896e0.class)).mo71992oj(this.f263719a);
        }
        C46900z zVar = this.f263724f;
        C87412m.m108591d(zVar);
        SnsMethodCalculate.markEndTimeMs("getImgScanCodeLogic", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        return zVar;
    }

    /* renamed from: f */
    public final C64291co3 mo126103f() {
        SnsMethodCalculate.markStartTimeMs("getRecentReportInfo", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        C64291co3 co32 = (C64291co3) ((C77049b) C86312j.m106911c(C77049b.class)).mo72351Ok(this.f263719a, 14, C64291co3.class);
        SnsMethodCalculate.markEndTimeMs("getRecentReportInfo", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        return co32;
    }

    /* renamed from: g */
    public final boolean mo126104g() {
        SnsMethodCalculate.markStartTimeMs("isShowing", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        boolean h = mo126101d().mo107563h();
        SnsMethodCalculate.markEndTimeMs("isShowing", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        return h;
    }

    /* renamed from: h */
    public final void mo126105h(int i) {
        SnsMethodCalculate.markStartTimeMs("reportMenuType", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        if (i == 1003) {
            C64291co3 f = mo126103f();
            if (f != null) {
                f.f182539d = 2;
            }
        } else {
            C64291co3 f2 = mo126103f();
            if (f2 != null) {
                f2.f182539d = 4;
            }
        }
        C64291co3 f3 = mo126103f();
        if (f3 != null) {
            f3.f182547o = (int) (SystemClock.elapsedRealtime() - this.f263722d);
        }
        C62001a.f176265a.mo86878a(this.f263719a);
        SnsMethodCalculate.markEndTimeMs("reportMenuType", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
    }

    /* renamed from: i */
    public final void mo126106i(C11184p0 p0Var) {
        SnsMethodCalculate.markStartTimeMs("setOnFooterMenuSelectedListener", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        C87412m.m108594g(p0Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        mo126101d().f225793u = new C92130d(p0Var);
        SnsMethodCalculate.markEndTimeMs("setOnFooterMenuSelectedListener", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
    }

    /* renamed from: j */
    public final void mo126107j(C32224a<C13598b0> aVar) {
        SnsMethodCalculate.markStartTimeMs("setOnSheetDismissListener", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        C87412m.m108594g(aVar, "dismissCb");
        mo126101d().f225761d = new C92131e(aVar, this);
        SnsMethodCalculate.markEndTimeMs("setOnSheetDismissListener", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
    }

    /* renamed from: k */
    public final void mo126108k(C11184p0 p0Var) {
        SnsMethodCalculate.markStartTimeMs("setSheetSelectedListener", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        C87412m.m108594g(p0Var, "menuItemSelectedListener");
        mo126101d().f225782p = new C92132f(p0Var, this);
        mo126101d().f225787r = new C92133g(p0Var, this);
        SnsMethodCalculate.markEndTimeMs("setSheetSelectedListener", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
    }

    /* renamed from: l */
    public final void mo126109l() {
        SnsMethodCalculate.markStartTimeMs("tryShow", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        mo126101d().mo107573q();
        this.f263722d = SystemClock.elapsedRealtime();
        SnsMethodCalculate.markEndTimeMs("tryShow", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
    }

    /* renamed from: m */
    public final void mo126110m(List<Integer> list, List<Integer> list2, C32224a<C13598b0> aVar) {
        SnsMethodCalculate.markStartTimeMs("updateSheetMenus", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        C87412m.m108594g(list, "firstMenuItems");
        C87412m.m108594g(list2, "sencondItems");
        C92127a aVar2 = f263717g;
        mo126111n(aVar2.mo126112a(list), aVar2.mo126112a(list2), aVar);
        SnsMethodCalculate.markEndTimeMs("updateSheetMenus", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
    }

    /* renamed from: n */
    public final void mo126111n(int[] iArr, int[] iArr2, C32224a<C13598b0> aVar) {
        SnsMethodCalculate.markStartTimeMs("updateSheetMenus", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        C87412m.m108594g(iArr2, "sencondItems");
        if (iArr != null) {
            mo126101d().f225771i = new C92134h(this, iArr);
        }
        mo126101d().f225773j = new C92135i(this, iArr2);
        mo126101d().f225793u = new C92136j(aVar);
        SnsMethodCalculate.markEndTimeMs("updateSheetMenus", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C92126r(Activity activity, int i) {
        this(activity, i, false, 0);
        C87412m.m108594g(activity, "context");
    }
}
