package zh2;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.RoundCornerAudioWaveView;
import gy3.C87412m;
import jq3.C60896i;
import jq3.C60905o;
import kg3.C76577a;

/* renamed from: zh2.a */
public final class C66819a extends C60896i<C66820b> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.cbf;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b0, code lost:
        if ((r0.f185875f == 1) != false) goto L_0x00b2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010e  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r5, jq3.C9493c r6, int r7, int r8, boolean r9, java.util.List r10) {
        /*
            r4 = this;
            zh2.b r6 = (zh2.C66820b) r6
            java.lang.String r7 = "holder"
            gy3.C87412m.m108594g(r5, r7)
            java.lang.String r7 = "item"
            gy3.C87412m.m108594g(r6, r7)
            r7 = 1
            if (r10 == 0) goto L_0x001e
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            boolean r8 = r10.contains(r8)
            if (r8 == 0) goto L_0x001e
            r4.mo90802j(r5, r6)
            goto L_0x011b
        L_0x001e:
            r8 = 2131297386(0x7f09046a, float:1.8212715E38)
            android.content.Context r9 = r5.f173499A
            r10 = 2131756834(0x7f100722, float:1.9144587E38)
            android.graphics.drawable.Drawable r9 = kg3.C76577a.m92158i(r9, r10)
            android.view.View r8 = r5.mo85812D(r8)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r8.setImageDrawable(r9)
            r8 = 2131300509(0x7f09109d, float:1.821905E38)
            android.view.View r8 = r5.mo85812D(r8)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            com.tencent.mm.protocal.protobuf.FinderObject r9 = r6.f191938d
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r9 = r9.objectDesc
            if (r9 == 0) goto L_0x011b
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r10 = r9.media
            java.lang.String r0 = "objectDesc.media"
            gy3.C87412m.m108593f(r10, r0)
            java.lang.Object r10 = sx3.C110818d0.m150916N(r10)
            com.tencent.mm.protocal.protobuf.FinderMedia r10 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r10
            if (r10 == 0) goto L_0x011b
            java.lang.String r0 = r10.coverUrl
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0075
            gc0.a r0 = gc0.C20828a.m22825b()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r10.coverUrl
            r1.append(r2)
            java.lang.String r2 = r10.cover_url_token
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.mo32518g(r1, r8)
            goto L_0x008f
        L_0x0075:
            gc0.a r0 = gc0.C20828a.m22825b()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r10.thumbUrl
            r1.append(r2)
            java.lang.String r2 = r10.thumb_url_token
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.mo32518g(r1, r8)
        L_0x008f:
            com.tencent.mm.protocal.protobuf.FinderObject r8 = r6.f191938d
            int r8 = r8.permissionFlag
            r8 = r8 & 8
            if (r8 != r7) goto L_0x009b
            r6.f191940f = r7
            goto L_0x0118
        L_0x009b:
            int r8 = r10.mediaType
            r0 = 4
            r1 = 2131304851(0x7f092193, float:1.8227856E38)
            r2 = 2
            r3 = 0
            if (r8 != r0) goto L_0x00dd
            te3.ve1 r0 = r9.feedBgmInfo
            if (r0 == 0) goto L_0x00b2
            int r0 = r0.f185875f
            if (r0 != r7) goto L_0x00af
            r0 = 1
            goto L_0x00b0
        L_0x00af:
            r0 = 0
        L_0x00b0:
            if (r0 == 0) goto L_0x00dd
        L_0x00b2:
            r6.f191940f = r3
            java.lang.Object[] r8 = new java.lang.Object[r2]
            int r9 = r10.videoDuration
            int r9 = r9 / 60
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8[r3] = r9
            int r9 = r10.videoDuration
            int r9 = r9 % 60
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8[r7] = r9
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r8, r2)
            java.lang.String r8 = "%02d:%02d"
            java.lang.String r7 = java.lang.String.format(r8, r7)
            java.lang.String r8 = "format(this, *args)"
            gy3.C87412m.m108593f(r7, r8)
            r5.mo85815G(r1, r7)
            goto L_0x0118
        L_0x00dd:
            if (r8 != r2) goto L_0x0116
            te3.ve1 r8 = r9.feedBgmInfo
            if (r8 == 0) goto L_0x00e9
            int r9 = r8.f185875f
            if (r9 != r7) goto L_0x00e9
            r9 = 1
            goto L_0x00ea
        L_0x00e9:
            r9 = 0
        L_0x00ea:
            if (r9 == 0) goto L_0x0116
            if (r8 == 0) goto L_0x00f1
            te3.td1 r9 = r8.f185873d
            goto L_0x00f2
        L_0x00f1:
            r9 = 0
        L_0x00f2:
            if (r9 == 0) goto L_0x0116
            if (r8 == 0) goto L_0x010b
            te3.td1 r8 = r8.f185873d
            if (r8 == 0) goto L_0x010b
            java.lang.String r8 = r8.f185539i
            if (r8 == 0) goto L_0x010b
            int r8 = r8.length()
            if (r8 != 0) goto L_0x0106
            r8 = 1
            goto L_0x0107
        L_0x0106:
            r8 = 0
        L_0x0107:
            if (r8 != 0) goto L_0x010b
            r8 = 1
            goto L_0x010c
        L_0x010b:
            r8 = 0
        L_0x010c:
            if (r8 == 0) goto L_0x0116
            r6.f191940f = r3
            java.lang.String r7 = "01:00"
            r5.mo85815G(r1, r7)
            goto L_0x0118
        L_0x0116:
            r6.f191940f = r7
        L_0x0118:
            r4.mo90802j(r5, r6)
        L_0x011b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zh2.C66819a.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        int i2 = recyclerView.getContext().getResources().getDisplayMetrics().widthPixels;
        View view = oVar.f44854d;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i2 / 3;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: j */
    public final void mo90802j(C60905o oVar, C66820b bVar) {
        if (bVar.f191940f) {
            oVar.mo85817I(C0966R.C0970id.hhf, 8);
            oVar.mo85817I(C0966R.C0970id.c78, 0);
            oVar.mo85817I(C0966R.C0970id.j_a, 8);
            oVar.mo85817I(C0966R.C0970id.f357471a04, 8);
            oVar.mo85817I(C0966R.C0970id.f357467a00, 8);
            oVar.mo85817I(C0966R.C0970id.h6h, 8);
            oVar.mo85817I(C0966R.C0970id.e8o, 8);
        } else if (bVar.f191939e) {
            oVar.mo85817I(C0966R.C0970id.hhf, 8);
            oVar.mo85817I(C0966R.C0970id.c78, 8);
            oVar.mo85817I(C0966R.C0970id.j_a, 0);
            oVar.mo85817I(C0966R.C0970id.f357471a04, 0);
            oVar.mo85817I(C0966R.C0970id.h6h, 8);
            oVar.mo85817I(C0966R.C0970id.f357467a00, 0);
            oVar.mo85817I(C0966R.C0970id.e8o, 8);
            RoundCornerAudioWaveView roundCornerAudioWaveView = (RoundCornerAudioWaveView) oVar.mo85812D(C0966R.C0970id.f357471a04);
            roundCornerAudioWaveView.setColor(C76577a.m92153d(oVar.f173499A, C0966R.color.BW_BG_100));
            roundCornerAudioWaveView.setShow(true);
        } else {
            oVar.mo85817I(C0966R.C0970id.hhf, 0);
            oVar.mo85817I(C0966R.C0970id.c78, 8);
            oVar.mo85817I(C0966R.C0970id.j_a, 8);
            oVar.mo85817I(C0966R.C0970id.f357471a04, 8);
            oVar.mo85817I(C0966R.C0970id.h6h, 0);
            oVar.mo85817I(C0966R.C0970id.f357467a00, 8);
            oVar.mo85817I(C0966R.C0970id.e8o, 0);
        }
    }
}
