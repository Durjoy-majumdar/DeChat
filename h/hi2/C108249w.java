package hi2;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import lh2.C109348i;
import lh2.C109352j;
import lh2.C109380y;
import lh2.C76700q;
import lh2.C99426e;
import lh2.C99444h;
import lh2.C99447k;
import lh2.C99472x;
import mh2.C99896a;
import ph2.C110214a;

/* renamed from: hi2.w */
public final class C108249w {

    /* renamed from: a */
    public static final C108249w f324119a = new C108249w();

    /* renamed from: a */
    public final String mo158634a(String str) {
        Log.m105924i("MicroMsg.VideoPluginNameUtil", "nameTranslate " + str);
        return C87412m.m108589b(str, C99426e.class.getName()) ? "plugin_emoji" : C87412m.m108589b(str, C109348i.class.getName()) ? "plugin_text" : C87412m.m108589b(str, C110214a.class.getName()) ? "plugin_music" : C87412m.m108589b(str, C99896a.class.getName()) ? "plugin_video_crop" : C87412m.m108589b(str, C99472x.class.getName()) ? "plugin_photo_crop" : C87412m.m108589b(str, C99447k.class.getName()) ? "plugin_back" : C87412m.m108589b(str, C109352j.class.getName()) ? "plugin_tip" : C87412m.m108589b(str, C99444h.class.getName()) ? "plugin_poi" : C87412m.m108589b(str, C76700q.class.getName()) ? "plugin_menu" : C87412m.m108589b(str, C109380y.class.getName()) ? "plugin_doodle" : str;
    }
}
