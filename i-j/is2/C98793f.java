package is2;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.format.DateFormat;
import bv2.C92315e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94867e2;
import com.tencent.p014mm.plugin.sns.p106ui.C96315x6;
import com.tencent.p014mm.plugin.sns.p106ui.OnlineVideoViewHelper;
import com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI;
import com.tencent.p014mm.plugin.sns.p106ui.SnsGalleryUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import d62.C75339i;
import di3.C86312j;
import f03.C97785g;
import fy3.C32226l;
import gy3.C87412m;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import jr2.C99019x;
import k20.C9556a;
import kg3.C76577a;
import l03.C99277b;
import lh3.C34280b;
import lh3.C34282e;
import lh3.C61284d;
import lh3.C61285f;
import lh3.C99474g;
import os2.C100399d0;
import os2.C100417r0;
import p196ln.C76708i;
import p214om.C11502f;
import qo3.C77407n;
import rx3.C13598b0;
import rx3.C13604l;
import te3.C101804kv2;
import te3.a94;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: is2.f */
public final class C98793f implements C61284d {

    /* renamed from: a */
    public static final C98793f f289639a = new C98793f();

    /* renamed from: b */
    public static final ArrayList<String> f289640b = new ArrayList<>();

    /* renamed from: c */
    public static String f289641c = "";

    /* renamed from: d */
    public static String f289642d = "";

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp", mo125469f = "WithTaComposeOp.kt", mo125470l = {176}, mo125471m = "snsWithTaOpRequest")
    /* renamed from: is2.f$b */
    public static final class C60619b extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f172716d;

        /* renamed from: e */
        public final /* synthetic */ C98793f f172717e;

