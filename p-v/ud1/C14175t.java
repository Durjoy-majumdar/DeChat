package ud1;

import android.app.Activity;
import android.os.Bundle;
import android.util.Base64;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.activity.music.fragment.FinderMusicTopicFragment;
import com.tencent.p014mm.plugin.finder.activity.uic.FinderActivityTabUIC;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTabUIC;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import eb0.C31543z5;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import nd1.C11149a;
import o40.C61926c;
import od1.C11403f;
import od1.C11405h;
import org.json.JSONObject;
import rs1.C13317l7;
import rx3.C13598b0;
import sx3.C64197v;
import te3.C51270sn1;
import te3.C51485u23;
import te3.C51959xd1;
import te3.C52101yd1;
import te3.C64726td1;
import vd1.C14429a;
import z04.C119027c;

/* renamed from: ud1.t */
public final class C14175t extends FinderActivityTabUIC {

    /* renamed from: A */
    public String f39619A = "";

    /* renamed from: B */
    public FinderMusicTopicFragment f39620B;

    /* renamed from: y */
    public long f39621y;

    /* renamed from: z */
    public int f39622z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14175t(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C31543z5.m39453c();
    }

    /* renamed from: g4 */
    public boolean mo2229g4(int i) {
        return i == -4081 || i == -4080;
    }

    public String getCoverImgUrl() {
        return "";
    }

    /* renamed from: k4 */
    public void mo322k4(String str, int i, int i2) {
        C87412m.m108594g(str, "tabName");
        C14429a aVar = C14429a.f40033a;
        Activity context = getContext();
        C51270sn1 sn12 = (C51270sn1) this.f33558t;
        C51959xd1 xd12 = sn12 != null ? sn12.f141636z : null;
        JSONObject jSONObject = new JSONObject();
        byte[] bytes = str.getBytes(C119027c.f356488a);
        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
        jSONObject.put("tab_name", Base64.encodeToString(bytes, 2));
        C13598b0 b0Var = C13598b0.f38549a;
        C14429a.m13715a(aVar, context, "music_profile_video_tab", i2, 0, xd12, jSONObject, 8, (Object) null);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f39621y = getIntent().getLongExtra("key_activity_id", 0);
        this.f39622z = getIntent().getIntExtra("key_source_type", 0);
        mo13567q4();
    }

    /* renamed from: p4 */
    public boolean mo325p4(C51270sn1 sn12) {
        C51959xd1 xd12;
        C64726td1 td12;
        C51270sn1 sn13 = sn12;
        C87412m.m108594g(sn13, "topicInfo");
        C51959xd1 xd13 = sn13.f141636z;
        int i = 0;
        if (xd13 != null) {
            C11405h.C11406a.m11254b(this);
            C52101yd1 yd12 = xd13.f144606j;
            if (yd12 != null) {
                long j = xd13.f144600d;
                LinkedList<C51485u23> linkedList = yd12.f145232d;
                C87412m.m108593f(linkedList, "list");
                String str = "";
                boolean z = !Util.isNullOrNil(str);
                Iterator<T> it = linkedList.iterator();
                while (true) {
                    String str2 = null;
                    if (it.hasNext()) {
                        T next = it.next();
                        int i2 = i + 1;
                        if (i >= 0) {
                            C51485u23 u232 = (C51485u23) next;
                            FinderMusicTopicFragment finderMusicTopicFragment = new FinderMusicTopicFragment();
                            int i3 = u232.f142568e;
                            finderMusicTopicFragment.f17334o = i3 - 1;
                            String str3 = u232.f142567d;
                            finderMusicTopicFragment.f12469q = j;
                            if (str3 == null) {
                                str3 = str;
                            }
                            finderMusicTopicFragment.f12470r = str3;
                            if (i3 == 1) {
                                getIntent().putExtra("key_latest_index", i);
                            } else if (i3 == 3) {
                                this.f39620B = finderMusicTopicFragment;
                            }
                            String str4 = u232.f142567d;
                            C51485u23 u233 = u232;
                            FinderTabUIC.m65395f3(this, new C11149a(-1, str4 == null ? str : str4, z, 15, 0, 16, (C8480h) null), finderMusicTopicFragment, false, 4, (Object) null);
                            String str5 = u233.f142567d;
                            C11403f.m11231l4(this, str5 == null ? str : str5, u233.f142568e, 0, 4, (Object) null);
                            i = i2;
                        } else {
                            C64197v.m75542k();
                            throw null;
                        }
                    } else {
                        mo80049Y3();
                        C51270sn1 sn14 = (C51270sn1) this.f33558t;
                        if (!(sn14 == null || (xd12 = sn14.f141636z) == null || (td12 = xd12.f144603g) == null)) {
                            str2 = td12.f185546s;
                        }
                        if (str2 != null) {
                            str = str2;
                        }
                        this.f39619A = str;
                        getIntent().putExtra("key_song_id", this.f39619A);
                        mo13567q4();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: q4 */
    public final void mo13567q4() {
        C13317l7 l7Var = (C13317l7) C39818r.f106831a.mo62443b(getContext()).mo75002a(C13317l7.class);
        l7Var.mo12758c3("activityid", C61926c.m72691p(this.f39621y));
        l7Var.mo12760e3().mo145953n("src_type", this.f39622z);
        l7Var.mo12758c3("songid", this.f39619A);
    }
}
