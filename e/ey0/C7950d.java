package ey0;

import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C75339i;
import di3.C86312j;
import gc0.C20828a;
import gy3.C87412m;
import hc0.C20937c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import p196ln.C76708i;
import sx3.C36907w;
import te3.C49555gg;
import te3.C50265li;

/* renamed from: ey0.d */
public final class C7950d extends C60896i<C7948a> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.f359630cs0;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        String str;
        String str2;
        C7948a aVar = (C7948a) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(aVar, "item");
        ImageView imageView = (ImageView) oVar.f44854d.findViewById(C0966R.C0970id.mti);
        TextView textView = (TextView) oVar.f44854d.findViewById(C0966R.C0970id.mtl);
        MMNeat7extView mMNeat7extView = (MMNeat7extView) oVar.f44854d.findViewById(C0966R.C0970id.mtj);
        C50265li liVar = aVar.f26634d;
        String str3 = liVar.f137427g;
        if (!Util.isNullOrNil(liVar.f137428h)) {
            textView.setText(aVar.f26634d.f137428h);
        } else {
            textView.setText(((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(str3));
        }
        Bitmap N50 = ((C76708i) C86312j.m106911c(C76708i.class)).N50(str3);
        if (N50 != null) {
            imageView.setImageBitmap(BitmapUtil.getRoundedCornerBitmap(N50, false, (float) (N50.getWidth() / 2)));
        } else {
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59361q = C0966R.C0969drawable.be5;
            bVar.f59347c = true;
            bVar.f59364t = true;
            C20828a.m22825b().mo32519h(aVar.f26634d.f137429i, imageView, bVar.mo32666a());
        }
        LinkedList<C49555gg> linkedList = aVar.f26634d.f137425e;
        C87412m.m108592e(linkedList, "null cannot be cast to non-null type java.util.LinkedList<com.tencent.mm.protocal.protobuf.BizManageScopeItem>");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
        for (C49555gg ggVar : linkedList) {
            arrayList.add(ggVar.f134029e);
        }
        Object[] array = arrayList.toArray(new String[0]);
        C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String[] strArr = (String[]) array;
        C7951e eVar = C7951e.f26637a;
        C87412m.m108593f(mMNeat7extView, "descTv");
        if (strArr.length == 0) {
            str = mMNeat7extView.getContext().getString(C0966R.string.eda);
            C87412m.m108593f(str, "neatTv.context.getString…r_info_manage_empty_info)");
        } else if (strArr.length == 1) {
            str = strArr[0];
        } else {
            int length = strArr.length;
            String str4 = "";
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                str4 = eVar.mo9053b(strArr, i4);
                if (eVar.mo9052a(mMNeat7extView, str4)) {
                    break;
                }
                i3 = i4;
            }
            if (i3 < 1) {
                str = str4;
            } else {
                String str5 = "";
                while (-1 < i3) {
                    String b = eVar.mo9053b(strArr, i3);
                    int length2 = (strArr.length - 1) - i3;
                    StringBuilder sb = new StringBuilder();
                    sb.append(b);
                    if (length2 > 0) {
                        String string = mMNeat7extView.getContext().getString(C0966R.string.f360197f22);
                        C87412m.m108593f(string, "neatTv.context.getString…nfo_manage_suffix_format)");
                        str2 = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(length2)}, 1));
                        C87412m.m108593f(str2, "format(format, *args)");
                    } else {
                        str2 = "";
                    }
                    sb.append(str2);
                    str5 = sb.toString();
                    if (!eVar.mo9052a(mMNeat7extView, str5)) {
                        break;
                    }
                    i3--;
                }
                str = str5;
            }
        }
        mMNeat7extView.mo104279b(str);
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
