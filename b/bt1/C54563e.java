package bt1;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import ao1.C54270m1;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import sx3.C110818d0;
import te3.C49277ef1;
import te3.C51411tl0;
import te3.C52271zj0;
import te3.C64237ap1;
import te3.C64364fg1;
import te3.C64365fh0;
import te3.C64494kj0;
import te3.C64589nq2;
import te3.C64689rq2;
import te3.C64803wi0;
import uq1.C65462u;
import wq1.C66171a;

/* renamed from: bt1.e */
public final class C54563e {

    /* renamed from: A */
    public FinderItem f152943A;

    /* renamed from: B */
    public int f152944B;

    /* renamed from: C */
    public boolean f152945C;

    /* renamed from: D */
    public FinderJumpInfo f152946D;

    /* renamed from: E */
    public C64364fg1 f152947E;

    /* renamed from: F */
    public C51411tl0 f152948F;

    /* renamed from: G */
    public ArrayList<String> f152949G;

    /* renamed from: H */
    public ArrayList<Rect> f152950H;

    /* renamed from: I */
    public String f152951I = "";

    /* renamed from: J */
    public String f152952J = "";

    /* renamed from: K */
    public C64237ap1 f152953K;

    /* renamed from: L */
    public String f152954L;

    /* renamed from: M */
    public boolean f152955M;

    /* renamed from: N */
    public FinderJumpInfo f152956N;

    /* renamed from: O */
    public boolean f152957O;

    /* renamed from: P */
    public LinkedList<C64689rq2> f152958P;

    /* renamed from: Q */
    public LinkedList<FinderContact> f152959Q;

    /* renamed from: a */
    public final Intent f152960a;

    /* renamed from: b */
    public final String f152961b = "Finder.PostDataManager";

    /* renamed from: c */
    public final Bundle f152962c = new Bundle();

    /* renamed from: d */
    public Integer f152963d;

    /* renamed from: e */
    public ArrayList<String> f152964e;

    /* renamed from: f */
    public ArrayList<Integer> f152965f;

    /* renamed from: g */
    public byte[] f152966g;

    /* renamed from: h */
    public ArrayList<Parcelable> f152967h;

    /* renamed from: i */
    public ArrayList<String> f152968i;

    /* renamed from: j */
    public ArrayList<Integer> f152969j;

    /* renamed from: k */
    public int f152970k;

    /* renamed from: l */
    public boolean f152971l;

    /* renamed from: m */
    public Rect f152972m;

    /* renamed from: n */
    public boolean f152973n;

    /* renamed from: o */
    public byte[] f152974o;

    /* renamed from: p */
    public String f152975p;

    /* renamed from: q */
    public byte[] f152976q;

    /* renamed from: r */
    public String f152977r;

    /* renamed from: s */
    public String f152978s;

    /* renamed from: t */
    public String f152979t;

    /* renamed from: u */
    public long f152980u;

    /* renamed from: v */
    public boolean f152981v;

    /* renamed from: w */
    public boolean f152982w;

    /* renamed from: x */
    public int f152983x;

    /* renamed from: y */
    public String f152984y;

    /* renamed from: z */
    public long f152985z;

