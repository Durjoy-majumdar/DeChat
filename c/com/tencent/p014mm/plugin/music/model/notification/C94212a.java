package com.tencent.p014mm.plugin.music.model.notification;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import java.util.List;
import ma2.C99815p;
import ra2.C101365a;

/* renamed from: com.tencent.mm.plugin.music.model.notification.a */
public class C94212a {

    /* renamed from: a */
    public boolean f272166a = false;

    /* renamed from: b */
    public Bundle f272167b = null;

    /* renamed from: c */
    public MMMusicPlayerService f272168c;

    /* renamed from: d */
    public NotificationManager f272169d;

    /* renamed from: e */
    public C99815p.C99818c f272170e;

    /* renamed from: f */
    public Runnable f272171f = new C94213a();

    /* renamed from: g */
    public BroadcastReceiver f272172g;

    /* renamed from: com.tencent.mm.plugin.music.model.notification.a$a */
    public class C94213a implements Runnable {
        public C94213a() {
        }

        public void run() {
            Log.m105924i("MicroMsg.Music.MMMusicNotification", "close");
            MMHandlerThread.removeRunnable(C94212a.this.f272171f);
            C94212a.this.f272168c.stopForeground(true);
            C94212a.this.f272167b = null;
        }
    }

    /* renamed from: b */
    public static void m119140b(View view, List<TextView> list) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m119140b(viewGroup.getChildAt(i), list);
            }
        } else if (view instanceof TextView) {
            list.add((TextView) view);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x02c1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.Notification mo129515a(android.content.Context r20, ra2.C101365a r21, boolean r22) {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            r3 = r21
            ma2.p r0 = ma2.C99815p.C99817b.f292514b
            android.content.Intent r0 = r0.mo139171I0()
            android.os.Bundle r4 = r0.getExtras()
            r1.f272167b = r4
            boolean r4 = r3.f296939E1
            if (r4 == 0) goto L_0x001c
            java.lang.String r4 = "com.tencent.mm.plugin.mv.ui.MusicMvMainUI"
            r0.setClassName(r2, r4)
            goto L_0x0021
        L_0x001c:
            java.lang.String r4 = "com.tencent.mm.plugin.music.ui.MusicMainUI"
            r0.setClassName(r2, r4)
        L_0x0021:
            r4 = 5
            java.lang.String r5 = "key_scene"
            r0.putExtra(r5, r4)
            r4 = 0
            r5 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r2, r4, r0, r5)
            s2.e$c r6 = new s2.e$c
            java.lang.String r7 = "reminder_channel_id"
            r6.<init>(r2, r7)
            r6.f258795g = r0
            r0 = 2131233736(0x7f080bc8, float:1.8083618E38)
            android.app.Notification r8 = r6.f258814z
            r8.icon = r0
            java.lang.String r8 = r3.field_songName
            java.lang.String r0 = r3.field_songSinger
            java.lang.String r9 = r3.field_songAlbum
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x005d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r0 = r3.field_songAlbum
            r9.append(r0)
            java.lang.String r0 = r9.toString()
        L_0x005d:
            r9 = r0
            java.lang.Class<gt.k> r0 = p158gt.C98201k.class
            java.lang.String r10 = "MicroMsg.Music.MMMusicNotification"
            r11 = 1
            java.lang.Object[] r12 = new java.lang.Object[r11]
            int r13 = r3.field_musicType
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12[r4] = r13
            java.lang.String r13 = "music.field_musicType %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r13, r12)
            int r13 = r3.field_musicType     // Catch:{ Exception -> 0x00d9 }
            if (r13 == 0) goto L_0x00c0
            if (r13 == r11) goto L_0x009c
            switch(r13) {
                case 5: goto L_0x00c0;
                case 6: goto L_0x007d;
                case 7: goto L_0x00c0;
                case 8: goto L_0x009c;
                case 9: goto L_0x009c;
                case 10: goto L_0x00c0;
                case 11: goto L_0x00c0;
                default: goto L_0x007c;
            }     // Catch:{ Exception -> 0x00d9 }
        L_0x007c:
            goto L_0x00e1
        L_0x007d:
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x00d9 }
            gt.k r0 = (p158gt.C98201k) r0     // Catch:{ Exception -> 0x00d9 }
            gt.m r0 = r0.mo137277xi()     // Catch:{ Exception -> 0x00d9 }
            java.lang.String r14 = r3.field_songAlbumLocalPath     // Catch:{ Exception -> 0x00d9 }
            r15 = 1
            com.tencent.mm.plugin.music.model.notification.MMMusicPlayerService r13 = r1.f272168c     // Catch:{ Exception -> 0x00d9 }
            float r16 = kg3.C76577a.m92156g(r13)     // Catch:{ Exception -> 0x00d9 }
            r17 = 1
            r18 = 1
            r13 = r0
            com.tencent.mm.modelimage.m r13 = (com.tencent.p014mm.modelimage.C92839m) r13     // Catch:{ Exception -> 0x00d9 }
            android.graphics.Bitmap r0 = r13.mo127167Lo(r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x00d9 }
            goto L_0x00e2
        L_0x009c:
            te3.kv2 r0 = new te3.kv2     // Catch:{ Exception -> 0x00d9 }
            r0.<init>()     // Catch:{ Exception -> 0x00d9 }
            java.lang.String r13 = r3.field_songMediaId     // Catch:{ Exception -> 0x00d9 }
            r0.f298689d = r13     // Catch:{ Exception -> 0x00d9 }
            java.lang.String r13 = r3.field_songAlbumUrl     // Catch:{ Exception -> 0x00d9 }
            r0.f298694i = r13     // Catch:{ Exception -> 0x00d9 }
            int r14 = r3.field_songAlbumType     // Catch:{ Exception -> 0x00d9 }
            r0.f298695j = r14     // Catch:{ Exception -> 0x00d9 }
            r0.f298692g = r13     // Catch:{ Exception -> 0x00d9 }
            jr2.o r13 = jr2.C99019x.m128972d()     // Catch:{ Exception -> 0x00d9 }
            if (r13 == 0) goto L_0x00e1
            jr2.o r13 = jr2.C99019x.m128972d()     // Catch:{ Exception -> 0x00d9 }
            com.tencent.mm.plugin.sns.model.o r13 = (com.tencent.p014mm.plugin.sns.model.C94901o) r13     // Catch:{ Exception -> 0x00d9 }
            android.graphics.Bitmap r0 = r13.mo131130n(r0)     // Catch:{ Exception -> 0x00d9 }
            goto L_0x00e2
        L_0x00c0:
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x00d9 }
            gt.k r0 = (p158gt.C98201k) r0     // Catch:{ Exception -> 0x00d9 }
            gt.m r0 = r0.mo137277xi()     // Catch:{ Exception -> 0x00d9 }
            java.lang.String r13 = r3.field_songAlbumLocalPath     // Catch:{ Exception -> 0x00d9 }
            com.tencent.mm.plugin.music.model.notification.MMMusicPlayerService r14 = r1.f272168c     // Catch:{ Exception -> 0x00d9 }
            float r14 = kg3.C76577a.m92156g(r14)     // Catch:{ Exception -> 0x00d9 }
            com.tencent.mm.modelimage.m r0 = (com.tencent.p014mm.modelimage.C92839m) r0     // Catch:{ Exception -> 0x00d9 }
            android.graphics.Bitmap r0 = r0.mo127188jo(r13, r14, r11)     // Catch:{ Exception -> 0x00d9 }
            goto L_0x00e2
        L_0x00d9:
            r0 = move-exception
            java.lang.Object[] r13 = new java.lang.Object[r4]
            java.lang.String r14 = "get bitmap"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r0, r14, r13)
        L_0x00e1:
            r0 = 0
        L_0x00e2:
            r10 = 1094713344(0x41400000, float:12.0)
            if (r0 == 0) goto L_0x00eb
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getRoundedCornerBitmap((android.graphics.Bitmap) r0, (boolean) r4, (float) r10, (boolean) r4)
            goto L_0x013a
        L_0x00eb:
            gc0.a r0 = gc0.C20828a.m22825b()
            java.lang.String r13 = r3.field_songAlbumUrl
            android.graphics.Bitmap r0 = r0.mo32516e(r13)
            if (r0 != 0) goto L_0x0136
            java.lang.String r13 = r3.field_musicId
            java.lang.String r13 = za2.C102984b.m136169f(r13, r4)
            hc0.c$b r14 = new hc0.c$b
            r14.<init>()
            java.lang.String r15 = r3.field_musicId
            java.lang.String r15 = za2.C102984b.m136169f(r15, r4)
            r14.f59350f = r15
            r14.f59346b = r11
            com.tencent.mm.plugin.music.model.notification.MMMusicPlayerService r15 = r1.f272168c
            r5 = 2131166998(0x7f070716, float:1.7948257E38)
            int r5 = kg3.C76577a.m92157h(r15, r5)
            com.tencent.mm.plugin.music.model.notification.MMMusicPlayerService r15 = r1.f272168c
            r12 = 2131166997(0x7f070715, float:1.7948255E38)
            int r12 = kg3.C76577a.m92157h(r15, r12)
            r14.f59354j = r5
            r14.f59355k = r12
            r14.f59345a = r11
            gc0.a r5 = gc0.C20828a.m22825b()
            java.lang.String r12 = r3.field_songAlbumUrl
            hc0.c r14 = r14.mo32666a()
            com.tencent.mm.plugin.music.model.notification.d r15 = new com.tencent.mm.plugin.music.model.notification.d
            r15.<init>(r1, r3, r13)
            r5.mo32515d(r12, r14, r15)
        L_0x0136:
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getRoundedCornerBitmap((android.graphics.Bitmap) r0, (boolean) r4, (float) r10, (boolean) r4)
        L_0x013a:
            android.widget.RemoteViews r3 = new android.widget.RemoteViews
            java.lang.String r5 = r20.getPackageName()
            r10 = 2131497164(0x7f0c10cc, float:1.8617913E38)
            r3.<init>(r5, r10)
            r5 = 2131309815(0x7f0934f7, float:1.8237924E38)
            if (r0 == 0) goto L_0x014f
            r3.setImageViewBitmap(r5, r0)
            goto L_0x0155
        L_0x014f:
            r0 = 2131231875(0x7f080483, float:1.8079843E38)
            r3.setImageViewResource(r5, r0)
        L_0x0155:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            r5 = 8
            r10 = 2131309821(0x7f0934fd, float:1.8237937E38)
            if (r0 != 0) goto L_0x0167
            r3.setViewVisibility(r10, r4)
            r3.setTextViewText(r10, r8)
            goto L_0x016a
        L_0x0167:
            r3.setViewVisibility(r10, r5)
        L_0x016a:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            r8 = 2131309817(0x7f0934f9, float:1.8237929E38)
            if (r0 != 0) goto L_0x017a
            r3.setViewVisibility(r8, r4)
            r3.setTextViewText(r8, r9)
            goto L_0x017d
        L_0x017a:
            r3.setViewVisibility(r8, r5)
        L_0x017d:
            com.tencent.mm.plugin.music.model.notification.MMMusicPlayerService r0 = r1.f272168c
            s2.e$c r5 = new s2.e$c
            r5.<init>(r0, r7)
            android.app.Notification r5 = r5.mo124378b()
            android.widget.RemoteViews r5 = r5.contentView
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r5 != 0) goto L_0x018f
            goto L_0x01da
        L_0x018f:
            int r5 = r5.getLayoutId()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r8 = 0
            android.view.View r0 = r0.inflate(r5, r8)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r5 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r5 = r0.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x01ae
            int r0 = r5.getCurrentTextColor()
            goto L_0x01dc
        L_0x01ae:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            m119140b(r0, r5)
            java.util.Iterator r0 = r5.iterator()
            r12 = r8
        L_0x01bb:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x01d3
            java.lang.Object r5 = r0.next()
            android.widget.TextView r5 = (android.widget.TextView) r5
            float r8 = r5.getTextSize()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x01bb
            r12 = r5
            goto L_0x01bb
        L_0x01d3:
            if (r12 == 0) goto L_0x01da
            int r0 = r12.getCurrentTextColor()
            goto L_0x01dc
        L_0x01da:
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L_0x01dc:
            r0 = r0 | r7
            int r5 = android.graphics.Color.red(r7)
            int r8 = android.graphics.Color.red(r0)
            int r5 = r5 - r8
            int r8 = android.graphics.Color.green(r7)
            int r9 = android.graphics.Color.green(r0)
            int r8 = r8 - r9
            int r7 = android.graphics.Color.blue(r7)
            int r0 = android.graphics.Color.blue(r0)
            int r7 = r7 - r0
            int r5 = r5 * r5
            int r8 = r8 * r8
            int r5 = r5 + r8
            int r7 = r7 * r7
            int r5 = r5 + r7
            double r7 = (double) r5
            double r7 = java.lang.Math.sqrt(r7)
            r9 = 4640537203540230144(0x4066800000000000, double:180.0)
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0210
            r0 = 1
            goto L_0x0211
        L_0x0210:
            r0 = 0
        L_0x0211:
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r7 = "com.tencent.mm.Intent.ACTION_MMMUSIC_NOTIFICATION_CLICK"
            r5.<init>(r7)
            java.lang.String r8 = "mm_music_notification_action_key"
            java.lang.String r9 = "mm_music_notification_action_pre"
            r5.putExtra(r8, r9)
            r9 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r4 = android.app.PendingIntent.getBroadcast(r2, r4, r5, r9)
            if (r0 == 0) goto L_0x022d
            r5 = 2131234638(0x7f080f4e, float:1.8085447E38)
            goto L_0x0230
        L_0x022d:
            r5 = 2131234639(0x7f080f4f, float:1.808545E38)
        L_0x0230:
            r9 = 2131309820(0x7f0934fc, float:1.8237935E38)
            r3.setImageViewResource(r9, r5)
            r3.setOnClickPendingIntent(r9, r4)
            android.content.Intent r4 = new android.content.Intent
            r4.<init>(r7)
            if (r22 == 0) goto L_0x0247
            java.lang.String r5 = "mm_music_notification_action_pause"
            r4.putExtra(r8, r5)
            goto L_0x024d
        L_0x0247:
            java.lang.String r5 = "mm_music_notification_action_play"
            r4.putExtra(r8, r5)
        L_0x024d:
            r5 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r4 = android.app.PendingIntent.getBroadcast(r2, r11, r4, r5)
            if (r22 == 0) goto L_0x025f
            if (r0 == 0) goto L_0x025b
            r5 = 2131234634(0x7f080f4a, float:1.808544E38)
            goto L_0x0268
        L_0x025b:
            r5 = 2131234635(0x7f080f4b, float:1.8085441E38)
            goto L_0x0268
        L_0x025f:
            if (r0 == 0) goto L_0x0265
            r5 = 2131234636(0x7f080f4c, float:1.8085443E38)
            goto L_0x0268
        L_0x0265:
            r5 = 2131234637(0x7f080f4d, float:1.8085445E38)
        L_0x0268:
            r9 = 2131309819(0x7f0934fb, float:1.8237933E38)
            r3.setImageViewResource(r9, r5)
            if (r22 == 0) goto L_0x0278
            r5 = 2131833379(0x7f113223, float:1.9299838E38)
            java.lang.String r5 = r2.getString(r5)
            goto L_0x027f
        L_0x0278:
            r5 = 2131833380(0x7f113224, float:1.929984E38)
            java.lang.String r5 = r2.getString(r5)
        L_0x027f:
            r3.setContentDescription(r9, r5)
            r3.setOnClickPendingIntent(r9, r4)
            android.content.Intent r4 = new android.content.Intent
            r4.<init>(r7)
            java.lang.String r5 = "mm_music_notification_action_next"
            r4.putExtra(r8, r5)
            r5 = 2
            r9 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r4 = android.app.PendingIntent.getBroadcast(r2, r5, r4, r9)
            if (r0 == 0) goto L_0x029d
            r5 = 2131234632(0x7f080f48, float:1.8085435E38)
            goto L_0x02a0
        L_0x029d:
            r5 = 2131234633(0x7f080f49, float:1.8085437E38)
        L_0x02a0:
            r9 = 2131309818(0x7f0934fa, float:1.823793E38)
            r3.setImageViewResource(r9, r5)
            r3.setOnClickPendingIntent(r9, r4)
            android.content.Intent r4 = new android.content.Intent
            r4.<init>(r7)
            java.lang.String r5 = "mm_music_notification_action_close"
            r4.putExtra(r8, r5)
            r5 = 3
            r7 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r2 = android.app.PendingIntent.getBroadcast(r2, r5, r4, r7)
            if (r0 == 0) goto L_0x02c1
            r0 = 2131234630(0x7f080f46, float:1.8085431E38)
            goto L_0x02c4
        L_0x02c1:
            r0 = 2131234631(0x7f080f47, float:1.8085433E38)
        L_0x02c4:
            r4 = 2131309816(0x7f0934f8, float:1.8237926E38)
            r3.setImageViewResource(r4, r0)
            r3.setOnClickPendingIntent(r4, r2)
            android.app.Notification r0 = r6.f258814z
            r0.contentView = r3
            android.app.Notification r0 = r6.mo124378b()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.music.model.notification.C94212a.mo129515a(android.content.Context, ra2.a, boolean):android.app.Notification");
    }

    /* renamed from: c */
    public void mo129516c(C101365a aVar, int i, boolean z) {
        Log.m105925i("MicroMsg.Music.MMMusicNotification", "sendMusicPlayerEvent action:%d", Integer.valueOf(i));
        MusicPlayerEvent musicPlayerEvent = new MusicPlayerEvent();
        MusicPlayerEvent.C1094a aVar2 = musicPlayerEvent.f9336d;
        aVar2.f9337a = i;
        aVar2.f9341e = "";
        aVar2.f9338b = aVar.mo140850m2();
        MusicPlayerEvent.C1094a aVar3 = musicPlayerEvent.f9336d;
        aVar3.f9344h = "not from app brand appid";
        aVar3.f9342f = z;
        musicPlayerEvent.asyncPublish(Looper.getMainLooper());
    }
}
