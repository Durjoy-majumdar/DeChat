package kd1;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Util;
import er1.C58784w3;
import fe1.C58960c;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import qd1.C12156a;
import te3.C51227sd1;
import up1.C27696y;
import vd1.C65584b;

/* renamed from: kd1.d */
public final class C9583d extends C60896i<C12156a> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.b0v;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        View findViewById;
        C60905o oVar2 = oVar;
        C12156a aVar = (C12156a) cVar;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(aVar, "item");
        FinderContact finderContact = aVar.f35265d.f131807d;
        if (finderContact != null) {
            TextView textView = (TextView) oVar2.f44854d.findViewById(C0966R.C0970id.kcb);
            if (textView != null) {
                textView.setText(finderContact.nickname);
            }
            ImageView imageView = (ImageView) oVar2.f44854d.findViewById(C0966R.C0970id.kc9);
            if (imageView != null) {
                String str = finderContact.headUrl;
                if (str == null) {
                    str = "";
                }
                Class cls = C11990s0.class;
                Class<C60200t1> cls2 = C60200t1.class;
                if (!Util.isNullOrNil(str)) {
                    C39818r rVar = C39818r.f106831a;
                    ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11872i2().mo85957c(new C62345f(str, (C27696y) null, 2, (C8480h) null), imageView, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
                }
            }
            ImageView imageView2 = (ImageView) oVar2.f44854d.findViewById(C0966R.C0970id.kc8);
            boolean z2 = false;
            if (imageView2 != null) {
                C58784w3.m68429F1(C58784w3.f168295a, imageView2, finderContact.authInfo, 0, C58960c.m68829a(finderContact, false), 4, (Object) null);
            }
            C51227sd1 sd12 = aVar.f35265d.f131810g;
            int i3 = sd12 != null ? sd12.f141445d : 0;
            C65584b bVar = C65584b.f188718a;
            C65584b.m77268f(bVar, oVar2.f44854d, C0966R.C0970id.kc_, C0966R.string.fzd, i3, 0, 16, (Object) null);
            C51227sd1 sd13 = aVar.f35265d.f131810g;
            int i4 = sd13 != null ? sd13.f141446e : 0;
            C65584b.m77268f(bVar, oVar2.f44854d, C0966R.C0970id.kca, C0966R.string.fzf, i4, 0, 16, (Object) null);
            if ((i3 == 0 || i4 == 0) && (findViewById = oVar2.f44854d.findViewById(C0966R.C0970id.kcc)) != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view = findViewById;
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/activity/FinderActivityMusicArtistConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/activity/data/FinderContactData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/activity/FinderActivityMusicArtistConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/activity/data/FinderContactData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View findViewById2 = oVar2.f44854d.findViewById(C0966R.C0970id.kc7);
            if (aVar.f35265d.f131808e == 1) {
                if (findViewById2 != null) {
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar3.mo10233c(0);
                    View view2 = findViewById2;
                    C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/activity/FinderActivityMusicArtistConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/activity/data/FinderContactData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/activity/FinderActivityMusicArtistConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/activity/data/FinderContactData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                String str2 = finderContact.username;
                if (str2 == null || str2.length() == 0) {
                    z2 = true;
                }
                if (z2) {
                    oVar2.f44854d.setOnClickListener(new C9581b(oVar2, aVar));
                } else {
                    oVar2.f44854d.setOnClickListener(new C9582c(oVar2, str2));
                }
            } else if (findViewById2 != null) {
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar4.mo10233c(8);
                View view3 = findViewById2;
                C117292a.m165358d(view3, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/activity/FinderActivityMusicArtistConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/activity/data/FinderContactData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/activity/FinderActivityMusicArtistConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/activity/data/FinderContactData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