    /* JADX WARNING: Removed duplicated region for block: B:109:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02ca  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0323 A[SYNTHETIC, Splitter:B:138:0x0323] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0362 A[SYNTHETIC, Splitter:B:149:0x0362] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x03b3  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0292 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0055  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C54563e(android.content.Intent r11) {
        /*
            r10 = this;
            java.lang.String r0 = "intent"
            gy3.C87412m.m108594g(r11, r0)
            r10.<init>()
            r10.f152960a = r11
            java.lang.String r0 = "Finder.PostDataManager"
            r10.f152961b = r0
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r10.f152962c = r0
            java.lang.String r0 = ""
            r10.f152951I = r0
            r10.f152952J = r0
            java.lang.String r1 = "KEY_FINDER_POST_DRAFT_LOCAL_ID"
            r2 = 0
            long r4 = r11.getLongExtra(r1, r2)
            r10.f152985z = r4
            java.lang.String r1 = "KEY_FINDER_POST_DRAFT_SVR_ID"
            r11.getLongExtra(r1, r2)
            te3.vq0 r1 = new te3.vq0
            r1.<init>()
            java.lang.String r4 = "KEY_POST_DRAFT_FINDER_ITEM"
            byte[] r11 = r11.getByteArrayExtra(r4)
            r4 = 1
            r5 = 0
            java.lang.String r6 = "safeParser"
            r7 = 0
            if (r11 != 0) goto L_0x003d
            goto L_0x0049
        L_0x003d:
            r1.parseFrom(r11)     // Catch:{ Exception -> 0x0041 }
            goto L_0x004a
        L_0x0041:
            r11 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r5] = r11
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r6, r0, r1)
        L_0x0049:
            r1 = r7
        L_0x004a:
            if (r1 == 0) goto L_0x0055
            com.tencent.mm.plugin.finder.storage.FinderItem$a r11 = com.tencent.p014mm.plugin.finder.storage.FinderItem.Companion
            long r8 = r10.f152985z
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r11.mo79058d(r1, r8)
            goto L_0x0056
        L_0x0055:
            r11 = r7
        L_0x0056:
            r10.f152943A = r11
            android.content.Intent r11 = r10.f152960a
            java.lang.String r1 = "KEY_POST_DRAFT_WATERMARK_FLAG"
            int r11 = r11.getIntExtra(r1, r5)
            r10.f152944B = r11
            android.content.Intent r11 = r10.f152960a
            java.lang.String r1 = "KEY_FINDER_POST_DRAFT_FROM_OLD_VERSION"
            boolean r11 = r11.getBooleanExtra(r1, r5)
            r10.f152945C = r11
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r10.f152943A
            if (r11 == 0) goto L_0x00aa
            java.util.LinkedList r1 = r11.getMediaList()
            r10.f152958P = r1
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r11.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r1.objectDesc
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r11.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r1.objectDesc
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r11.getFeedObject()
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderContact> r1 = r1.mentionedUserContact
            r10.f152959Q = r1
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r11.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r1.objectDesc
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r11.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r1.objectDesc
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r1 = r11.getFirstJumpInfo()
            r10.f152946D = r1
            com.tencent.mm.protocal.protobuf.FinderObject r11 = r11.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r11 = r11.objectDesc
            if (r11 == 0) goto L_0x00a7
            te3.tl0 r11 = r11.generalReportInfo
            goto L_0x00a8
        L_0x00a7:
            r11 = r7
        L_0x00a8:
            r10.f152948F = r11
        L_0x00aa:
            android.content.Intent r11 = r10.f152960a
            r1 = -1
            java.lang.String r8 = "postType"
            int r11 = r11.getIntExtra(r8, r1)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10.f152963d = r11
            android.content.Intent r11 = r10.f152960a
            java.lang.String r1 = "postMediaList"
            java.util.ArrayList r11 = r11.getStringArrayListExtra(r1)
            r1 = 2
            if (r11 == 0) goto L_0x00c8
            m61322a(r10, r11, r5, r1, r7)
            goto L_0x00c9
        L_0x00c8:
            r11 = r7
        L_0x00c9:
            r10.f152964e = r11
            android.content.Intent r11 = r10.f152960a
            java.lang.String r8 = "key_post_media_quality_list"
            java.util.ArrayList r11 = r11.getIntegerArrayListExtra(r8)
            if (r11 == 0) goto L_0x00d9
            m61322a(r10, r11, r5, r1, r7)
            goto L_0x00da
        L_0x00d9:
            r11 = r7
        L_0x00da:
            r10.f152965f = r11
            android.content.Intent r11 = r10.f152960a
            java.lang.String r8 = "video_composition"
            byte[] r11 = r11.getByteArrayExtra(r8)
            r10.f152966g = r11
            java.util.ArrayList<java.lang.String> r11 = r10.f152964e
            if (r11 == 0) goto L_0x00f0
            int r11 = r11.size()
            goto L_0x00f1
        L_0x00f0:
            r11 = 0
        L_0x00f1:
            r10.f152970k = r11
            java.lang.Integer r11 = r10.f152963d
            r8 = 8
            if (r11 != 0) goto L_0x00fa
            goto L_0x0111
        L_0x00fa:
            int r11 = r11.intValue()
            if (r11 != r8) goto L_0x0111
            android.content.Intent r11 = r10.f152960a
            java.lang.String r8 = "postTypeList"
            java.util.ArrayList r11 = r11.getIntegerArrayListExtra(r8)
            if (r11 == 0) goto L_0x010e
            m61322a(r10, r11, r5, r1, r7)
            goto L_0x010f
        L_0x010e:
            r11 = r7
        L_0x010f:
            r10.f152969j = r11
        L_0x0111:
            android.content.Intent r11 = r10.f152960a
            java.lang.String r8 = "KEY_POST_FROM_CAMERA"
            boolean r11 = r11.getBooleanExtra(r8, r5)
            r10.f152971l = r11
            android.content.Intent r11 = r10.f152960a
            java.lang.String r8 = "postVideoCropList"
            java.util.ArrayList r11 = r11.getParcelableArrayListExtra(r8)
            if (r11 == 0) goto L_0x0129
            m61322a(r10, r11, r5, r1, r7)
            goto L_0x012a
        L_0x0129:
            r11 = r7
        L_0x012a:
            r10.f152967h = r11
            android.content.Intent r11 = r10.f152960a
            java.lang.String r8 = "postThumbList"
            java.util.ArrayList r11 = r11.getStringArrayListExtra(r8)
            if (r11 == 0) goto L_0x013a
            m61322a(r10, r11, r5, r1, r7)
            goto L_0x013b
        L_0x013a:
            r11 = r7
        L_0x013b:
            r10.f152968i = r11
            android.content.Intent r11 = r10.f152960a
            java.lang.String r8 = "KEY_POST_VLOG_CROP_RECT"
            android.os.Parcelable r11 = r11.getParcelableExtra(r8)
            android.graphics.Rect r11 = (android.graphics.Rect) r11
            r10.f152972m = r11
            android.content.Intent r11 = r10.f152960a
            java.lang.String r8 = "MEDIA_EXTRA_MUSIC"
            byte[] r11 = r11.getByteArrayExtra(r8)
            r10.f152974o = r11
            android.content.Intent r11 = r10.f152960a
            java.lang.String r8 = "ORIGIN_MUSIC_ID"
            java.lang.String r11 = r11.getStringExtra(r8)
            r10.f152975p = r11
            android.content.Intent r11 = r10.f152960a
            java.lang.String r8 = "ORIGIN_MUSIC_INFO"
            byte[] r11 = r11.getByteArrayExtra(r8)
            r10.f152976q = r11
            android.content.Intent r11 = r10.f152960a
            java.lang.String r8 = "ORIGIN_MUSIC_PATH"
            java.lang.String r11 = r11.getStringExtra(r8)
            r10.f152977r = r11
            android.content.Intent r11 = r10.f152960a
            java.lang.String r8 = "ORIGIN_BGM_URL"
            java.lang.String r11 = r11.getStringExtra(r8)
            r10.f152978s = r11
            android.content.Intent r11 = r10.f152960a
            java.lang.String r8 = "KEY_POST_ORIGIN_FILE_PATH"
            java.lang.String r11 = r11.getStringExtra(r8)
            r10.f152979t = r11
            android.content.Intent r11 = r10.f152960a
            boolean r8 = r10.f152981v
            java.lang.String r9 = "MEDIA_IS_MUTE"
            boolean r11 = r11.getBooleanExtra(r9, r8)
            r10.f152981v = r11
            android.content.Intent r11 = r10.f152960a
            boolean r8 = r10.f152982w
            java.lang.String r9 = "MUSIC_IS_MUTE"
            boolean r11 = r11.getBooleanExtra(r9, r8)
            r10.f152982w = r11
            android.content.Intent r11 = r10.f152960a
            java.lang.String r8 = "SOUND_TRACK_TYPE"
            int r11 = r11.getIntExtra(r8, r5)
            r10.f152983x = r11
            android.content.Intent r11 = r10.f152960a
            java.lang.String r8 = "EXT_INFO_FLAG"
            r11.getLongExtra(r8, r2)
            android.content.Intent r11 = r10.f152960a
            java.lang.String r8 = "ORIGIN_POST_FLAG"
            long r2 = r11.getLongExtra(r8, r2)
            r10.f152980u = r2
            android.content.Intent r11 = r10.f152960a
            java.lang.String r2 = "MUSIC_FEED_ID"
            java.lang.String r11 = r11.getStringExtra(r2)
            r10.f152984y = r11
            android.content.Intent r11 = r10.f152960a
            java.lang.String r2 = "post_id"
            java.lang.String r11 = r11.getStringExtra(r2)
            if (r11 != 0) goto L_0x01ce
            java.lang.String r11 = r10.f152951I
        L_0x01ce:
            r10.f152951I = r11
            android.content.Intent r11 = r10.f152960a
            java.lang.String r2 = "edit_id"
            java.lang.String r11 = r11.getStringExtra(r2)
            if (r11 != 0) goto L_0x01dc
            java.lang.String r11 = r10.f152952J
        L_0x01dc:
            r10.f152952J = r11
            android.content.Intent r11 = r10.f152960a
            java.lang.String r2 = "REPORT_INFO"
            java.lang.String r11 = r11.getStringExtra(r2)
            if (r11 == 0) goto L_0x01f0
            te3.tl0 r2 = new te3.tl0
            r2.<init>()
            r2.f142274d = r11
            goto L_0x01f2
        L_0x01f0:
            te3.tl0 r2 = r10.f152948F
        L_0x01f2:
            r10.f152948F = r2
            java.lang.String r11 = r10.f152951I
            int r11 = r11.length()
            if (r11 <= 0) goto L_0x01fe
            r11 = 1
            goto L_0x01ff
        L_0x01fe:
            r11 = 0
        L_0x01ff:
            if (r11 == 0) goto L_0x0214
            java.lang.String r11 = r10.f152951I
            java.lang.String r2 = r10.f152952J
            java.lang.String r3 = "postId"
            gy3.C87412m.m108594g(r11, r3)
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r3 = dp1.C58408t0.f167337b
            if (r3 == 0) goto L_0x0214
            r3.postId = r11
            if (r2 == 0) goto L_0x0214
            r3.editId = r2
        L_0x0214:
            android.content.Intent r11 = r10.f152960a
            java.lang.String r2 = "CLIENT_KV_REPORTINFO"
            java.lang.String r11 = r11.getStringExtra(r2)
            if (r11 == 0) goto L_0x0224
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r2 = dp1.C58408t0.f167337b
            if (r2 == 0) goto L_0x0224
            r2.clientKvReportInfo = r11
        L_0x0224:
            android.content.Intent r11 = r10.f152960a
            java.lang.String r2 = "isLongVideoPost"
            boolean r11 = r11.getBooleanExtra(r2, r5)
            r10.f152973n = r11
            android.content.Intent r11 = r10.f152960a
            java.lang.String r2 = "KEY_POST_HALF_IMAGE_LIST"
            java.util.ArrayList r11 = r11.getStringArrayListExtra(r2)
            if (r11 == 0) goto L_0x023c
            m61322a(r10, r11, r5, r1, r7)
            goto L_0x023d
        L_0x023c:
            r11 = r7
        L_0x023d:
            r10.f152949G = r11
            android.content.Intent r11 = r10.f152960a
            java.lang.String r2 = "KEY_POST_HALF_RECT_LIST"
            java.util.ArrayList r11 = r11.getParcelableArrayListExtra(r2)
            if (r11 == 0) goto L_0x024d
            m61322a(r10, r11, r5, r1, r7)
            goto L_0x024e
        L_0x024d:
            r11 = r7
        L_0x024e:
            r10.f152950H = r11
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r11 = r10.f152946D
            if (r11 != 0) goto L_0x02c6
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r11 = new com.tencent.mm.protocal.protobuf.FinderJumpInfo
            r11.<init>()
            android.content.Intent r1 = r10.f152960a
            java.lang.String r2 = "JUMP_INFO"
            byte[] r1 = r1.getByteArrayExtra(r2)
            if (r1 != 0) goto L_0x0264
            goto L_0x0270
        L_0x0264:
            r11.parseFrom(r1)     // Catch:{ Exception -> 0x0268 }
            goto L_0x0271
        L_0x0268:
            r11 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r5] = r11
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r6, r0, r1)
        L_0x0270:
            r11 = r7
        L_0x0271:
            if (r11 != 0) goto L_0x02c4
            android.content.Intent r11 = kd1.C9579a.f29817b
            if (r11 == 0) goto L_0x027e
            java.lang.String r1 = "key_activity_jump_info_list"
            java.io.Serializable r11 = r11.getSerializableExtra(r1)
            goto L_0x027f
        L_0x027e:
            r11 = r7
        L_0x027f:
            boolean r1 = r11 instanceof java.util.List
            if (r1 == 0) goto L_0x0286
            java.util.List r11 = (java.util.List) r11
            goto L_0x0287
        L_0x0286:
            r11 = r7
        L_0x0287:
            if (r11 == 0) goto L_0x02b9
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x0292:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x02ba
            java.lang.Object r2 = r11.next()
            byte[] r2 = (byte[]) r2
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r3 = new com.tencent.mm.protocal.protobuf.FinderJumpInfo
            r3.<init>()
            if (r2 != 0) goto L_0x02a6
            goto L_0x02b2
        L_0x02a6:
            r3.parseFrom(r2)     // Catch:{ Exception -> 0x02aa }
            goto L_0x02b3
        L_0x02aa:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r3[r5] = r2
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r6, r0, r3)
        L_0x02b2:
            r3 = r7
        L_0x02b3:
            if (r3 == 0) goto L_0x0292
            r1.add(r3)
            goto L_0x0292
        L_0x02b9:
            r1 = r7
        L_0x02ba:
            if (r1 == 0) goto L_0x02c3
            java.lang.Object r11 = sx3.C110818d0.m150916N(r1)
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r11 = (com.tencent.p014mm.protocal.protobuf.FinderJumpInfo) r11
            goto L_0x02c4
        L_0x02c3:
            r11 = r7
        L_0x02c4:
            r10.f152946D = r11
        L_0x02c6:
            te3.fg1 r11 = r10.f152947E
            if (r11 != 0) goto L_0x02f0
            te3.fg1 r11 = new te3.fg1
            r11.<init>()
            android.content.Intent r1 = r10.f152960a
            java.lang.String r2 = "OPTIONAL_INFO"
            byte[] r1 = r1.getByteArrayExtra(r2)
            if (r1 != 0) goto L_0x02da
            goto L_0x02e6
        L_0x02da:
            r11.parseFrom(r1)     // Catch:{ Exception -> 0x02de }
            goto L_0x02e7
        L_0x02de:
            r11 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r5] = r11
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r6, r0, r1)
        L_0x02e6:
            r11 = r7
        L_0x02e7:
            if (r11 != 0) goto L_0x02ee
            te3.fg1 r11 = new te3.fg1
            r11.<init>()
        L_0x02ee:
            r10.f152947E = r11
        L_0x02f0:
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r10.f152943A
            java.lang.String r1 = "KEY_POST_VIDEO_TEMPLATE"
            if (r11 == 0) goto L_0x0315
            com.tencent.mm.protocal.protobuf.FinderObject r11 = r11.getFeedObject()
            if (r11 == 0) goto L_0x0315
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r11 = r11.objectDesc
            if (r11 == 0) goto L_0x0315
            te3.ap1 r11 = r11.video_tmpl_info
            if (r11 == 0) goto L_0x0315
            java.lang.String r2 = r10.f152961b
            java.lang.String r3 = "template restore"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            android.content.Intent r2 = r10.f152960a
            byte[] r11 = r11.toByteArray()
            r2.putExtra(r1, r11)
        L_0x0315:
            te3.ap1 r11 = new te3.ap1
            r11.<init>()
            android.content.Intent r2 = r10.f152960a
            byte[] r1 = r2.getByteArrayExtra(r1)
            if (r1 != 0) goto L_0x0323
            goto L_0x032f
        L_0x0323:
            r11.parseFrom(r1)     // Catch:{ Exception -> 0x0327 }
            goto L_0x0330
        L_0x0327:
            r11 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r5] = r11
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r6, r0, r1)
        L_0x032f:
            r11 = r7
        L_0x0330:
            r10.f152953K = r11
            android.content.Intent r11 = r10.f152960a
            java.lang.String r1 = "KEY_POST_BTN_TITLE"
            java.lang.String r11 = r11.getStringExtra(r1)
            r10.f152954L = r11
            android.content.Intent r11 = r10.f152960a
            java.lang.String r1 = "KEY_SYNC_POST_LOADING"
            boolean r11 = r11.getBooleanExtra(r1, r5)
            r10.f152955M = r11
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r11 = r10.f152956N
            if (r11 != 0) goto L_0x0371
            android.content.Intent r11 = r10.f152960a
            java.lang.String r1 = "KEY_POST_JUMPINFO"
            boolean r11 = r11.hasExtra(r1)
            if (r11 == 0) goto L_0x0371
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r11 = new com.tencent.mm.protocal.protobuf.FinderJumpInfo
            r11.<init>()
            android.content.Intent r2 = r10.f152960a
            byte[] r1 = r2.getByteArrayExtra(r1)
            if (r1 != 0) goto L_0x0362
            goto L_0x036f
        L_0x0362:
            r11.parseFrom(r1)     // Catch:{ Exception -> 0x0367 }
            r7 = r11
            goto L_0x036f
        L_0x0367:
            r11 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r5] = r11
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r6, r0, r1)
        L_0x036f:
            r10.f152956N = r7
        L_0x0371:
            android.content.Intent r11 = r10.f152960a
            java.lang.String r0 = "KEY_POST_WARM_GOODS_SELECT_MEDIA"
            boolean r11 = r11.getBooleanExtra(r0, r5)
            r10.f152957O = r11
            java.lang.String r11 = r10.f152961b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "postType "
            r0.append(r1)
            java.lang.Integer r1 = r10.f152963d
            r0.append(r1)
            java.lang.String r1 = ", mediaList "
            r0.append(r1)
            java.util.ArrayList<java.lang.String> r1 = r10.f152964e
            r0.append(r1)
            java.lang.String r1 = " mediaCount "
            r0.append(r1)
            int r1 = r10.f152970k
            r0.append(r1)
            java.lang.String r1 = " thumbList "
            r0.append(r1)
            java.util.ArrayList<java.lang.String> r1 = r10.f152968i
            r0.append(r1)
            java.lang.String r1 = " thumbCount "
            r0.append(r1)
            java.util.ArrayList<java.lang.String> r1 = r10.f152968i
            if (r1 == 0) goto L_0x03b7
            int r5 = r1.size()
        L_0x03b7:
            r0.append(r5)
            java.lang.String r1 = ", fromCamera:"
            r0.append(r1)
            boolean r1 = r10.f152971l
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bt1.C54563e.<init>(android.content.Intent):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003a A[LOOP:0: B:10:0x003a->B:13:0x0044, LOOP_START] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m61322a(bt1.C54563e r0, java.util.ArrayList r1, int r2, int r3, java.lang.Object r4) {
        /*
            r3 = r3 & 2
            if (r3 == 0) goto L_0x0006
            r2 = 9
        L_0x0006:
            r0.getClass()
            if (r2 <= 0) goto L_0x0046
            int r3 = r1.size()
            if (r3 != 0) goto L_0x0012
            goto L_0x0046
        L_0x0012:
            int r3 = r1.size()
            if (r3 <= r2) goto L_0x0046
            java.lang.String r0 = r0.f152961b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "checkListSize: list size = "
            r3.append(r4)
            int r4 = r1.size()
            r3.append(r4)
            java.lang.String r4 = ", maxSize = "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
        L_0x003a:
            int r0 = r1.size()
            if (r0 <= r2) goto L_0x0046
            java.lang.Object r0 = sx3.C64175a0.m75516x(r1)
            if (r0 != 0) goto L_0x003a
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bt1.C54563e.m61322a(bt1.e, java.util.ArrayList, int, int, java.lang.Object):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0159  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final uq1.C65462u mo75454b(bt1.C54590w r30, java.lang.String r31, java.util.ArrayList<te3.C64589nq2> r32, ao1.C54270m1 r33, te3.C49277ef1 r34, java.util.LinkedList<com.tencent.p014mm.protocal.protobuf.FinderJumpInfo> r35, long r36) {
        /*
            r29 = this;
            r1 = r29
            r2 = r30
            r3 = r33
            te3.db1 r7 = new te3.db1
            r7.<init>()
            te3.jk0 r8 = new te3.jk0
            r8.<init>()
            android.os.Bundle r0 = r1.f152962c
            java.lang.String r4 = "post_location"
            byte[] r0 = r0.getByteArray(r4)
            if (r0 == 0) goto L_0x001d
            r7.parseFrom(r0)
        L_0x001d:
            android.os.Bundle r0 = r1.f152962c
            java.lang.String r4 = "post_extend_reading"
            byte[] r0 = r0.getByteArray(r4)
            if (r0 == 0) goto L_0x002a
            r8.parseFrom(r0)
        L_0x002a:
            android.os.Bundle r0 = r1.f152962c
            java.lang.String r4 = "POST_ORIGINAL_FLAG"
            r15 = 0
            int r9 = r0.getInt(r4, r15)
            android.os.Bundle r0 = r1.f152962c
            java.lang.String r4 = "post_from_camera"
            boolean r10 = r0.getBoolean(r4, r15)
            android.os.Bundle r0 = r1.f152962c
            java.lang.String r4 = "VIDEO_COVER_INFO_WRAP"
            byte[] r0 = r0.getByteArray(r4)
            r4 = 0
            if (r0 == 0) goto L_0x004f
            te3.wi0 r5 = new te3.wi0
            r5.<init>()
            r5.parseFrom(r0)
            goto L_0x0050
        L_0x004f:
            r5 = r4
        L_0x0050:
            if (r5 != 0) goto L_0x0056
            te3.wi0 r5 = r29.mo75459g()
        L_0x0056:
            r14 = r5
            android.os.Bundle r0 = r1.f152962c
            java.lang.String r5 = "post_ref_feed_info"
            byte[] r0 = r0.getByteArray(r5)
            android.os.Bundle r5 = r1.f152962c
            java.lang.String r6 = "post_ref_feed_content"
            byte[] r5 = r5.getByteArray(r6)
            java.lang.String r6 = "safeParser"
            java.lang.String r11 = ""
            r13 = 1
            if (r0 == 0) goto L_0x0082
            if (r5 == 0) goto L_0x0082
            te3.uf1 r5 = new te3.uf1
            r5.<init>()
            r5.parseFrom(r0)     // Catch:{ Exception -> 0x0079 }
            goto L_0x0082
        L_0x0079:
            r0 = move-exception
            r5 = r0
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r15] = r5
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r6, r11, r0)
        L_0x0082:
            android.os.Bundle r0 = r1.f152962c
            java.lang.String r5 = "KEY_POST_VIDEO_TEMPLATE"
            byte[] r0 = r0.getByteArray(r5)
            if (r0 == 0) goto L_0x00a0
            te3.ap1 r5 = new te3.ap1
            r5.<init>()
            r5.parseFrom(r0)     // Catch:{ Exception -> 0x0097 }
            r22 = r5
            goto L_0x00a2
        L_0x0097:
            r0 = move-exception
            r5 = r0
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r15] = r5
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r6, r11, r0)
        L_0x00a0:
            r22 = r4
        L_0x00a2:
            android.os.Bundle r0 = r1.f152962c
            java.lang.String r4 = "isNews"
            boolean r0 = r0.getBoolean(r4)
            te3.jl0 r12 = new te3.jl0
            r12.<init>()
            if (r3 == 0) goto L_0x00b5
            java.lang.String r4 = r3.f152319g
            if (r4 != 0) goto L_0x00b6
        L_0x00b5:
            r4 = r11
        L_0x00b6:
            r12.f183806d = r4
            if (r3 == 0) goto L_0x00be
            java.lang.String r4 = r3.f152320h
            if (r4 != 0) goto L_0x00bf
        L_0x00be:
            r4 = r11
        L_0x00bf:
            r12.f183811i = r4
            if (r3 == 0) goto L_0x00c6
            int r4 = r3.f152321i
            goto L_0x00c7
        L_0x00c6:
            r4 = 0
        L_0x00c7:
            r12.f183812j = r4
            if (r3 == 0) goto L_0x00cf
            java.lang.String r4 = r3.f152328s
            if (r4 != 0) goto L_0x00d0
        L_0x00cf:
            r4 = r11
        L_0x00d0:
            r12.f183813n = r4
            uq1.u r6 = new uq1.u
            int r4 = r2.f153077b
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r31)
            java.lang.String r13 = "nullAsNil(desc)"
            gy3.C87412m.m108593f(r5, r13)
            te3.pq2 r13 = r2.f153078c
            java.lang.String r15 = r2.f153079d
            r18 = r14
            boolean r14 = r1.f152973n
            r19 = r11
            if (r3 == 0) goto L_0x00f3
            java.lang.String r11 = r3.f152322j
            if (r11 != 0) goto L_0x00f0
            goto L_0x00f3
        L_0x00f0:
            r21 = r11
            goto L_0x00f5
        L_0x00f3:
            r21 = r19
        L_0x00f5:
            if (r3 == 0) goto L_0x00fe
            java.lang.String r11 = r3.f152323n
            if (r11 != 0) goto L_0x00fc
            goto L_0x00fe
        L_0x00fc:
            r19 = r11
        L_0x00fe:
            if (r3 == 0) goto L_0x011a
            java.lang.String r11 = r33.mo75060c3()
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r11 == 0) goto L_0x010c
            r3 = 0
            goto L_0x0117
        L_0x010c:
            java.lang.String r3 = r3.f152322j
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x0116
            r3 = 1
            goto L_0x0117
        L_0x0116:
            r3 = 2
        L_0x0117:
            r24 = r3
            goto L_0x011c
        L_0x011a:
            r24 = 0
        L_0x011c:
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r1.f152943A
            r20 = r3
            te3.tl0 r3 = r1.f152948F
            r23 = r3
            int r3 = r2.f153080e
            r26 = r3
            r3 = r6
            r11 = r6
            r6 = r13
            r13 = r11
            r11 = r15
            r15 = r12
            r12 = r32
            r1 = r13
            r27 = 1
            r13 = r14
            r2 = r18
            r14 = r0
            r28 = 0
            r16 = r21
            r17 = r19
            r18 = r24
            r19 = r34
            r21 = r35
            r24 = r36
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26)
            r1.f188386z = r2
            r2 = r30
            java.lang.String r0 = r2.f153081f
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0156
            r15 = 1
            goto L_0x0157
        L_0x0156:
            r15 = 0
        L_0x0157:
            if (r15 == 0) goto L_0x016c
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            te3.zk1 r3 = new te3.zk1
            r3.<init>()
            java.lang.String r4 = r2.f153081f
            r3.f146050d = r4
            r0.add(r3)
            r1.f188359A = r0
        L_0x016c:
            te3.ig1 r0 = r2.f153082g
            r1.f188360B = r0
            r0 = r1
            r1 = r29
            java.lang.String r2 = r1.f152961b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "doPost, mediaType:"
            r3.append(r4)
            int r4 = r0.f188361a
            r3.append(r4)
            java.lang.String r4 = ", isLongVideo:"
            r3.append(r4)
            boolean r4 = r0.f188370j
            r3.append(r4)
            java.lang.String r4 = ", sdkShareType:"
            r3.append(r4)
            int r4 = r0.f188375o
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bt1.C54563e.mo75454b(bt1.w, java.lang.String, java.util.ArrayList, ao1.m1, te3.ef1, java.util.LinkedList, long):uq1.u");
    }

    /* renamed from: c */
    public final FinderItem mo75455c(Activity activity, String str, C54590w wVar, boolean z, ArrayList<C64589nq2> arrayList, C49277ef1 ef12, C52271zj0 zj02, LinkedList<FinderJumpInfo> linkedList, long j) {
        C64803wi0 wi02;
        Activity activity2 = activity;
        C87412m.m108594g(activity, "context");
        C87412m.m108594g(str, "desc");
        C87412m.m108594g(wVar, "uploadData");
        LinkedList<FinderJumpInfo> linkedList2 = linkedList;
        C87412m.m108594g(linkedList2, "jumpInfoList");
        C65462u b = mo75454b(wVar, str, arrayList, (C54270m1) C39818r.f106831a.mo62443b(activity).mo75002a(C54270m1.class), ef12, linkedList2, j);
        b.f188383w = zj02;
        b.f188384x = mo75458f();
        C64494kj0 kj02 = new C64494kj0();
        byte[] d = mo75456d();
        if (d != null) {
            kj02.parseFrom(d);
        }
        b.f188385y = kj02;
        byte[] byteArray = this.f152962c.getByteArray("VIDEO_COVER_INFO_WRAP");
        if (byteArray != null) {
            wi02 = new C64803wi0();
            wi02.parseFrom(byteArray);
        } else {
            wi02 = null;
        }
        if (wi02 == null) {
            wi02 = mo75459g();
        }
        b.f188386z = wi02;
        boolean z2 = z;
        return C66171a.f190181a.mo90261i(b, z);
    }

