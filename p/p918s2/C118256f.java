package p918s2;

import android.app.Notification;
import android.content.Context;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.List;
import p918s2.C90116e;

/* renamed from: s2.f */
public class C118256f {

    /* renamed from: a */
    public final Context f353442a;

    /* renamed from: b */
    public final Notification.Builder f353443b;

    /* renamed from: c */
    public final C90116e.C90121c f353444c;

    /* renamed from: d */
    public RemoteViews f353445d;

    /* renamed from: e */
    public RemoteViews f353446e;

    /* renamed from: f */
    public final List<Bundle> f353447f;

    /* renamed from: g */
    public final Bundle f353448g;

    /* renamed from: h */
    public RemoteViews f353449h;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: android.content.res.Resources} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.content.res.Resources} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: android.content.res.Resources} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: android.graphics.drawable.Icon} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: android.graphics.drawable.Icon} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: android.graphics.drawable.Icon} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C118256f(p918s2.C90116e.C90121c r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r19.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.f353447f = r2
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r0.f353448g = r2
            r0.f353444c = r1
            android.content.Context r2 = r1.f258789a
            r0.f353442a = r2
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r2 < r3) goto L_0x002d
            android.app.Notification$Builder r2 = new android.app.Notification$Builder
            android.content.Context r4 = r1.f258789a
            java.lang.String r5 = r1.f258812x
            r2.<init>(r4, r5)
            r0.f353443b = r2
            goto L_0x0036
        L_0x002d:
            android.app.Notification$Builder r2 = new android.app.Notification$Builder
            android.content.Context r4 = r1.f258789a
            r2.<init>(r4)
            r0.f353443b = r2
        L_0x0036:
            android.app.Notification r2 = r1.f258814z
            android.app.Notification$Builder r4 = r0.f353443b
            long r5 = r2.when
            android.app.Notification$Builder r4 = r4.setWhen(r5)
            int r5 = r2.icon
            int r6 = r2.iconLevel
            android.app.Notification$Builder r4 = r4.setSmallIcon(r5, r6)
            android.widget.RemoteViews r5 = r2.contentView
            android.app.Notification$Builder r4 = r4.setContent(r5)
            java.lang.CharSequence r5 = r2.tickerText
            r6 = 0
            android.app.Notification$Builder r4 = r4.setTicker(r5, r6)
            long[] r5 = r2.vibrate
            android.app.Notification$Builder r4 = r4.setVibrate(r5)
            int r5 = r2.ledARGB
            int r7 = r2.ledOnMS
            int r8 = r2.ledOffMS
            android.app.Notification$Builder r4 = r4.setLights(r5, r7, r8)
            int r5 = r2.flags
            r5 = r5 & 2
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L_0x006f
            r5 = 1
            goto L_0x0070
        L_0x006f:
            r5 = 0
        L_0x0070:
            android.app.Notification$Builder r4 = r4.setOngoing(r5)
            int r5 = r2.flags
            r5 = r5 & 8
            if (r5 == 0) goto L_0x007c
            r5 = 1
            goto L_0x007d
        L_0x007c:
            r5 = 0
        L_0x007d:
            android.app.Notification$Builder r4 = r4.setOnlyAlertOnce(r5)
            int r5 = r2.flags
            r5 = r5 & 16
            if (r5 == 0) goto L_0x0089
            r5 = 1
            goto L_0x008a
        L_0x0089:
            r5 = 0
        L_0x008a:
            android.app.Notification$Builder r4 = r4.setAutoCancel(r5)
            int r5 = r2.defaults
            android.app.Notification$Builder r4 = r4.setDefaults(r5)
            java.lang.CharSequence r5 = r1.f258793e
            android.app.Notification$Builder r4 = r4.setContentTitle(r5)
            java.lang.CharSequence r5 = r1.f258794f
            android.app.Notification$Builder r4 = r4.setContentText(r5)
            android.app.Notification$Builder r4 = r4.setContentInfo(r6)
            android.app.PendingIntent r5 = r1.f258795g
            android.app.Notification$Builder r4 = r4.setContentIntent(r5)
            android.app.PendingIntent r5 = r2.deleteIntent
            android.app.Notification$Builder r4 = r4.setDeleteIntent(r5)
            android.app.PendingIntent r5 = r1.f258796h
            int r9 = r2.flags
            r9 = r9 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x00ba
            r9 = 1
            goto L_0x00bb
        L_0x00ba:
            r9 = 0
        L_0x00bb:
            android.app.Notification$Builder r4 = r4.setFullScreenIntent(r5, r9)
            android.graphics.Bitmap r5 = r1.f258797i
            android.app.Notification$Builder r4 = r4.setLargeIcon(r5)
            android.app.Notification$Builder r4 = r4.setNumber(r8)
            int r5 = r1.f258802n
            int r9 = r1.f258803o
            boolean r10 = r1.f258804p
            r4.setProgress(r5, r9, r10)
            android.app.Notification$Builder r4 = r0.f353443b
            java.lang.CharSequence r5 = r1.f258801m
            android.app.Notification$Builder r4 = r4.setSubText(r5)
            android.app.Notification$Builder r4 = r4.setUsesChronometer(r8)
            int r5 = r1.f258798j
            r4.setPriority(r5)
            java.util.ArrayList<s2.e$a> r4 = r1.f258790b
            java.util.Iterator r4 = r4.iterator()
        L_0x00e9:
            boolean r5 = r4.hasNext()
            java.lang.String r9 = "android.support.allowGeneratedReplies"
            r11 = 23
            java.lang.String r14 = ""
            if (r5 == 0) goto L_0x01f2
            java.lang.Object r5 = r4.next()
            s2.e$a r5 = (p918s2.C90116e.C90119a) r5
            int r15 = android.os.Build.VERSION.SDK_INT
            androidx.core.graphics.drawable.IconCompat r8 = r5.f258773b
            if (r8 != 0) goto L_0x010b
            int r8 = r5.f258779h
            if (r8 == 0) goto L_0x010b
            androidx.core.graphics.drawable.IconCompat r8 = androidx.core.graphics.drawable.IconCompat.m138052c(r6, r14, r8)
            r5.f258773b = r8
        L_0x010b:
            androidx.core.graphics.drawable.IconCompat r8 = r5.f258773b
            if (r15 < r11) goto L_0x0121
            android.app.Notification$Action$Builder r11 = new android.app.Notification$Action$Builder
            if (r8 == 0) goto L_0x0118
            android.graphics.drawable.Icon r8 = r8.mo144947g()
            goto L_0x0119
        L_0x0118:
            r8 = r6
        L_0x0119:
            java.lang.CharSequence r14 = r5.f258780i
            android.app.PendingIntent r15 = r5.f258781j
            r11.<init>(r8, r14, r15)
            goto L_0x0132
        L_0x0121:
            android.app.Notification$Action$Builder r11 = new android.app.Notification$Action$Builder
            if (r8 == 0) goto L_0x012a
            int r8 = r8.mo144944d()
            goto L_0x012b
        L_0x012a:
            r8 = 0
        L_0x012b:
            java.lang.CharSequence r14 = r5.f258780i
            android.app.PendingIntent r15 = r5.f258781j
            r11.<init>(r8, r14, r15)
        L_0x0132:
            s2.j[] r8 = r5.f258774c
            if (r8 == 0) goto L_0x019f
            int r14 = r8.length
            android.app.RemoteInput[] r15 = new android.app.RemoteInput[r14]
            r6 = 0
        L_0x013a:
            int r13 = r8.length
            if (r6 >= r13) goto L_0x0194
            r13 = r8[r6]
            android.app.RemoteInput$Builder r12 = new android.app.RemoteInput$Builder
            java.lang.String r10 = r13.f226260a
            r12.<init>(r10)
            java.lang.CharSequence r10 = r13.f226261b
            android.app.RemoteInput$Builder r10 = r12.setLabel(r10)
            java.lang.CharSequence[] r12 = r13.f226262c
            android.app.RemoteInput$Builder r10 = r10.setChoices(r12)
            boolean r12 = r13.f226263d
            android.app.RemoteInput$Builder r10 = r10.setAllowFreeFormInput(r12)
            android.os.Bundle r12 = r13.f226265f
            android.app.RemoteInput$Builder r10 = r10.addExtras(r12)
            int r12 = android.os.Build.VERSION.SDK_INT
            if (r12 < r3) goto L_0x017e
            java.util.Set<java.lang.String> r12 = r13.f226266g
            if (r12 == 0) goto L_0x017e
            java.util.Iterator r12 = r12.iterator()
        L_0x016a:
            boolean r16 = r12.hasNext()
            if (r16 == 0) goto L_0x017e
            java.lang.Object r16 = r12.next()
            r3 = r16
            java.lang.String r3 = (java.lang.String) r3
            r10.setAllowDataType(r3, r7)
            r3 = 26
            goto L_0x016a
        L_0x017e:
            int r3 = android.os.Build.VERSION.SDK_INT
            r12 = 29
            if (r3 < r12) goto L_0x0189
            int r3 = r13.f226264e
            r10.setEditChoicesBeforeSending(r3)
        L_0x0189:
            android.app.RemoteInput r3 = r10.build()
            r15[r6] = r3
            int r6 = r6 + 1
            r3 = 26
            goto L_0x013a
        L_0x0194:
            r3 = 0
        L_0x0195:
            if (r3 >= r14) goto L_0x019f
            r6 = r15[r3]
            r11.addRemoteInput(r6)
            int r3 = r3 + 1
            goto L_0x0195
        L_0x019f:
            android.os.Bundle r3 = r5.f258772a
            if (r3 == 0) goto L_0x01ab
            android.os.Bundle r3 = new android.os.Bundle
            android.os.Bundle r6 = r5.f258772a
            r3.<init>(r6)
            goto L_0x01b0
        L_0x01ab:
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
        L_0x01b0:
            boolean r6 = r5.f258775d
            r3.putBoolean(r9, r6)
            int r6 = android.os.Build.VERSION.SDK_INT
            r8 = 24
            if (r6 < r8) goto L_0x01c0
            boolean r8 = r5.f258775d
            r11.setAllowGeneratedReplies(r8)
        L_0x01c0:
            int r8 = r5.f258777f
            java.lang.String r9 = "android.support.action.semanticAction"
            r3.putInt(r9, r8)
            r8 = 28
            if (r6 < r8) goto L_0x01d0
            int r8 = r5.f258777f
            r11.setSemanticAction(r8)
        L_0x01d0:
            r8 = 29
            if (r6 < r8) goto L_0x01d9
            boolean r6 = r5.f258778g
            r11.setContextual(r6)
        L_0x01d9:
            boolean r5 = r5.f258776e
            java.lang.String r6 = "android.support.action.showsUserInterface"
            r3.putBoolean(r6, r5)
            r11.addExtras(r3)
            android.app.Notification$Builder r3 = r0.f353443b
            android.app.Notification$Action r5 = r11.build()
            r3.addAction(r5)
            r3 = 26
            r6 = 0
            r8 = 0
            goto L_0x00e9
        L_0x01f2:
            android.os.Bundle r3 = r1.f258807s
            if (r3 == 0) goto L_0x01fb
            android.os.Bundle r4 = r0.f353448g
            r4.putAll(r3)
        L_0x01fb:
            int r3 = android.os.Build.VERSION.SDK_INT
            android.widget.RemoteViews r4 = r1.f258809u
            r0.f353445d = r4
            android.widget.RemoteViews r4 = r1.f258810v
            r0.f353446e = r4
            android.app.Notification$Builder r4 = r0.f353443b
            boolean r5 = r1.f258799k
            r4.setShowWhen(r5)
            android.app.Notification$Builder r4 = r0.f353443b
            boolean r5 = r1.f258805q
            android.app.Notification$Builder r4 = r4.setLocalOnly(r5)
            r5 = 0
            android.app.Notification$Builder r4 = r4.setGroup(r5)
            r6 = 0
            android.app.Notification$Builder r4 = r4.setGroupSummary(r6)
            r4.setSortKey(r5)
            android.app.Notification$Builder r4 = r0.f353443b
            java.lang.String r7 = r1.f258806r
            android.app.Notification$Builder r4 = r4.setCategory(r7)
            int r7 = r1.f258808t
            android.app.Notification$Builder r4 = r4.setColor(r7)
            android.app.Notification$Builder r4 = r4.setVisibility(r6)
            android.app.Notification$Builder r4 = r4.setPublicVersion(r5)
            android.net.Uri r5 = r2.sound
            android.media.AudioAttributes r2 = r2.audioAttributes
            r4.setSound(r5, r2)
            r2 = 28
            if (r3 >= r2) goto L_0x028b
            java.util.ArrayList<s2.i> r2 = r1.f258791c
            if (r2 != 0) goto L_0x0248
            r3 = 0
            goto L_0x0268
        L_0x0248:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r2.size()
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L_0x0255:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0268
            java.lang.Object r4 = r2.next()
            s2.i r4 = (p918s2.C118258i) r4
            r4.getClass()
            r3.add(r14)
            goto L_0x0255
        L_0x0268:
            java.util.ArrayList<java.lang.String> r2 = r1.f258788A
            if (r3 != 0) goto L_0x026e
            r3 = r2
            goto L_0x028d
        L_0x026e:
            if (r2 != 0) goto L_0x0271
            goto L_0x028d
        L_0x0271:
            u.d r4 = new u.d
            int r5 = r3.size()
            int r6 = r2.size()
            int r5 = r5 + r6
            r4.<init>(r5)
            r4.addAll(r3)
            r4.addAll(r2)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r4)
            goto L_0x028d
        L_0x028b:
            java.util.ArrayList<java.lang.String> r3 = r1.f258788A
        L_0x028d:
            if (r3 == 0) goto L_0x02ab
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x02ab
            java.util.Iterator r2 = r3.iterator()
        L_0x0299:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x02ab
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            android.app.Notification$Builder r4 = r0.f353443b
            r4.addPerson(r3)
            goto L_0x0299
        L_0x02ab:
            android.widget.RemoteViews r2 = r1.f258811w
            r0.f353449h = r2
            java.util.ArrayList<s2.e$a> r2 = r1.f258792d
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x03f6
            android.os.Bundle r2 = r1.f258807s
            if (r2 != 0) goto L_0x02c2
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r1.f258807s = r2
        L_0x02c2:
            android.os.Bundle r2 = r1.f258807s
            java.lang.String r3 = "android.car.EXTENSIONS"
            android.os.Bundle r2 = r2.getBundle(r3)
            if (r2 != 0) goto L_0x02d1
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
        L_0x02d1:
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r2)
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            r6 = 0
        L_0x02dc:
            java.util.ArrayList<s2.e$a> r7 = r1.f258792d
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x03d7
            java.lang.String r7 = java.lang.Integer.toString(r6)
            java.util.ArrayList<s2.e$a> r8 = r1.f258792d
            java.lang.Object r8 = r8.get(r6)
            s2.e$a r8 = (p918s2.C90116e.C90119a) r8
            java.lang.Object r10 = p918s2.C118257g.f353450a
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>()
            androidx.core.graphics.drawable.IconCompat r11 = r8.f258773b
            if (r11 != 0) goto L_0x0306
            int r11 = r8.f258779h
            if (r11 == 0) goto L_0x0306
            r12 = 0
            androidx.core.graphics.drawable.IconCompat r11 = androidx.core.graphics.drawable.IconCompat.m138052c(r12, r14, r11)
            r8.f258773b = r11
        L_0x0306:
            androidx.core.graphics.drawable.IconCompat r11 = r8.f258773b
            if (r11 == 0) goto L_0x030f
            int r11 = r11.mo144944d()
            goto L_0x0310
        L_0x030f:
            r11 = 0
        L_0x0310:
            java.lang.String r12 = "icon"
            r10.putInt(r12, r11)
            java.lang.CharSequence r11 = r8.f258780i
            java.lang.String r12 = "title"
            r10.putCharSequence(r12, r11)
            android.app.PendingIntent r11 = r8.f258781j
            java.lang.String r12 = "actionIntent"
            r10.putParcelable(r12, r11)
            android.os.Bundle r11 = r8.f258772a
            if (r11 == 0) goto L_0x032f
            android.os.Bundle r11 = new android.os.Bundle
            android.os.Bundle r12 = r8.f258772a
            r11.<init>(r12)
            goto L_0x0334
        L_0x032f:
            android.os.Bundle r11 = new android.os.Bundle
            r11.<init>()
        L_0x0334:
            boolean r12 = r8.f258775d
            r11.putBoolean(r9, r12)
            java.lang.String r12 = "extras"
            r10.putBundle(r12, r11)
            s2.j[] r11 = r8.f258774c
            if (r11 != 0) goto L_0x0349
            r16 = r9
            r18 = r14
            r13 = 0
            goto L_0x03b7
        L_0x0349:
            int r13 = r11.length
            android.os.Bundle[] r13 = new android.os.Bundle[r13]
            r16 = r9
            r15 = 0
        L_0x034f:
            int r9 = r11.length
            if (r15 >= r9) goto L_0x03b5
            r9 = r11[r15]
            r17 = r11
            android.os.Bundle r11 = new android.os.Bundle
            r11.<init>()
            r18 = r14
            java.lang.String r14 = r9.f226260a
            java.lang.String r0 = "resultKey"
            r11.putString(r0, r14)
            java.lang.CharSequence r0 = r9.f226261b
            java.lang.String r14 = "label"
            r11.putCharSequence(r14, r0)
            java.lang.CharSequence[] r0 = r9.f226262c
            java.lang.String r14 = "choices"
            r11.putCharSequenceArray(r14, r0)
            boolean r0 = r9.f226263d
            java.lang.String r14 = "allowFreeFormInput"
            r11.putBoolean(r14, r0)
            android.os.Bundle r0 = r9.f226265f
            r11.putBundle(r12, r0)
            java.util.Set<java.lang.String> r0 = r9.f226266g
            if (r0 == 0) goto L_0x03aa
            boolean r9 = r0.isEmpty()
            if (r9 != 0) goto L_0x03aa
            java.util.ArrayList r9 = new java.util.ArrayList
            int r14 = r0.size()
            r9.<init>(r14)
            java.util.Iterator r0 = r0.iterator()
        L_0x0395:
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x03a5
            java.lang.Object r14 = r0.next()
            java.lang.String r14 = (java.lang.String) r14
            r9.add(r14)
            goto L_0x0395
        L_0x03a5:
            java.lang.String r0 = "allowedDataTypes"
            r11.putStringArrayList(r0, r9)
        L_0x03aa:
            r13[r15] = r11
            int r15 = r15 + 1
            r0 = r19
            r11 = r17
            r14 = r18
            goto L_0x034f
        L_0x03b5:
            r18 = r14
        L_0x03b7:
            java.lang.String r0 = "remoteInputs"
            r10.putParcelableArray(r0, r13)
            boolean r0 = r8.f258776e
            java.lang.String r9 = "showsUserInterface"
            r10.putBoolean(r9, r0)
            int r0 = r8.f258777f
            java.lang.String r8 = "semanticAction"
            r10.putInt(r8, r0)
            r5.putBundle(r7, r10)
            int r6 = r6 + 1
            r0 = r19
            r9 = r16
            r14 = r18
            goto L_0x02dc
        L_0x03d7:
            java.lang.String r0 = "invisible_actions"
            r2.putBundle(r0, r5)
            r4.putBundle(r0, r5)
            android.os.Bundle r0 = r1.f258807s
            if (r0 != 0) goto L_0x03ea
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.f258807s = r0
        L_0x03ea:
            android.os.Bundle r0 = r1.f258807s
            r0.putBundle(r3, r2)
            r0 = r19
            android.os.Bundle r2 = r0.f353448g
            r2.putBundle(r3, r4)
        L_0x03f6:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L_0x0423
            android.app.Notification$Builder r3 = r0.f353443b
            android.os.Bundle r4 = r1.f258807s
            android.app.Notification$Builder r3 = r3.setExtras(r4)
            r4 = 0
            r3.setRemoteInputHistory(r4)
            android.widget.RemoteViews r3 = r1.f258809u
            if (r3 == 0) goto L_0x0411
            android.app.Notification$Builder r4 = r0.f353443b
            r4.setCustomContentView(r3)
        L_0x0411:
            android.widget.RemoteViews r3 = r1.f258810v
            if (r3 == 0) goto L_0x041a
            android.app.Notification$Builder r4 = r0.f353443b
            r4.setCustomBigContentView(r3)
        L_0x041a:
            android.widget.RemoteViews r3 = r1.f258811w
            if (r3 == 0) goto L_0x0423
            android.app.Notification$Builder r4 = r0.f353443b
            r4.setCustomHeadsUpContentView(r3)
        L_0x0423:
            r3 = 26
            if (r2 < r3) goto L_0x0459
            android.app.Notification$Builder r3 = r0.f353443b
            r4 = 0
            android.app.Notification$Builder r3 = r3.setBadgeIconType(r4)
            r5 = 0
            android.app.Notification$Builder r3 = r3.setSettingsText(r5)
            android.app.Notification$Builder r3 = r3.setShortcutId(r5)
            r6 = 0
            android.app.Notification$Builder r3 = r3.setTimeoutAfter(r6)
            r3.setGroupAlertBehavior(r4)
            java.lang.String r3 = r1.f258812x
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0459
            android.app.Notification$Builder r3 = r0.f353443b
            android.app.Notification$Builder r3 = r3.setSound(r5)
            android.app.Notification$Builder r3 = r3.setDefaults(r4)
            android.app.Notification$Builder r3 = r3.setLights(r4, r4, r4)
            r3.setVibrate(r5)
        L_0x0459:
            r3 = 28
            if (r2 < r3) goto L_0x049b
            java.util.ArrayList<s2.i> r2 = r1.f258791c
            java.util.Iterator r2 = r2.iterator()
        L_0x0463:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x049b
            java.lang.Object r3 = r2.next()
            s2.i r3 = (p918s2.C118258i) r3
            android.app.Notification$Builder r4 = r0.f353443b
            r3.getClass()
            android.app.Person$Builder r3 = new android.app.Person$Builder
            r3.<init>()
            r5 = 0
            android.app.Person$Builder r3 = r3.setName(r5)
            android.app.Person$Builder r3 = r3.setIcon(r5)
            android.app.Person$Builder r3 = r3.setUri(r5)
            android.app.Person$Builder r3 = r3.setKey(r5)
            r5 = 0
            android.app.Person$Builder r3 = r3.setBot(r5)
            android.app.Person$Builder r3 = r3.setImportant(r5)
            android.app.Person r3 = r3.build()
            r4.addPerson(r3)
            goto L_0x0463
        L_0x049b:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 < r3) goto L_0x04ae
            android.app.Notification$Builder r2 = r0.f353443b
            boolean r1 = r1.f258813y
            r2.setAllowSystemGeneratedContextualActions(r1)
            android.app.Notification$Builder r1 = r0.f353443b
            r2 = 0
            r1.setBubbleMetadata(r2)
        L_0x04ae:
            p834a3.C103297a.m136810a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p918s2.C118256f.<init>(s2.e$c):void");
    }
}
