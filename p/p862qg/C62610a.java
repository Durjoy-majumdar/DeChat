package p862qg;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.album.p836ui.preview.uic.AlbumPreviewUIC;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import gj3.C59476i;
import gy3.C87412m;
import j20.C117292a;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import p434ig.C98672d;
import p861pg.C62279a;
import th0.C101880a;

/* renamed from: qg.a */
public class C62610a extends C60896i<C62279a> {
    public C62610a(int i) {
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.cbx;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        int i3;
        String str;
        C60905o oVar2 = oVar;
        C62279a aVar = (C62279a) cVar;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(aVar, "item");
        ImageView imageView = (ImageView) oVar2.mo85812D(C0966R.C0970id.dlv);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.height = AlbumPreviewUIC.f154708p;
        imageView.setLayoutParams(layoutParams);
        View view = oVar2.f44854d;
        List<C98672d> list2 = aVar.f177047i;
        int indexOf = list2 != null ? list2.indexOf(aVar.f177044f) : i;
        ImageView imageView2 = (ImageView) view.findViewById(C0966R.C0970id.dlv);
        C87412m.m108593f(imageView2, "uiBinding.albumImg");
        C72963f4 f4Var = aVar.f177045g;
        long j = 0;
        String a = C74928u.C57854a.m66842a(indexOf, f4Var != null ? f4Var.getMsgId() : 0);
        C87412m.m108593f(a, "getShareElementName(albu…, item.msgInfo?.msgId?:0)");
        String str2 = null;
        C59476i.m69400b(imageView2, a, (Object) null, 2, (Object) null);
        if (aVar.f177044f.mo55274P() == 2 || aVar.f177044f.mo55274P() == 4) {
            C101880a aVar2 = C101880a.f299976a;
            int i4 = aVar.f177046h;
            C98672d dVar = aVar.f177044f;
            C72963f4 f4Var2 = aVar.f177045g;
            if (f4Var2 != null) {
                str2 = f4Var2.mo108768t();
            }
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            C72963f4 f4Var3 = aVar.f177045g;
            if (f4Var3 != null) {
                j = f4Var3.getMsgId();
            }
            C101880a aVar3 = aVar2;
            i3 = 4;
            aVar3.mo141349f(i4, dVar, str3, j, imageView2, indexOf, false, true);
        } else {
            i3 = 4;
        }
        C98672d dVar2 = aVar.f177044f;
        boolean z2 = dVar2.mo55274P() == i3;
        LinearLayout linearLayout = (LinearLayout) oVar2.mo85812D(C0966R.C0970id.l9w);
        View D = oVar2.mo85812D(C0966R.C0970id.f5738n_);
        if (z2) {
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar4.mo10233c(0);
            View view2 = D;
            C117292a.m165358d(view2, aVar4.mo10232b(), "com/tencent/mm/album/ui/preview/item/AlbumPreviewImageItemConvert", "checkVideoVisibility", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/album/msg/AlbumDataItem;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/album/ui/preview/item/AlbumPreviewImageItemConvert", "checkVideoVisibility", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/album/msg/AlbumDataItem;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            linearLayout.setVisibility(0);
            TextView textView = (TextView) linearLayout.findViewById(C0966R.C0970id.ca8);
            long R = dVar2.mo55278R();
            if (R >= 3600) {
                long j2 = (long) 3600;
                long j3 = (long) 60;
                str = String.format(Locale.US, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(R / j2), Long.valueOf((R % j2) / j3), Long.valueOf(R % j3)}, 3));
                C87412m.m108593f(str, "format(locale, format, *args)");
            } else if (R >= 600) {
                long j4 = (long) 60;
                str = String.format(Locale.US, "%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(R / j4), Long.valueOf(R % j4)}, 2));
                C87412m.m108593f(str, "format(locale, format, *args)");
            } else {
                long j5 = (long) 60;
                str = String.format(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(R / j5), Long.valueOf(R % j5)}, 2));
                C87412m.m108593f(str, "format(locale, format, *args)");
            }
            if (Util.isNullOrNil(str)) {
                str = "00:00";
            }
            textView.setText(str);
            return;
        }
        C9556a aVar5 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar5.mo10233c(8);
        View view3 = D;
        C117292a.m165358d(view3, aVar5.mo10232b(), "com/tencent/mm/album/ui/preview/item/AlbumPreviewImageItemConvert", "checkVideoVisibility", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/album/msg/AlbumDataItem;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        D.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/album/ui/preview/item/AlbumPreviewImageItemConvert", "checkVideoVisibility", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/album/msg/AlbumDataItem;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        linearLayout.setVisibility(8);
    }
}
