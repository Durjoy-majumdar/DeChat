package p207nl;

import android.app.Activity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import f40.C86709a0;
import hp3.C87581a;
import nj3.C76879j;
import ob0.C89132b;
import p207nl.C100130h;
import p595ll.C61303b;
import rx3.C13598b0;
import sx3.C26236u;

/* renamed from: nl.b */
public final class C76920b implements C100130h.C100131a {

    /* renamed from: a */
    public final /* synthetic */ C76922c f224782a;

    /* renamed from: nl.b$a */
    public static final class C76921a<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C76922c f224783a;

        public C76921a(C76922c cVar) {
            this.f224783a = cVar;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            int i = cVar.f256793a;
            int i2 = cVar.f256794b;
            String str = this.f224783a.f224788e;
            Log.m105924i(str, "CgiBackupEmojiOperate onResult: errType=" + i + ", errCode=" + i2);
            if (i == 0 && i2 == 0) {
                C76922c.m92779a(this.f224783a, true);
            } else {
                if (i2 == -434) {
                    Log.m105924i(this.f224783a.f224788e, "[cpan] save emoji onSceneEnd error over size.");
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_EMOJI_SYNC_CUSTOM_EMOJI_BATCH_DOWNLOAD_BOOLEAN, Boolean.TRUE);
                    C76922c cVar2 = this.f224783a;
                    C76879j.m92739j(cVar2.f224784a, C0966R.string.f360376ca0, C0966R.string.f7961xj, C0966R.string.c8w, C0966R.string.f7926wf, new C11215d(cVar2), C76924e.f224795d);
                    C115669n nVar = C115669n.INSTANCE;
                    EmojiInfo emojiInfo = this.f224783a.f224787d;
                    C76922c cVar3 = this.f224783a;
                    nVar.mo160131h(10431, 0, this.f224783a.f224787d.getMd5(), emojiInfo.field_designerID, emojiInfo.field_groupId, 1, 2, Integer.valueOf(this.f224783a.f224787d.field_size), cVar3.f224786c, cVar3.f224787d.field_activityid);
                } else {
                    C115669n nVar2 = C115669n.INSTANCE;
                    EmojiInfo emojiInfo2 = this.f224783a.f224787d;
                    C76922c cVar4 = this.f224783a;
                    nVar2.mo160131h(10431, 0, this.f224783a.f224787d.getMd5(), emojiInfo2.field_designerID, emojiInfo2.field_groupId, 1, 3, Integer.valueOf(this.f224783a.f224787d.field_size), cVar4.f224786c, cVar4.f224787d.field_activityid);
                    Activity activity = this.f224783a.f224784a;
                    C76879j.m92748s(activity, activity.getString(C0966R.string.c4e), "");
                }
                C76922c.m92779a(this.f224783a, false);
            }
            return C13598b0.f38549a;
        }
    }

    public C76920b(C76922c cVar) {
        this.f224782a = cVar;
    }

    /* renamed from: a */
    public void mo57745a(boolean z) {
        if (z) {
            new C61303b(0, 4, C26236u.m33719b(this.f224782a.f224787d.getMd5())).mo9225i().mo123420E(new C76921a(this.f224782a));
        } else {
            C76922c.m92779a(this.f224782a, false);
        }
    }
}
