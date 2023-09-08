package p418rx;

import android.app.Activity;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86301e;
import dn3.C58326b;
import dn3.C7396c;
import dn3.C75418a;
import dn3.C75421e;
import dn3.C75431g;
import ei3.C86522b;
import fy3.C32226l;
import gy3.C87412m;
import java.util.List;
import lv1.C99672i;
import lv1.C99681n;
import p240sx.C77807p;
import pm3.C77113a;
import pm3.C77117c;
import pm3.C77118d;
import sx3.C110818d0;
import sx3.C64186f0;
import wm3.C78631f;
import wm3.C78638g;
import wm3.C78646i;
import xm3.C78889f0;
import xm3.C78917n;
import xm3.C78928r;
import xm3.C78938y;
import xm3.C78944z;
import yb2.C79062b;
import ym3.C66670a;

@C86522b
/* renamed from: rx.j */
public final class C77581j extends C86301e implements C77807p {
    /* renamed from: Be */
    public C77118d mo107756Be(AppCompatActivity appCompatActivity, C99672i iVar, C72996z1 z1Var, C99681n nVar, C44661m1 m1Var) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(z1Var, "contact");
        return C77113a.f225222a.mo107429b(appCompatActivity, iVar, z1Var, nVar, m1Var);
    }

    /* renamed from: Qi */
    public Intent mo107757Qi(AppCompatActivity appCompatActivity, String str, List<String> list, List<String> list2) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        C87412m.m108594g(list, "selectedChatroomList");
        C87412m.m108594g(list2, "allUserNameList");
        Intent intent = new Intent();
        intent.putExtra("titile", str);
        intent.putExtra("list_attr", 64);
        intent.putExtra("chatroomlist", C110818d0.m150921S(list2, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null));
        intent.putExtra("already_select_contact", C110818d0.m150921S(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null));
        intent.putExtra("openMenuStyle", 11);
        intent.putExtra("showLabelWhenSearch", false);
        intent.putExtra("showContactScrollbar", false);
        C79062b.m95631b(intent, C75431g.class);
        C79062b.m95631b(intent, C58326b.class);
        C79062b.m95631b(intent, C75421e.class);
        C79062b.m95631b(intent, C7396c.class);
        C79062b.m95631b(intent, C78889f0.class);
        C79062b.m95631b(intent, C75418a.class);
        C79062b.m95631b(intent, C78944z.class);
        C79062b.m95631b(intent, C78928r.class);
        C79062b.m95631b(intent, C78917n.class);
        return intent;
    }

    public Intent ak0(Activity activity, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List<String> list, int i, String str9, boolean z) {
        Activity activity2 = activity;
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Intent intent = new Intent();
        String str10 = str;
        intent.putExtra("key_tipWord", str);
        String str11 = str2;
        intent.putExtra("key_choiseSessionWord", str2);
        String str12 = str3;
        intent.putExtra("key_chatroomSessionWord", str3);
        String str13 = str4;
        intent.putExtra("key_rightButtonWord", str4);
        intent.putExtra("key_rightButtonLightFontColor", str5);
        intent.putExtra("key_rightButtonDarkFontColor", str6);
        intent.putExtra("key_rightButtonLightColor", str7);
        intent.putExtra("key_rightButtonDarkColor", str8);
        intent.putExtra("key_forceLightMode", z);
        intent.putExtra("showLabelWhenSearch", false);
        intent.putExtra("showContactScrollbar", false);
        intent.putExtra("max_limit_num", i);
        intent.putExtra("too_many_member_tip_string", str9);
        intent.putExtra("list_attr", 64);
        intent.putExtra("chatroomlist", C110818d0.m150921S(C64186f0.f181907d, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null));
        String str14 = null;
        if (list != null) {
            str14 = C110818d0.m150921S(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null);
        }
        intent.putExtra("already_select_contact", str14);
        intent.putExtra("openMenuStyle", 1);
        C79062b.m95631b(intent, C75431g.class);
        C79062b.m95631b(intent, C58326b.class);
        C79062b.m95631b(intent, C75421e.class);
        C79062b.m95631b(intent, C7396c.class);
        C79062b.m95631b(intent, C78889f0.class);
        C79062b.m95631b(intent, C75418a.class);
        C79062b.m95631b(intent, C78944z.class);
        C79062b.m95631b(intent, C78928r.class);
        C79062b.m95631b(intent, C78917n.class);
        return intent;
    }

    /* renamed from: qR */
    public Intent mo107759qR(Activity activity, String str, String str2, List<String> list, String str3) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        C87412m.m108594g(str2, "chatroomName");
        C87412m.m108594g(list, "memberList");
        C87412m.m108594g(str3, "quoteFromMember");
        Intent intent = new Intent();
        intent.putExtra("titile", str);
        intent.putExtra("chatroomName", str2);
        intent.putExtra("msgQuoteName", str3);
        C79062b.m95631b(intent, C78631f.class);
        C79062b.m95631b(intent, C78638g.class);
        C79062b.m95631b(intent, C66670a.class);
        C79062b.m95631b(intent, C78889f0.class);
        C79062b.m95631b(intent, C78646i.class);
        C79062b.m95631b(intent, C78938y.class);
        C79062b.m95631b(intent, C78944z.class);
        C79062b.m95631b(intent, C78928r.class);
        C79062b.m95631b(intent, C78917n.class);
        return intent;
    }

    /* renamed from: sD */
    public C77117c mo107760sD(int i, C72996z1 z1Var, C44661m1 m1Var) {
        C87412m.m108594g(z1Var, "contact");
        return C77113a.f225222a.mo107430c(i, z1Var, m1Var);
    }
}