        /* renamed from: f */
        public int f172718f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60619b(C98793f fVar, C15601d<? super C60619b> dVar) {
            super(dVar);
            this.f172717e = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp$snsWithTaOpRequest$1");
            this.f172716d = obj;
            this.f172718f |= Integer.MIN_VALUE;
            Object t = this.f172717e.mo138168t((String) null, 0, this);
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp$snsWithTaOpRequest$1");
            return t;
        }
    }

    /* renamed from: is2.f$a */
    public static final class C98794a implements C92315e.C92316a {
        /* renamed from: a */
        public OnlineVideoViewHelper.VideoRptStruct mo126317a() {
            SnsMethodCalculate.markStartTimeMs("provideUiReport", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp$getSnsVideoTask$1");
            OnlineVideoViewHelper.VideoRptStruct videoRptStruct = new OnlineVideoViewHelper.VideoRptStruct();
            SnsMethodCalculate.markEndTimeMs("provideUiReport", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp$getSnsVideoTask$1");
            return videoRptStruct;
        }

        /* renamed from: b */
        public long mo126318b() {
            SnsMethodCalculate.markStartTimeMs("providePlayVideoDurationByResume", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp$getSnsVideoTask$1");
            SnsMethodCalculate.markEndTimeMs("providePlayVideoDurationByResume", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp$getSnsVideoTask$1");
            return 0;
        }
    }

    /* renamed from: a */
    public void mo86010a(Context context, C0000n0 n0Var, String str, int i, int i2, C32226l<? super Boolean, C13598b0> lVar) {
        SnsMethodCalculate.markStartTimeMs("showAlertListDialog", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        C87412m.m108594g(context, "context");
        C87412m.m108594g(n0Var, "scope");
        C87412m.m108594g(str, TPReportKeys.Common.COMMON_SEQ);
        C87412m.m108594g(lVar, "cb");
        SnsMethodCalculate.markStartTimeMs("showAlertListDialog", "com.tencent.mm.plugin.sns.model.withta.WithTaRemove$Companion");
        LinkedList linkedList = new LinkedList();
        String string = context.getString(C0966R.string.lzw);
        C87412m.m108593f(string, "context.getString(R.string.sns_withta_remove_me2)");
        linkedList.add(new C13604l(1, string));
        C77407n nVar = new C77407n(context, 1, true);
        nVar.f225771i = new C9240g(linkedList);
        nVar.mo107568m(context.getString(i2), 17, C76577a.m92151b(context, 12));
        nVar.f225782p = new C60620h(n0Var, str, i, lVar);
        nVar.mo107573q();
        SnsMethodCalculate.markEndTimeMs("showAlertListDialog", "com.tencent.mm.plugin.sns.model.withta.WithTaRemove$Companion");
        SnsMethodCalculate.markEndTimeMs("showAlertListDialog", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
    }

    /* renamed from: b */
    public boolean mo86011b() {
        SnsMethodCalculate.markStartTimeMs("isSelf", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        boolean equals = C94866e1.Mx0().equals(f289642d);
        SnsMethodCalculate.markEndTimeMs("isSelf", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return equals;
    }

    /* renamed from: c */
    public String mo86012c() {
        SnsMethodCalculate.markStartTimeMs("getWithFriends", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        String str = f289641c;
        SnsMethodCalculate.markEndTimeMs("getWithFriends", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return str;
    }

    /* renamed from: d */
    public void mo86013d(Context context, int i, boolean z, C34280b bVar) {
        SnsMethodCalculate.markStartTimeMs("imagePreview", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "data");
        Intent intent = new Intent(context, SnsGalleryUI.class);
        intent.putExtra("sns_gallery_userName", f289642d);
        intent.putExtra("sns_gallery_is_self", z);
        intent.putExtra("sns_gallery_localId", i);
        intent.putExtra("key_from_scene", 4);
        intent.putExtra("sns_gallery_position", bVar.f92399b);
        C94866e1.dy0().mo6419p(f289642d, bVar.f92398a);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/sns/model/withta/WithTaComposeOp", "imagePreview", "(Landroid/content/Context;IZLcom/tencent/mm/sns_compose/api/GalleryData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/sns/model/withta/WithTaComposeOp", "imagePreview", "(Landroid/content/Context;IZLcom/tencent/mm/sns_compose/api/GalleryData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        SnsMethodCalculate.markEndTimeMs("imagePreview", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
    }

    /* renamed from: e */
    public String mo86014e(int i, C101804kv2 kv22) {
        SnsMethodCalculate.markStartTimeMs("getSnsVideoPath", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        C87412m.m108594g(kv22, "media");
        String f = C94867e2.m120287f("sns_table_" + i, kv22);
        SnsMethodCalculate.markEndTimeMs("getSnsVideoPath", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return f;
    }

    /* renamed from: f */
    public String mo86015f() {
        SnsMethodCalculate.markStartTimeMs("getDisplayRemark", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        String Si = ((C75339i) C86312j.m106911c(C75339i.class)).mo62515Si(f289642d);
        C87412m.m108593f(Si, "getService(IContactCommD…tDisplayRemark(mUserName)");
        SnsMethodCalculate.markEndTimeMs("getDisplayRemark", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return Si;
    }

    /* renamed from: g */
    public String mo86016g(Context context, int i) {
        String str;
        Context context2 = context;
        SnsMethodCalculate.markStartTimeMs("getDisplayTime", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        C87412m.m108594g(context2, "context");
        long j = ((long) i) * ((long) 1000);
        Map<String, List<String>> map = C96315x6.f281690a;
        SnsMethodCalculate.markStartTimeMs("fromatSnsWithTa", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        instance2.setTimeInMillis(j);
        boolean z = instance.get(1) == instance2.get(1);
        boolean z2 = z && instance.get(2) == instance2.get(2);
        boolean z3 = z && z2 && instance.get(5) == instance2.get(5);
        boolean z4 = z && z2 && instance.get(5) - 1 == instance2.get(5);
        if (!z4) {
            if ((z && instance.get(2) - 1 == instance2.get(2)) || instance.get(1) - instance2.get(1) == 1) {
                instance.add(5, -1);
                z4 = instance.get(1) == instance2.get(1) && instance.get(2) == instance2.get(2) && instance.get(5) == instance2.get(5);
            }
        }
        if (z3) {
            str = context2.getString(C0966R.string.ezr);
            SnsMethodCalculate.markEndTimeMs("fromatSnsWithTa", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        } else if (z4) {
            str = context2.getString(C0966R.string.f360813f00);
            SnsMethodCalculate.markEndTimeMs("fromatSnsWithTa", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        } else {
            String str2 = z ? (String) DateFormat.format(context2.getString(C0966R.string.eyh), j) : (String) DateFormat.format(context2.getString(C0966R.string.f360810ez1), j);
            if (str2.indexOf("-") > 0) {
                str2 = instance2.get(5) + " " + C96315x6.m123539e(context2, instance2.get(2) + 1);
                if (!z) {
                    str2 = str2 + " " + instance2.get(1);
                }
            }
            str = str2 + " " + ((String) C96315x6.m123536b(context2, j));
            SnsMethodCalculate.markEndTimeMs("fromatSnsWithTa", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        }
        if (str == null) {
            str = "";
        }
        SnsMethodCalculate.markEndTimeMs("getDisplayTime", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return str;
    }

    public String getDisplayName(String str) {
        SnsMethodCalculate.markStartTimeMs("getDisplayName", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        C87412m.m108594g(str, "userName");
        String Si = ((C75339i) C86312j.m106911c(C75339i.class)).mo62515Si(str);
        C87412m.m108593f(Si, "getService(IContactCommD…etDisplayRemark(userName)");
        SnsMethodCalculate.markEndTimeMs("getDisplayName", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return Si;
    }

    public String getUsername() {
        SnsMethodCalculate.markStartTimeMs("getUsername", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        String str = f289642d;
        SnsMethodCalculate.markEndTimeMs("getUsername", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return str;
    }

    /* renamed from: h */
    public int mo86019h() {
        a94 SE;
        SnsMethodCalculate.markStartTimeMs("ownerSetting", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        int i = 0;
        if (C99019x.m128971c() == null || (SE = ((C100399d0) C99019x.m128971c()).mo139779SE(f289642d)) == null) {
            SnsMethodCalculate.markEndTimeMs("ownerSetting", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
            return 0;
        }
        int i2 = SE.f130395g;
        int i3 = SE.f130396h;
        if (i3 == 4320 && (i2 & 4096) > 0) {
            i = 1;
        } else if (i3 == 72 && (i2 & 4096) > 0) {
            i = 2;
        } else if (i3 == 720 && (i2 & 4096) > 0) {
            i = 3;
        }
        SnsMethodCalculate.markEndTimeMs("ownerSetting", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return i;
    }

    /* renamed from: i */
    public Object mo86020i(long j, int i, C15601d<? super C61285f<C34282e<C99474g>>> dVar) {
        SnsMethodCalculate.markStartTimeMs("getPage", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        Object a = C98791e.f289635a.mo138166a(j, i, f289642d, dVar);
        SnsMethodCalculate.markEndTimeMs("getPage", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return a;
    }

    /* renamed from: j */
    public void mo86021j(Context context, String str) {
        SnsMethodCalculate.markStartTimeMs("showDetailUI", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "snsId");
        SnsInfo TE = C94866e1.Yx0().mo139807TE(str);
        if (TE == null) {
            Log.m105921e("WithTaComposeOp", "showDetailUI snsInfo is null :snsId:%s", str);
            SnsMethodCalculate.markEndTimeMs("showDetailUI", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
            return;
        }
        Log.m105925i("WithTaComposeOp", "showDetailUI snsId:%s localId:%d", str, Integer.valueOf(TE.localid));
        Intent intent = new Intent(context, SnsCommentDetailUI.class);
        intent.putExtra("INTENT_TALKER", f289642d);
        intent.putExtra("INTENT_NEED_RPT_FEED", true);
        intent.putExtra("INTENT_SNS_LOCAL_ID", C100417r0.m131420i("sns_table_", (long) TE.localid));
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/sns/model/withta/WithTaComposeOp", "showDetailUI", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/sns/model/withta/WithTaComposeOp", "showDetailUI", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        SnsMethodCalculate.markEndTimeMs("showDetailUI", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
    }

    /* renamed from: k */
    public Object mo86022k(C101804kv2 kv22, boolean z, C15601d<? super Bitmap> dVar) {
        SnsMethodCalculate.markStartTimeMs("getSnsMediaBitmap", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        SnsMethodCalculate.markStartTimeMs("getImageFromMedia", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion");
        Object g = C53895h.m60469g(C53872d1.f151119c, new C98785a(kv22, z, (C15601d<? super C98785a>) null), dVar);
        SnsMethodCalculate.markEndTimeMs("getImageFromMedia", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion");
        SnsMethodCalculate.markEndTimeMs("getSnsMediaBitmap", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return g;
    }

    /* renamed from: l */
    public Object mo86023l(String str, String str2, boolean z, C15601d<? super String> dVar) {
        SnsMethodCalculate.markStartTimeMs("getImagePath", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        SnsMethodCalculate.markStartTimeMs("getImagePath", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion");
        Object g = C53895h.m60469g(C53872d1.f151119c, new C98786b(str, str2, z, (C15601d<? super C98786b>) null), dVar);
        SnsMethodCalculate.markEndTimeMs("getImagePath", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion");
        SnsMethodCalculate.markEndTimeMs("getImagePath", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return g;
    }

    /* renamed from: m */
    public void mo86024m(Context context, String str, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("startProfile", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "username");
        SnsMethodCalculate.markStartTimeMs("startProfile", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        Intent intent = new Intent();
        intent.putExtra("Contact_User", str);
        intent.putExtra("Contact_Scene", i);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", i2);
        ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93174g(intent, context);
        SnsMethodCalculate.markEndTimeMs("startProfile", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        SnsMethodCalculate.markEndTimeMs("startProfile", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
    }

    /* renamed from: n */
    public Object mo86025n(String str, C15601d<? super Bitmap> dVar) {
        SnsMethodCalculate.markStartTimeMs("getAvatarBitmap", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        Bitmap N50 = ((C76708i) C86312j.m106911c(C76708i.class)).N50(str);
        SnsMethodCalculate.markEndTimeMs("getAvatarBitmap", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return N50;
    }

    /* renamed from: o */
    public String mo86026o() {
        SnsMethodCalculate.markStartTimeMs("getSelfName", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        String Mx0 = C94866e1.Mx0();
        C87412m.m108593f(Mx0, "getSelfName()");
        SnsMethodCalculate.markEndTimeMs("getSelfName", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return Mx0;
    }

    /* renamed from: p */
    public long mo86027p(String str) {
        SnsMethodCalculate.markStartTimeMs("unPackSnsId", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        C87412m.m108594g(str, "snsId");
        long n = C100417r0.m131425n(str);
        SnsMethodCalculate.markEndTimeMs("unPackSnsId", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return n;
    }

    /* renamed from: q */
    public boolean mo86028q() {
        SnsMethodCalculate.markStartTimeMs("isTogetherVideoEnabled", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        SnsMethodCalculate.markStartTimeMs("isTogetherVideoEnabled", "com.tencent.mm.plugin.sns.model.SnsConfig");
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_sns_together_video_enabled, false);
        SnsMethodCalculate.markEndTimeMs("isTogetherVideoEnabled", "com.tencent.mm.plugin.sns.model.SnsConfig");
        SnsMethodCalculate.markEndTimeMs("isTogetherVideoEnabled", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return wf;
    }

    /* renamed from: r */
    public C97785g mo86029r(int i, C101804kv2 kv22, int i2) {
        SnsMethodCalculate.markStartTimeMs("getSnsVideoTask", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        C87412m.m108594g(kv22, "media");
        C92315e eVar = new C92315e(kv22, i2, "sns_table_" + i, new C99277b(System.currentTimeMillis()), new C98794a());
        SnsMethodCalculate.markEndTimeMs("getSnsVideoTask", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return eVar;
    }

    /* renamed from: s */
    public final ArrayList<String> mo138167s() {
        SnsMethodCalculate.markStartTimeMs("getWithFriendsNameList", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        ArrayList<String> arrayList = f289640b;
        SnsMethodCalculate.markEndTimeMs("getWithFriendsNameList", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo138168t(java.lang.String r9, int r10, wx3.C15601d<? super java.lang.Boolean> r11) {
        /*
            r8 = this;
            java.lang.String r0 = "snsWithTaOpRequest"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r11 instanceof is2.C98793f.C60619b
            if (r2 == 0) goto L_0x001b
            r2 = r11
            is2.f$b r2 = (is2.C98793f.C60619b) r2
            int r3 = r2.f172718f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001b
            int r3 = r3 - r4
            r2.f172718f = r3
            goto L_0x0020
        L_0x001b:
            is2.f$b r2 = new is2.f$b
            r2.<init>(r8, r11)
        L_0x0020:
            java.lang.Object r11 = r2.f172716d
            xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
            int r4 = r2.f172718f
            r5 = 1
            if (r4 == 0) goto L_0x003a
            if (r4 != r5) goto L_0x002f
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0076
        L_0x002f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r9
        L_0x003a:
            kotlin.ResultKt.throwOnFailure(r11)
            ob0.c$b r11 = new ob0.c$b
            r11.<init>()
            r4 = 5213(0x145d, float:7.305E-42)
            r11.f127069d = r4
            java.lang.String r4 = "/cgi-bin/micromsg-bin/mmsnswithtaop"
            r11.f127068c = r4
            te3.g94 r4 = new te3.g94
            r4.<init>()
            long r6 = vr2.C102236a0.m134706B0(r9)
            r4.f133941d = r6
            r4.f133942e = r10
            r11.f127066a = r4
            te3.h94 r9 = new te3.h94
            r9.<init>()
            r11.f127067b = r9
            ob0.c r9 = r11.mo72403a()
            pb0.b$a r10 = pb0.C47446b.f127269a
            d14.f r9 = r10.mo72464a(r9)
            r2.f172718f = r5
            java.lang.Object r11 = d14.C58042h.m67202k(r9, r2)
            if (r11 != r3) goto L_0x0076
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        L_0x0076:
            r9 = r11
            pb0.a r9 = (pb0.C47445a) r9
            qb0.b r9 = r9.f128348a
            qb0.b r10 = qb0.C47798b.OnEnd
            r2 = 0
            if (r9 != r10) goto L_0x0082
            r9 = 1
            goto L_0x0083
        L_0x0082:
            r9 = 0
        L_0x0083:
            if (r9 == 0) goto L_0x0086
            goto L_0x0087
        L_0x0086:
            r11 = 0
        L_0x0087:
            pb0.a r11 = (pb0.C47445a) r11
            if (r11 == 0) goto L_0x0092
            T r9 = r11.f128353f
            te3.h94 r9 = (te3.h94) r9
            if (r9 == 0) goto L_0x0092
            goto L_0x0093
        L_0x0092:
            r5 = 0
        L_0x0093:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: is2.C98793f.mo138168t(java.lang.String, int, wx3.d):java.lang.Object");
    }
}