    /* renamed from: d */
    public final byte[] mo75456d() {
        FinderObject feedObject;
        FinderObjectDesc finderObjectDesc;
        C64365fh0 fh02;
        C64494kj0 kj02;
        if (this.f152962c.containsKey("VIDEO_COVER_CROP_MODEL")) {
            return this.f152962c.getByteArray("VIDEO_COVER_CROP_MODEL");
        }
        FinderItem finderItem = this.f152943A;
        if (finderItem == null || (feedObject = finderItem.getFeedObject()) == null || (finderObjectDesc = feedObject.objectDesc) == null || (fh02 = finderObjectDesc.client_draft_ext_info) == null || (kj02 = fh02.f183136g) == null) {
            return null;
        }
        return kj02.toByteArray();
    }

    /* renamed from: e */
    public final int mo75457e() {
        LinkedList<C64689rq2> mediaList;
        C64689rq2 rq22;
        if (this.f152962c.containsKey("VIDEO_COVER_STYLE")) {
            return this.f152962c.getInt("VIDEO_COVER_STYLE", 0);
        }
        FinderItem finderItem = this.f152943A;
        if (finderItem == null || (mediaList = finderItem.getMediaList()) == null || (rq22 = (C64689rq2) C110818d0.m150916N(mediaList)) == null) {
            return 0;
        }
        return rq22.f185256T0;
    }

