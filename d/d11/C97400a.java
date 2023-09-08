package d11;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$f;
import com.tencent.p014mm.plugin.choosemsgfile.p318ui.C93009a;
import com.tencent.p014mm.plugin.choosemsgfile.p318ui.C93012f;
import com.tencent.p014mm.plugin.choosemsgfile.p318ui.ChooseMsgFileListUI;
import com.tencent.p014mm.plugin.choosemsgfile.p318ui.ChooseMsgFileShowUI;
import com.tencent.p014mm.plugin.choosemsgfile.p318ui.ChooseMsgFileUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import g11.C98067b;
import g11.C98068c;
import j20.C117292a;
import k20.C9556a;
import ke3.C88144b;
import p775zi.C79332c;

@C86522b
/* renamed from: d11.a */
public class C97400a extends C86301e implements C79332c {

    /* renamed from: d11.a$a */
    public class C97401a implements MMActivity.C6739d {

        /* renamed from: d */
        public final /* synthetic */ C79332c.C79333a f285904d;

        public C97401a(C97400a aVar, C79332c.C79333a aVar2) {
            this.f285904d = aVar2;
        }

        public void mmOnActivityResult(int i, int i2, Intent intent) {
            Log.m105925i("MicroMsg.ChooseMsgFileService", "requestCode:%d, resultCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
            Log.m105919d("MicroMsg.ChooseMsgFileService", "data:%s", intent);
            C98068c.m126677b(i, i2, intent, this.f285904d);
        }
    }

    /* renamed from: d11.a$b */
    public class C97402b implements MMFragmentActivity$$f {

        /* renamed from: a */
        public final /* synthetic */ MMActivity.C6739d f285905a;

        public C97402b(C97400a aVar, MMActivity.C6739d dVar) {
            this.f285905a = dVar;
        }

        public void mmOnActivityResult(int i, int i2, Intent intent) {
            this.f285905a.mmOnActivityResult(i, i2, intent);
        }
    }

    public void P80(MMActivity mMActivity, String str, String str2, int i, String str3, C79332c.C79333a aVar) {
        if ("file".equals(str2)) {
            int i2 = ChooseMsgFileListUI.f267824q;
            Intent intent = new Intent(mMActivity, ChooseMsgFileListUI.class);
            intent.putExtra("USERNAME", str);
            intent.putExtra("COUNT", i);
            intent.putExtra("EXTENSION", str3);
            mMActivity.mmSetOnActivityResultCallback(new C93009a(aVar));
            mMActivity.startActivityForResult(intent, C98067b.f287518a);
            return;
        }
        int i3 = ChooseMsgFileUI.f267840y;
        Intent intent2 = new Intent(mMActivity, ChooseMsgFileUI.class);
        intent2.putExtra("USERNAME", str);
        intent2.putExtra("TYPE", str2);
        intent2.putExtra("COUNT", i);
        intent2.putExtra("EXTENSION", str3);
        mMActivity.mmSetOnActivityResultCallback(new C93012f(aVar));
        mMActivity.startActivityForResult(intent2, C98067b.f287518a);
    }

    public void Xc0(Context context, String str, String str2) {
        int i = ChooseMsgFileShowUI.f312099t;
        Intent intent = new Intent(context, ChooseMsgFileShowUI.class);
        intent.putExtra("key_filepath", str);
        intent.putExtra("key_fileext", str2);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/choosemsgfile/ui/ChooseMsgFileShowUI", "showFile", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/choosemsgfile/ui/ChooseMsgFileShowUI", "showFile", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: kZ */
    public void mo109364kZ(Activity activity, String str, int i, String str2, C79332c.C79333a aVar) {
        Intent intent = new Intent();
        intent.putExtra("Select_Conv_Type", 3);
        intent.putExtra("scene_from", 11);
        intent.putExtra("Select_Conv_ui_title", activity.getString(C0966R.string.bdj));
        intent.putExtra("KChooseMsgFileType", str);
        intent.putExtra("KChooseMsgFileCount", i);
        intent.putExtra("KChooseMsgFileExtension", str2);
        intent.putExtra("MMActivity.OverrideEnterAnimation", C0966R.C0968anim.f2471dv);
        intent.putExtra("MMActivity.OverrideExitAnimation", C0966R.C0968anim.f2469dt);
        C97401a aVar2 = new C97401a(this, aVar);
        if (activity instanceof MMActivity) {
            ((MMActivity) activity).mmSetOnActivityResultCallback(aVar2);
        } else if (activity instanceof MMFragmentActivity) {
            ((MMFragmentActivity) activity).setMMOnFragmentActivityResult(new C97402b(this, aVar2));
        }
        C88144b.m109802t(activity, ".ui.transmit.SelectConversationUI", intent, C98067b.f287518a);
    }
}
