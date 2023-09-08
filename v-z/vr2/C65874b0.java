package vr2;

import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import de3.C75360c0;
import di3.C86312j;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import i21.C60242i;
import is2.C98793f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k21.C60960c;
import p214om.C11502f;
import p629ny.C76979h;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.w64;

/* renamed from: vr2.b0 */
public final class C65874b0 {

    /* renamed from: a */
    public static final C65875a f189421a = new C65875a((C8480h) null);

    /* renamed from: vr2.b0$a */
    public static final class C65875a {

        /* renamed from: vr2.b0$a$a */
        public static final class C52985a implements C75360c0.C75361a {

            /* renamed from: a */
            public final /* synthetic */ C32227p<Context, String, C13598b0> f147895a;

            /* renamed from: b */
            public final /* synthetic */ String f147896b;

            public C52985a(C32227p<? super Context, ? super String, C13598b0> pVar, String str) {
                this.f147895a = pVar;
                this.f147896b = str;
            }

            /* renamed from: a */
            public final void mo67369a(View view, Object obj) {
                SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion$getDisplayRemarkSpan$snsSpan$1");
                C32227p<Context, String, C13598b0> pVar = this.f147895a;
                Context context = view.getContext();
                C87412m.m108593f(context, "widget.context");
                pVar.invoke(context, this.f147896b);
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion$getDisplayRemarkSpan$snsSpan$1");
            }
        }

        /* renamed from: vr2.b0$a$b */
        public static final class C65876b extends C87413o implements C32227p<Context, String, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ String f189422d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C65876b(String str) {
                super(2);
                this.f189422d = str;
            }

