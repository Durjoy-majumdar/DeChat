package rx0;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import d62.C75339i;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Arrays;
import p629ny.C76979h;

/* renamed from: rx0.n */
public final class C22270n {

    /* renamed from: d */
    public static final C22271a f63119d = new C22271a((C8480h) null);

    /* renamed from: a */
    public final MMActivity f63120a;

    /* renamed from: b */
    public final C18508z2 f63121b;

    /* renamed from: c */
    public final AppCompatActivity f63122c;

    /* renamed from: rx0.n$a */
    public static final class C22271a {
        public C22271a(C8480h hVar) {
        }

        /* renamed from: a */
        public final String mo35424a(Context context, int i, String str, String str2) {
            C87412m.m108594g(context, "context");
            C87412m.m108594g(str, "userName");
            C87412m.m108594g(str2, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            Log.m105924i("BizTimeLineMultiTaskCoverCreator", "createPageTitle, type = " + i);
            if (i == 8) {
                String displayName = ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(str);
                String string = context.getString(C0966R.string.e5o);
                C87412m.m108593f(string, "context.getString(R.stri…line_multitask_pic_title)");
                String format = String.format(string, Arrays.copyOf(new Object[]{displayName}, 1));
                C87412m.m108593f(format, "format(format, *args)");
                return format;
            } else if (i != 10) {
                return str2;
            } else {
                String gL = ((C76979h) C86312j.m106911c(C76979h.class)).mo107067gL(str2);
                C87412m.m108593f(gL, "{\n                    Se… //除去A链\n                }");
                return gL;
            }
        }
    }

    public C22270n(MMActivity mMActivity, C18508z2 z2Var) {
        C87412m.m108594g(mMActivity, "timelineUI");
        C87412m.m108594g(z2Var, "adapter");
        this.f63120a = mMActivity;
        this.f63121b = z2Var;
        this.f63122c = mMActivity.getContext();
    }
}
