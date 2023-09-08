package p418rx;

import an3.C0107b;
import an3.C67069a;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import bn3.C0335b;
import bn3.C67299a;
import cn3.C67408a;
import cn3.C67410b;
import cn3.C67411c;
import cn3.C67413d;
import cn3.C67417g;
import cn3.C67421h;
import cn3.C67435n;
import cn3.C67439q;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.p136ui.mvvm.MvvmSelectContactUI;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import fy3.C32226l;
import gy3.C87412m;
import java.util.List;
import p240sx.C13796o;
import p240sx.C36890u;
import sx3.C110818d0;
import wm3.C78631f;
import wm3.C78646i;
import xm3.C78870a;
import xm3.C78881e;
import xm3.C78889f0;
import xm3.C78899g;
import xm3.C78917n;
import xm3.C78924o0;
import xm3.C78928r;
import xm3.C78938y;
import xm3.C78944z;
import yb2.C79062b;
import ym3.C66670a;
import ym3.C66681c;
import zm3.C16307a;

@C86522b
/* renamed from: rx.h */
public final class C77580h extends C86301e implements C13796o {
    /* renamed from: OX */
    public Intent mo13154OX(AppCompatActivity appCompatActivity, String str) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        Log.m105924i("MicroMsg.MvvmSelectContactFeatureService", "createQuickSendRedPacketRecentConversationIntent title:" + str);
        Intent intent = new Intent(appCompatActivity, MvvmSelectContactUI.class);
        intent.putExtra("titile", str);
        C79062b.m95631b(intent, C78889f0.class);
        C79062b.m95631b(intent, C67417g.class);
        C79062b.m95631b(intent, C67413d.class);
        C79062b.m95631b(intent, C67421h.class);
        C79062b.m95631b(intent, C78944z.class);
        C79062b.m95631b(intent, C78928r.class);
        C79062b.m95631b(intent, C67410b.class);
        return intent;
    }

    public Intent S30(AppCompatActivity appCompatActivity, String str) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        Intent intent = new Intent(appCompatActivity, MvvmSelectContactUI.class);
        intent.putExtra("titile", str);
        C79062b.m95631b(intent, C67411c.class);
        C79062b.m95631b(intent, C78889f0.class);
        C79062b.m95631b(intent, C67417g.class);
        C79062b.m95631b(intent, C67421h.class);
        C79062b.m95631b(intent, C78944z.class);
        C79062b.m95631b(intent, C78928r.class);
        C79062b.m95631b(intent, C67410b.class);
        C79062b.m95631b(intent, C67413d.class);
        C79062b.m95631b(intent, C78881e.class);
        intent.putExtra("KEY_IS_ONLY_MULTI_SELECT_MODE", true);
        C79062b.m95631b(intent, C16307a.class);
        C79062b.m95631b(intent, C78899g.class);
        return intent;
    }

    /* renamed from: ZP */
    public Intent mo13156ZP(AppCompatActivity appCompatActivity, String str, String str2, List<String> list, List<String> list2) {
        AppCompatActivity appCompatActivity2 = appCompatActivity;
        String str3 = str;
        String str4 = str2;
        List<String> list3 = list;
        List<String> list4 = list2;
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(str3, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        C87412m.m108594g(str4, "chatroomName");
        C87412m.m108594g(list3, "selectedMemberList");
        C87412m.m108594g(list4, "allUserNameList");
        Log.m105924i("MicroMsg.MvvmSelectContactFeatureService", "createChooseChatRoomMemberIntent title:" + str3 + " chatroomName:" + str4 + " selectedMemberList:" + list3 + " allUserNameList:" + list4);
        Intent intent = new Intent(appCompatActivity, MvvmSelectContactUI.class);
        intent.putExtra("titile", str3);
        intent.putExtra("list_attr", 64);
        intent.putExtra("chatroomName", str4);
        intent.putExtra("chatroommemberlist", C110818d0.m150921S(list4, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null));
        intent.putExtra("already_select_contact", C110818d0.m150921S(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null));
        C79062b.m95631b(intent, C78924o0.class);
        C79062b.m95631b(intent, C66681c.class);
        C79062b.m95631b(intent, C66670a.class);
        C79062b.m95631b(intent, C78889f0.class);
        C79062b.m95631b(intent, C78870a.class);
        C79062b.m95631b(intent, C78938y.class);
        C79062b.m95631b(intent, C78944z.class);
        C79062b.m95631b(intent, C78928r.class);
        C79062b.m95631b(intent, C78917n.class);
        return intent;
    }

    /* renamed from: b */
    public Intent mo13157b(AppCompatActivity appCompatActivity, String str, boolean z, List<String> list) {
        int i;
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        Intent intent = new Intent(appCompatActivity, MvvmSelectContactUI.class);
        intent.putExtra("titile", str);
        C79062b.m95631b(intent, C67299a.class);
        C79062b.m95631b(intent, C0335b.class);
        C79062b.m95631b(intent, C78928r.class);
        C79062b.m95631b(intent, C78917n.class);
        if (list != null) {
            intent.putExtra("already_select_contact", Util.listToString(list, ","));
        }
        if (z) {
            i = 64;
        } else {
            C74560s1.m89276e();
            i = C74560s1.f219160a;
        }
        intent.putExtra("list_attr", i);
        intent.putExtra("KEY_NEED_SEAR_HEADER", false);
        return intent;
    }

    /* renamed from: i */
    public Intent mo13158i(AppCompatActivity appCompatActivity, String str, boolean z, List<String> list) {
        int i;
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        Intent intent = new Intent(appCompatActivity, MvvmSelectContactUI.class);
        intent.putExtra("titile", str);
        C79062b.m95631b(intent, C67069a.class);
        C79062b.m95631b(intent, C0107b.class);
        C79062b.m95631b(intent, C78928r.class);
        C79062b.m95631b(intent, C78917n.class);
        if (list != null) {
            intent.putExtra("already_select_contact", Util.listToString(list, ","));
        }
        if (z) {
            i = 64;
        } else {
            C74560s1.m89276e();
            i = C74560s1.f219160a;
        }
        intent.putExtra("list_attr", i);
        intent.putExtra("KEY_NEED_SEAR_HEADER", false);
        return intent;
    }

    /* renamed from: nz */
    public Intent mo13159nz(AppCompatActivity appCompatActivity) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Intent intent = new Intent(appCompatActivity, MvvmSelectContactUI.class);
        String string = appCompatActivity.getString(C0966R.string.f8184t6);
        C87412m.m108593f(string, "activity.getString(R.str…onversation_normal_title)");
        intent.putExtra("titile", string);
        C79062b.m95631b(intent, C67411c.class);
        C79062b.m95631b(intent, C78889f0.class);
        C79062b.m95631b(intent, C67417g.class);
        C79062b.m95631b(intent, C67421h.class);
        C79062b.m95631b(intent, C78944z.class);
        C79062b.m95631b(intent, C78928r.class);
        C79062b.m95631b(intent, C67439q.class);
        C79062b.m95631b(intent, C67413d.class);
        intent.putExtra("KEY_IS_SUPPORT_FORWARD_TYPE_WXWORK", ((C36890u) C86312j.m106911c(C36890u.class)).mo57759ac(appCompatActivity));
        C79062b.m95631b(intent, C78646i.class);
        C79062b.m95631b(intent, C78631f.class);
        C79062b.m95631b(intent, C67435n.class);
        C79062b.m95631b(intent, C67408a.class);
        return intent;
    }
}
