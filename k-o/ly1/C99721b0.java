package ly1;

import yt0.C53568b;

/* renamed from: ly1.b0 */
public class C99721b0 implements C53568b {

    /* renamed from: a */
    public final /* synthetic */ C99730g0 f292263a;

    public C99721b0(C99730g0 g0Var) {
        this.f292263a = g0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo63442a(android.view.View r11, int r12, long r13) {
        /*
            r10 = this;
            java.lang.Class<sw1.s> r11 = sw1.C101703s.class
            ly1.g0 r13 = r10.f292263a
            ly1.p r13 = r13.f292293g
            ly1.p$a r13 = r13.f292389B1
            if (r12 < 0) goto L_0x001c
            java.util.LinkedList<vw1.l> r14 = r13.f292400i
            int r14 = r14.size()
            if (r12 < r14) goto L_0x0013
            goto L_0x001f
        L_0x0013:
            java.util.LinkedList<vw1.l> r13 = r13.f292400i
            java.lang.Object r12 = r13.get(r12)
            vw1.l r12 = (vw1.C102299l) r12
            goto L_0x0020
        L_0x001c:
            r13.getClass()
        L_0x001f:
            r12 = 0
        L_0x0020:
            boolean r13 = r12.f301296e
            if (r13 != 0) goto L_0x00cd
            boolean r13 = r12.f301297f
            if (r13 == 0) goto L_0x002a
            goto L_0x00cd
        L_0x002a:
            ly1.g0 r13 = r10.f292263a
            boolean r13 = r13.f292298o
            if (r13 == 0) goto L_0x0074
            boolean r13 = r12.f301295d
            if (r13 == 0) goto L_0x0054
            di3.d r11 = di3.C86312j.m106911c(r11)
            r0 = r11
            sw1.s r0 = (sw1.C101703s) r0
            ly1.g0 r11 = r10.f292263a
            android.content.Context r1 = r11.getContext()
            r2 = 6
            java.lang.String r3 = r12.f301307s
            java.lang.String r4 = r12.f301300i
            r5 = 0
            r6 = 0
            ly1.g0 r11 = r10.f292263a
            int r7 = r11.f292296j
            r8 = 0
            int r9 = r11.f292299p
            r0.mo10937Qd(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x00cd
        L_0x0054:
            di3.d r11 = di3.C86312j.m106911c(r11)
            r0 = r11
            sw1.s r0 = (sw1.C101703s) r0
            ly1.g0 r11 = r10.f292263a
            android.content.Context r1 = r11.getContext()
            r2 = 6
            java.lang.String r3 = r12.f301307s
            r4 = 0
            java.lang.String r5 = r12.f301300i
            java.lang.String r6 = r12.f301299h
            ly1.g0 r11 = r10.f292263a
            int r7 = r11.f292296j
            r8 = 0
            int r9 = r11.f292299p
            r0.mo10937Qd(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x00cd
        L_0x0074:
            android.content.Intent r11 = new android.content.Intent
            r11.<init>()
            vw1.m r13 = new vw1.m
            r13.<init>()
            ly1.g0 r14 = r10.f292263a
            ly1.d r14 = r14.f292290d
            java.util.LinkedList<vw1.l> r14 = r14.f292272e
            r13.f189460d = r14
            int r12 = r14.indexOf(r12)
            java.lang.String r14 = "game_video_list"
            byte[] r13 = r13.toByteArray()     // Catch:{ IOException -> 0x00cd }
            r11.putExtra(r14, r13)     // Catch:{ IOException -> 0x00cd }
            java.lang.String r13 = "game_video_list_current_index"
            r11.putExtra(r13, r12)     // Catch:{ IOException -> 0x00cd }
            java.lang.String r12 = "game_video_has_next"
            ly1.g0 r13 = r10.f292263a     // Catch:{ IOException -> 0x00cd }
            ly1.d r13 = r13.f292290d     // Catch:{ IOException -> 0x00cd }
            vw1.q r13 = r13.f292270c     // Catch:{ IOException -> 0x00cd }
            if (r13 == 0) goto L_0x00a8
            boolean r13 = r13.f148015g     // Catch:{ IOException -> 0x00cd }
            if (r13 == 0) goto L_0x00a8
            r13 = 1
            goto L_0x00a9
        L_0x00a8:
            r13 = 0
        L_0x00a9:
            r11.putExtra(r12, r13)     // Catch:{ IOException -> 0x00cd }
            java.lang.String r12 = "game_video_preview_source"
            ly1.s0$a r13 = ly1.C99772s0.C99773a.FROM_TAB_GALLERY     // Catch:{ IOException -> 0x00cd }
            r11.putExtra(r12, r13)     // Catch:{ IOException -> 0x00cd }
            java.lang.String r12 = "game_haowan_source_scene_id"
            ly1.g0 r13 = r10.f292263a     // Catch:{ IOException -> 0x00cd }
            int r13 = r13.f292299p     // Catch:{ IOException -> 0x00cd }
            r11.putExtra(r12, r13)     // Catch:{ IOException -> 0x00cd }
            ly1.g0 r12 = r10.f292263a     // Catch:{ IOException -> 0x00cd }
            android.content.Context r12 = r12.getContext()     // Catch:{ IOException -> 0x00cd }
            java.lang.String r13 = "game"
            java.lang.String r14 = ".media.preview.GameVideoPreviewUI"
            ly1.g0 r0 = r10.f292263a     // Catch:{ IOException -> 0x00cd }
            int r0 = r0.f292296j     // Catch:{ IOException -> 0x00cd }
            ke3.C88144b.m109795m(r12, r13, r14, r11, r0)     // Catch:{ IOException -> 0x00cd }
        L_0x00cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ly1.C99721b0.mo63442a(android.view.View, int, long):void");
    }
}
