package s61;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import gy3.C87412m;
import java.util.ArrayList;

/* renamed from: s61.k */
public final class C101551k extends RecyclerView.C16613e<C101540a<?>> {

    /* renamed from: d */
    public final Context f297292d;

    /* renamed from: e */
    public final String f297293e = "MicroMsg.PreviewRelativeEmotionAdapter";

    /* renamed from: f */
    public final ArrayList<C101543c> f297294f = new ArrayList<>();

    /* renamed from: g */
    public C101542b f297295g;

    public C101551k(Context context) {
        C87412m.m108594g(context, "context");
        this.f297292d = context;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.tencent.mm.storage.emotion.EmojiInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: te3.o80} */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: F4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo141019F4(s61.C101543c r6, s61.C101543c r7) {
        /*
            r5 = this;
            boolean r0 = gy3.C87412m.m108589b(r6, r7)
            r1 = 1
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            r0 = 0
            if (r6 == 0) goto L_0x0079
            if (r7 == 0) goto L_0x0079
            int r2 = r6.getType()
            int r3 = r7.getType()
            if (r2 == r3) goto L_0x0019
            goto L_0x0079
        L_0x0019:
            int r2 = r7.getType()
            r3 = 0
            if (r2 == r1) goto L_0x004d
            r4 = 2
            if (r2 == r4) goto L_0x0024
            return r1
        L_0x0024:
            boolean r1 = r7 instanceof s61.C101545e
            if (r1 == 0) goto L_0x002b
            s61.e r7 = (s61.C101545e) r7
            goto L_0x002c
        L_0x002b:
            r7 = r3
        L_0x002c:
            if (r7 == 0) goto L_0x0031
            te3.o80 r7 = r7.f297281a
            goto L_0x0032
        L_0x0031:
            r7 = r3
        L_0x0032:
            boolean r1 = r6 instanceof s61.C101545e
            if (r1 == 0) goto L_0x0039
            s61.e r6 = (s61.C101545e) r6
            goto L_0x003a
        L_0x0039:
            r6 = r3
        L_0x003a:
            if (r6 == 0) goto L_0x003e
            te3.o80 r3 = r6.f297281a
        L_0x003e:
            if (r7 == 0) goto L_0x004c
            if (r3 != 0) goto L_0x0043
            goto L_0x004c
        L_0x0043:
            java.lang.String r6 = r3.f298994d
            java.lang.String r7 = r7.f298994d
            boolean r6 = gy3.C87412m.m108589b(r6, r7)
            return r6
        L_0x004c:
            return r0
        L_0x004d:
            boolean r1 = r7 instanceof s61.C101552m
            if (r1 == 0) goto L_0x0054
            s61.m r7 = (s61.C101552m) r7
            goto L_0x0055
        L_0x0054:
            r7 = r3
        L_0x0055:
            if (r7 == 0) goto L_0x005a
            com.tencent.mm.storage.emotion.EmojiInfo r7 = r7.f297296a
            goto L_0x005b
        L_0x005a:
            r7 = r3
        L_0x005b:
            boolean r1 = r6 instanceof s61.C101552m
            if (r1 == 0) goto L_0x0062
            s61.m r6 = (s61.C101552m) r6
            goto L_0x0063
        L_0x0062:
            r6 = r3
        L_0x0063:
            if (r6 == 0) goto L_0x0067
            com.tencent.mm.storage.emotion.EmojiInfo r3 = r6.f297296a
        L_0x0067:
            if (r7 == 0) goto L_0x0079
            if (r3 != 0) goto L_0x006c
            goto L_0x0079
        L_0x006c:
            java.lang.String r6 = r3.getMd5()
            java.lang.String r7 = r7.getMd5()
            boolean r6 = gy3.C87412m.m108589b(r6, r7)
            return r6
        L_0x0079:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s61.C101551k.mo141019F4(s61.c, s61.c):boolean");
    }

    public int getItemCount() {
        return this.f297294f.size();
    }

    public int getItemViewType(int i) {
        return this.f297294f.get(i).getType();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C101540a aVar = (C101540a) zVar;
        C87412m.m108594g(aVar, "holder");
        C101543c cVar = this.f297294f.get(i);
        C87412m.m108593f(cVar, "itemList[position]");
        C101543c cVar2 = cVar;
        aVar.mo141016y(cVar2);
        cVar2.getType();
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.C16631z zVar;
        C87412m.m108594g(viewGroup, "parent");
        LayoutInflater b = C85868k2.m106137b(viewGroup.getContext());
        if (i == 1) {
            View inflate = b.inflate(C0966R.C0971layout.b0q, viewGroup, false);
            Context context = this.f297292d;
            C87412m.m108593f(inflate, "itemView");
            zVar = new C101553n(context, inflate, this.f297295g);
        } else if (i == 2) {
            View inflate2 = b.inflate(C0966R.C0971layout.b0n, viewGroup, false);
            Context context2 = this.f297292d;
            C87412m.m108593f(inflate2, "itemView");
            zVar = new C101546f(context2, inflate2, this.f297295g);
        } else if (i != 3) {
            return new C101544d(new View(this.f297292d));
        } else {
            View inflate3 = b.inflate(C0966R.C0971layout.b0o, viewGroup, false);
            Context context3 = this.f297292d;
            C87412m.m108593f(inflate3, "itemView");
            zVar = new C101548h(context3, inflate3, this.f297295g);
        }
        return zVar;
    }
}