    /* renamed from: f */
    public final long mo75458f() {
        FinderObject feedObject;
        FinderObjectDesc finderObjectDesc;
        C64365fh0 fh02;
        if (this.f152962c.containsKey("VIDEO_COVER_TIME_MS")) {
            return this.f152962c.getLong("VIDEO_COVER_TIME_MS", 0);
        }
        FinderItem finderItem = this.f152943A;
        if (finderItem == null || (feedObject = finderItem.getFeedObject()) == null || (finderObjectDesc = feedObject.objectDesc) == null || (fh02 = finderObjectDesc.client_draft_ext_info) == null) {
            return 0;
        }
        return (long) fh02.f183135f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        r1 = (r1 = (r1 = r1.getFeedObject()).objectDesc).mediaExtra;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final te3.C64803wi0 mo75459g() {
        /*
            r3 = this;
            te3.wi0 r0 = new te3.wi0
            r0.<init>()
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r3.f152943A
            r2 = 0
            if (r1 == 0) goto L_0x001b
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            if (r1 == 0) goto L_0x001b
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r1.objectDesc
            if (r1 == 0) goto L_0x001b
            com.tencent.mm.protocal.protobuf.FinderMediaExtra r1 = r1.mediaExtra
            if (r1 == 0) goto L_0x001b
            java.util.LinkedList<java.lang.String> r1 = r1.cover_url_word
            goto L_0x001c
        L_0x001b:
            r1 = r2
        L_0x001c:
            r0.f186121d = r1
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r3.f152943A
            if (r1 == 0) goto L_0x0032
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            if (r1 == 0) goto L_0x0032
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r1.objectDesc
            if (r1 == 0) goto L_0x0032
            te3.fh0 r1 = r1.client_draft_ext_info
            if (r1 == 0) goto L_0x0032
            java.util.LinkedList<te3.vi0> r2 = r1.f183137h
        L_0x0032:
            r0.f186122e = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bt1.C54563e.mo75459g():te3.wi0");
    }

    /* renamed from: h */
    public final boolean mo75460h() {
        if (this.f152955M) {
            String str = this.f152954L;
            return !(str == null || str.length() == 0) && this.f152956N != null;
        }
    }
}
