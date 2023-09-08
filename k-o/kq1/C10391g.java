package kq1;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74783i3;
import com.tencent.p014mm.plugin.finder.view.C4236z1;
import com.tencent.p014mm.plugin.finder.view.FinderExtendReadingView;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import dr1.C7493o;
import fe1.C58960c;
import fe1.C58961d;
import fe1.C58969q;
import gy3.C8479f0;
import gy3.C87412m;
import hp3.C87581a;
import j20.C117292a;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import ob0.C89132b;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C51558uk0;
import te3.C64284cg;
import te3.t54;
import zc1.C66785b;

/* renamed from: kq1.g */
public final class C10391g<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C10389f f31605a;

    public C10391g(C10389f fVar) {
        this.f31605a = fVar;
    }

    public Object call(Object obj) {
        C7493o oVar;
        String str;
        String str2;
        T t;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            Log.m105924i("FinderPostRedPackCoverUIC", "[requestData] cover_list.size=" + ((C51558uk0) cVar.f256796d).f142890d.size());
            C10389f fVar = this.f31605a;
            LinkedList<t54> linkedList = ((C51558uk0) cVar.f256796d).f142890d;
            C87412m.m108593f(linkedList, "it.resp.cover_list");
            fVar.f31601e = (t54) C110818d0.m150916N(linkedList);
            C10389f fVar2 = this.f31605a;
            t54 t54 = fVar2.f31601e;
            if (!(t54 == null || (oVar = fVar2.f31603g) == null)) {
                FinderExtendReadingView finderExtendReadingView = oVar.f25730b;
                finderExtendReadingView.getClass();
                if (!finderExtendReadingView.f17725z) {
                    View view = finderExtendReadingView.f17723x;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "showRedPacketCover", "(Lcom/tencent/mm/protocal/protobuf/SingleCover;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "showRedPacketCover", "(Lcom/tencent/mm/protocal/protobuf/SingleCover;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    TextView textView = (TextView) finderExtendReadingView.f17723x.findViewById(C0966R.C0970id.ocm);
                    TextView textView2 = (TextView) finderExtendReadingView.f17723x.findViewById(C0966R.C0970id.oci);
                    FinderJumpInfo finderJumpInfo = t54.f141977g;
                    if (finderJumpInfo == null || (str = finderJumpInfo.wording) == null) {
                        str = "";
                    }
                    if (!(str.length() > 0) || str.length() <= 2) {
                        String O5 = C66785b.f191882e.mo90662O5();
                        C8479f0 f0Var = new C8479f0();
                        f0Var.f27484d = "";
                        C58969q b = C58961d.f168673a.mo84155b(O5);
                        if (b != null) {
                            C64284cg b2 = C58960c.m68830b(b, true);
                            if (b2 == null || (t = b2.f182469e) == null) {
                                t = b.getNickname();
                            }
                            f0Var.f27484d = t;
                        }
                        str2 = finderExtendReadingView.getContext().getResources().getString(C0966R.string.nei, new Object[]{f0Var.f27484d});
                        C87412m.m108593f(str2, "{\n            val userNa…over, nickName)\n        }");
                    } else {
                        str2 = str.substring(2, str.length());
                        C87412m.m108593f(str2, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    int dimensionPixelSize = (C74783i3.m89537a(finderExtendReadingView.getContext()).f24704a - finderExtendReadingView.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3731ck)) - ((int) textView2.getPaint().measureText(finderExtendReadingView.getContext().getResources().getString(C0966R.string.f7566ju)));
                    int measureText = (int) textView.getPaint().measureText(str2);
                    String string = finderExtendReadingView.getContext().getResources().getString(C0966R.string.nej);
                    C87412m.m108593f(string, "context.resources.getStr…st_red_pack_cover_suffix)");
                    int measureText2 = dimensionPixelSize - ((int) textView.getPaint().measureText(string));
                    if (measureText > dimensionPixelSize && measureText2 > 0) {
                        textView.getLayoutParams().width = dimensionPixelSize;
                        TextPaint paint = textView.getPaint();
                        C87412m.m108593f(paint, "titleTv.paint");
                        int lineEnd = new StaticLayout(str2, 0, str2.length(), paint, measureText2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 1.0f, true).getLineEnd(0);
                        StringBuilder sb = new StringBuilder();
                        String substring = str2.substring(0, lineEnd);
                        C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb.append(substring);
                        sb.append(string);
                        str2 = sb.toString();
                    }
                    textView.setText(str2);
                    finderExtendReadingView.f17723x.setOnClickListener(new C4236z1(finderExtendReadingView, t54));
                }
            }
        } else {
            Log.m105924i("FinderPostRedPackCoverUIC", "[requestData] errType=" + cVar.f256793a + " errCode=" + cVar.f256794b + " errMsg=" + cVar.f256795c);
        }
        return C13598b0.f38549a;
    }
}
