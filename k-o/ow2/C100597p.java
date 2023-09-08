package ow2;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.story.p108ui.view.gallery.StoryGalleryView;
import com.tencent.p014mm.sdk.platformtools.Log;
import iw2.C98862q;
import kw2.C99268i;
import qo3.C47883u;

/* renamed from: ow2.p */
public final class C100597p implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ StoryGalleryView f294745a;

    /* renamed from: b */
    public final /* synthetic */ C99268i f294746b;

    /* renamed from: ow2.p$a */
    public static final class C100598a implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ StoryGalleryView f294747d;

        public C100598a(StoryGalleryView storyGalleryView) {
            this.f294747d = storyGalleryView;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            int i = StoryGalleryView.f282056Q0;
            Log.m105924i("MicroMsg.StoryGalleryView", "delete click and click cancel it " + this.f294747d.f282094u + ' ' + this.f294747d.f282095v);
            StoryGalleryView storyGalleryView = this.f294747d;
            C98862q qVar = storyGalleryView.f282057A;
            if (qVar != null) {
                qVar.mo138190a(storyGalleryView.f282094u, storyGalleryView.f282095v);
            }
        }
    }

    public C100597p(StoryGalleryView storyGalleryView, C99268i iVar) {
        this.f294745a = storyGalleryView;
        this.f294746b = iVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo353a(boolean r8, java.lang.String r9) {
        /*
            r7 = this;
            int r9 = com.tencent.p014mm.plugin.story.p108ui.view.gallery.StoryGalleryView.f282056Q0
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "delete click and click ok it "
            r9.append(r0)
            com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView r0 = r7.f294745a
            int r0 = r0.f282094u
            r9.append(r0)
            r0 = 32
            r9.append(r0)
            com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView r0 = r7.f294745a
            int r0 = r0.f282095v
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            java.lang.String r0 = "MicroMsg.StoryGalleryView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r9)
            if (r8 == 0) goto L_0x007f
            kw2.i r8 = r7.f294746b
            r9 = 1
            r0 = 0
            if (r8 == 0) goto L_0x0043
            long r1 = r8.field_storyID
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x003a
            r1 = 1
            goto L_0x003b
        L_0x003a:
            r1 = 0
        L_0x003b:
            if (r1 == 0) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            r8 = 0
        L_0x003f:
            if (r8 == 0) goto L_0x0043
            r5 = 1
            goto L_0x0044
        L_0x0043:
            r5 = 0
        L_0x0044:
            com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView r8 = r7.f294745a
            android.content.Context r1 = r8.getContext()
            com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView r9 = r7.f294745a
            android.content.Context r9 = r9.getContext()
            r0 = 2131821704(0x7f110488, float:1.9276159E38)
            java.lang.String r2 = r9.getString(r0)
            com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView r9 = r7.f294745a
            android.content.Context r9 = r9.getContext()
            r0 = 2131837485(0x7f11422d, float:1.9308166E38)
            java.lang.String r3 = r9.getString(r0)
            r4 = 1
            ow2.p$a r6 = new ow2.p$a
            com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView r9 = r7.f294745a
            r6.<init>(r9)
            qo3.i0 r9 = nj3.C76879j.m92723Q(r1, r2, r3, r4, r5, r6)
            r8.f282070N = r9
            com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView r8 = r7.f294745a
            iw2.q r9 = r8.f282057A
            if (r9 == 0) goto L_0x007f
            int r0 = r8.f282094u
            int r8 = r8.f282095v
            r9.mo138191c(r0, r8)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ow2.C100597p.mo353a(boolean, java.lang.String):void");
    }
}