            public Object invoke(Object obj, Object obj2) {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion$getWithTaText$clickCb$1");
                Context context = (Context) obj;
                String str = (String) obj2;
                C60242i iVar = C60242i.APPEND;
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion$getWithTaText$clickCb$1");
                C87412m.m108594g(context, "context");
                C87412m.m108594g(str, "username");
                if (context instanceof SnsTimeLineUI) {
                    C60960c.f173618a.mo85933r("MomentsTogetherTailActionTimeline", this.f189422d, "ClickCount", 1, iVar);
                } else {
                    C60960c.f173618a.mo85933r("MomentsTogetherTailActionFeed", this.f189422d, "ClickCount", 1, iVar);
                }
                SnsMethodCalculate.markStartTimeMs("startProfile", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                Intent intent = new Intent();
                intent.putExtra("Contact_User", str);
                intent.putExtra("Contact_Scene", 0);
                intent.putExtra("CONTACT_INFO_UI_SOURCE", 61);
                ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93174g(intent, context);
                SnsMethodCalculate.markEndTimeMs("startProfile", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion$getWithTaText$clickCb$1");
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion$getWithTaText$clickCb$1");
                return b0Var;
            }
        }

        public C65875a(C8480h hVar) {
        }

        /* renamed from: a */
        public static int m77615a(C65875a aVar, int i, boolean z, int i2, Object obj) {
            SnsMethodCalculate.markStartTimeMs("characterCount2TextCount$default", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            if ((i2 & 2) != 0) {
                z = true;
            }
            aVar.getClass();
            SnsMethodCalculate.markStartTimeMs("characterCount2TextCount", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            int ceil = (int) (z ? Math.ceil(((double) i) / 2.0d) : Math.floor(((double) i) / 2.0d));
            SnsMethodCalculate.markEndTimeMs("characterCount2TextCount", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            SnsMethodCalculate.markEndTimeMs("characterCount2TextCount$default", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return ceil;
        }

        /* renamed from: b */
        public final boolean mo89923b(int i) {
            SnsMethodCalculate.markStartTimeMs("checkEnableShowGroupByExtFlag", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            boolean z = (i & 3) == 3 || (i & 5) == 5 || (i & 1025) == 1025 || (i & 513) == 513;
            SnsMethodCalculate.markEndTimeMs("checkEnableShowGroupByExtFlag", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return z;
        }

        /* renamed from: c */
        public final boolean mo89924c(SnsObject snsObject) {
            SnsMethodCalculate.markStartTimeMs("checkHaveBlackContactListOrTagListBySnsObject", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            if (snsObject == null) {
                SnsMethodCalculate.markEndTimeMs("checkHaveBlackContactListOrTagListBySnsObject", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                return false;
            } else if ((snsObject.ExtFlag & 2) > 0 && !Util.isNullOrNil((List) snsObject.BlackList)) {
                SnsMethodCalculate.markEndTimeMs("checkHaveBlackContactListOrTagListBySnsObject", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                return true;
            } else if ((snsObject.ExtFlag & 1024) <= 0 || Util.isNullOrNil((List) snsObject.BlackContactTagIdList)) {
                SnsMethodCalculate.markEndTimeMs("checkHaveBlackContactListOrTagListBySnsObject", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                return false;
            } else {
                SnsMethodCalculate.markEndTimeMs("checkHaveBlackContactListOrTagListBySnsObject", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                return true;
            }
        }

        /* renamed from: d */
        public final boolean mo89925d(SnsObject snsObject) {
            SnsMethodCalculate.markStartTimeMs("checkHaveBlackTagList", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            if (snsObject == null) {
                SnsMethodCalculate.markEndTimeMs("checkHaveBlackTagList", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                return false;
            } else if ((snsObject.ExtFlag & 1024) <= 0 || Util.isNullOrNil((List) snsObject.BlackContactTagIdList)) {
                SnsMethodCalculate.markEndTimeMs("checkHaveBlackTagList", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                return false;
            } else {
                SnsMethodCalculate.markEndTimeMs("checkHaveBlackTagList", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                return true;
            }
        }

        /* renamed from: e */
        public final boolean mo89926e(SnsObject snsObject) {
            SnsMethodCalculate.markStartTimeMs("checkHaveGroupContactListOrTagListBySnsObject", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            if (snsObject == null) {
                SnsMethodCalculate.markEndTimeMs("checkHaveGroupContactListOrTagListBySnsObject", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                return false;
            } else if ((snsObject.ExtFlag & 4) > 0 && !Util.isNullOrNil((List) snsObject.GroupUser)) {
                SnsMethodCalculate.markEndTimeMs("checkHaveGroupContactListOrTagListBySnsObject", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                return true;
            } else if ((snsObject.ExtFlag & 512) <= 0 || Util.isNullOrNil((List) snsObject.GroupContactTagIdList)) {
                SnsMethodCalculate.markEndTimeMs("checkHaveGroupContactListOrTagListBySnsObject", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                return false;
            } else {
                SnsMethodCalculate.markEndTimeMs("checkHaveGroupContactListOrTagListBySnsObject", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                return true;
            }
        }

        /* renamed from: f */
        public final boolean mo89927f(SnsObject snsObject) {
            SnsMethodCalculate.markStartTimeMs("checkHaveGroupTagList", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            if (snsObject == null) {
                SnsMethodCalculate.markEndTimeMs("checkHaveGroupTagList", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                return false;
            } else if ((snsObject.ExtFlag & 512) <= 0 || Util.isNullOrNil((List) snsObject.GroupContactTagIdList)) {
                SnsMethodCalculate.markEndTimeMs("checkHaveGroupTagList", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                return false;
            } else {
                SnsMethodCalculate.markEndTimeMs("checkHaveGroupTagList", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                return true;
            }
        }

        /* renamed from: g */
        public final void mo89928g(String str, SnsObject snsObject, boolean z) {
            SnsMethodCalculate.markStartTimeMs("debugPrintSnsObjectVisibilityInfo", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            C87412m.m108594g(str, "tag");
            if (snsObject == null) {
                SnsMethodCalculate.markEndTimeMs("debugPrintSnsObjectVisibilityInfo", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                return;
            }
            String str2 = z ? ", " : "\n ";
            StringBuilder sb = new StringBuilder();
            sb.append("debugPrintSnsObjectVisibilityInfo:");
            sb.append(str2);
            sb.append("SnsObject#Id=" + snsObject.f283891Id);
            sb.append(str2);
            sb.append("ExtFlag=" + snsObject.ExtFlag);
            sb.append(str2);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("showGroupList=");
            boolean z2 = true;
            sb4.append((snsObject.ExtFlag & 4) > 0);
            sb.append(sb4.toString());
            sb.append(str2);
            StringBuilder sb5 = new StringBuilder();
            sb5.append("showGroupTagList=");
            sb5.append((snsObject.ExtFlag & 512) > 0);
            sb.append(sb5.toString());
            sb.append(str2);
            StringBuilder sb6 = new StringBuilder();
            sb6.append("showBlackList=");
            sb6.append((snsObject.ExtFlag & 2) > 0);
            sb.append(sb6.toString());
            sb.append(str2);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("showBlackTagList=");
            if ((snsObject.ExtFlag & 1024) <= 0) {
                z2 = false;
            }
            sb7.append(z2);
            sb.append(sb7.toString());
            sb.append(str2);
            sb.append("GroupUser Size: " + snsObject.GroupUser.size());
            sb.append(str2);
            sb.append("BlackList Size: " + snsObject.BlackList.size());
            sb.append(str2);
            sb.append("BlackContactTagIdList:" + snsObject.BlackContactTagIdList);
            sb.append(str2);
            sb.append("GroupContactTagIdList:" + snsObject.GroupContactTagIdList);
            sb.append(str2);
            Log.m105924i(str, sb.toString());
            SnsMethodCalculate.markEndTimeMs("debugPrintSnsObjectVisibilityInfo", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        }

        /* renamed from: h */
        public final CharSequence mo89929h(String str, String str2, C32227p<? super Context, ? super String, C13598b0> pVar) {
            SnsMethodCalculate.markStartTimeMs("getDisplayRemarkSpan", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            C87412m.m108594g(str, "remarkname");
            C87412m.m108594g(str2, "username");
            C87412m.m108594g(pVar, "clickCb");
            SpannableString T1 = ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(MMApplicationContext.getContext(), str);
            C75360c0 c0Var = new C75360c0(str, new C52985a(pVar, str2));
            c0Var.f221540f = Boolean.FALSE;
            T1.setSpan(c0Var, 0, str.length(), 33);
            SnsMethodCalculate.markEndTimeMs("getDisplayRemarkSpan", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return T1;
        }

        /* renamed from: i */
        public final CharSequence mo89930i(Context context, String str, boolean z, LinkedList<w64> linkedList) {
            String str2;
            boolean z2;
            Class cls;
            String str3;
            String str4;
            Iterator it;
            CharSequence charSequence;
            Context context2 = context;
            String str5 = str;
            Class cls2 = C75339i.class;
            String str6 = "getWithTaText";
            SnsMethodCalculate.markStartTimeMs(str6, "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            C87412m.m108594g(str5, "snsId");
            C87412m.m108594g(linkedList, "withTaList");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(MMApplicationContext.getString(C0966R.string.jja));
            StringBuffer stringBuffer = new StringBuffer();
            Boolean valueOf = Boolean.valueOf(z);
            Vibrator vibrator = C102236a0.f301037a;
            SnsMethodCalculate.markStartTimeMs("getWithTaUsernameList", "com.tencent.mm.plugin.sns.data.SnsUtil");
            ArrayList arrayList = new ArrayList();
            C44668u3 Jx0 = C94866e1.Jx0();
            String Mx0 = C94866e1.Mx0();
            Iterator<w64> it4 = linkedList.iterator();
            boolean z3 = false;
            while (it4.hasNext()) {
                String str7 = it4.next().f299703d;
                C72996z1 z1Var = Jx0.get(str7);
                if (str7.equals(Mx0)) {
                    z3 = true;
                } else if (valueOf.booleanValue() || (!z1Var.mo62920o3() && z1Var.mo62927s3())) {
                    arrayList.add(str7);
                }
            }
            if (z3) {
                arrayList.add(0, Mx0);
            }
            SnsMethodCalculate.markEndTimeMs("getWithTaUsernameList", "com.tencent.mm.plugin.sns.data.SnsUtil");
            String Mx02 = C94866e1.Mx0();
            Iterator it5 = arrayList.iterator();
            boolean z4 = false;
            while (it5.hasNext()) {
                String str8 = (String) it5.next();
                if (!z4) {
                    spannableStringBuilder.append("");
                    z4 = true;
                } else {
                    spannableStringBuilder.append("、");
                    stringBuffer.append("#");
                }
                C65876b bVar = new C65876b(str5);
                if (C87412m.m108589b(str8, Mx02)) {
                    String string = MMApplicationContext.getString(C0966R.string.a09);
                    it = it5;
                    C87412m.m108593f(string, "getString(\n             ….libmmui.R.string.app_me)");
                    C87412m.m108593f(Mx02, "selfName");
                    charSequence = mo89929h(string, Mx02, bVar);
                    cls = cls2;
                    str3 = str6;
                    str4 = Mx02;
                    z2 = z4;
                } else {
                    it = it5;
                    String Si = ((C75339i) C86312j.m106911c(cls2)).mo62515Si(str8);
                    C87412m.m108593f(Si, "remarkName");
                    str4 = Mx02;
                    SnsMethodCalculate.markStartTimeMs("withFriends", "com.tencent.mm.plugin.sns.model.withta.UtilsKt");
                    cls = cls2;
                    String Si2 = ((C75339i) C86312j.m106911c(cls2)).mo62515Si(Si);
                    C98793f fVar = C98793f.f289639a;
                    z2 = z4;
                    if (!fVar.mo138167s().contains(Si2)) {
                        fVar.mo138167s().add(Si2);
                    }
                    List s = fVar.mo138167s();
                    if (fVar.mo138167s().size() > 3) {
                        ArrayList s2 = fVar.mo138167s();
                        str3 = str6;
                        List subList = s2.subList(0, 3);
                        C87412m.m108593f(subList, "WithTaComposeOp.withFriendsNameList.subList(0, 3)");
                        s = subList;
                    } else {
                        str3 = str6;
                    }
                    String string2 = MMApplicationContext.getString(C0966R.string.jkk);
                    C87412m.m108593f(string2, "getString(R.string.sns_withta_with_friends_total)");
                    String format = String.format(string2, Arrays.copyOf(new Object[]{C110818d0.m150921S(s, "、", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null)}, 1));
                    C87412m.m108593f(format, "format(format, *args)");
                    SnsMethodCalculate.markStartTimeMs("setWithFriendsStr", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
                    C98793f.f289641c = format;
                    SnsMethodCalculate.markEndTimeMs("setWithFriendsStr", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
                    SnsMethodCalculate.markEndTimeMs("withFriends", "com.tencent.mm.plugin.sns.model.withta.UtilsKt");
                    C87412m.m108593f(str8, "name");
                    charSequence = mo89929h(Si, str8, bVar);
                }
                spannableStringBuilder.append(charSequence);
                stringBuffer.append(str8);
                it5 = it;
                Mx02 = str4;
                str6 = str3;
                cls2 = cls;
                z4 = z2;
            }
            String str9 = str6;
            if (context2 instanceof SnsTimeLineUI) {
                C60960c.f173618a.mo85932q("MomentsTogetherTailActionTimeline", str5, "CCUserList", stringBuffer);
            } else if (context2 instanceof SnsCommentDetailUI) {
                C60960c.f173618a.mo85932q("MomentsTogetherTailActionFeed", str5, "CCUserList", stringBuffer);
            }
            if (arrayList.isEmpty()) {
                spannableStringBuilder.clear();
            }
            int size = linkedList.size();
            int size2 = arrayList.size();
            SnsMethodCalculate.markStartTimeMs("getWithTaStr", "com.tencent.mm.plugin.sns.data.SnsUtil");
            if (size2 == 1) {
                if (size2 < size) {
                    str2 = MMApplicationContext.getString(C0966R.string.jjd);
                    SnsMethodCalculate.markEndTimeMs("getWithTaStr", "com.tencent.mm.plugin.sns.data.SnsUtil");
                } else {
                    str2 = MMApplicationContext.getString(C0966R.string.jjc);
                    SnsMethodCalculate.markEndTimeMs("getWithTaStr", "com.tencent.mm.plugin.sns.data.SnsUtil");
                }
            } else if (size2 <= 1) {
                str2 = MMApplicationContext.getString(C0966R.string.jbg);
                SnsMethodCalculate.markEndTimeMs("getWithTaStr", "com.tencent.mm.plugin.sns.data.SnsUtil");
            } else if (size2 < size) {
                str2 = MMApplicationContext.getString(C0966R.string.jjb);
                SnsMethodCalculate.markEndTimeMs("getWithTaStr", "com.tencent.mm.plugin.sns.data.SnsUtil");
            } else {
                str2 = MMApplicationContext.getString(C0966R.string.jjc);
                SnsMethodCalculate.markEndTimeMs("getWithTaStr", "com.tencent.mm.plugin.sns.data.SnsUtil");
            }
            spannableStringBuilder.append(str2);
            SnsMethodCalculate.markEndTimeMs(str9, "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return spannableStringBuilder;
        }
    }
}
