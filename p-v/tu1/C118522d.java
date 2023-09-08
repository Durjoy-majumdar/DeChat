package tu1;

import android.content.Context;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.api.ITPPlayer;
import com.tencent.thumbplayer.api.TPPlayerFactory;
import com.tencent.thumbplayer.api.TPPlayerMgr;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import gy3.C87412m;
import k34.C117388a;
import tu1.C118520b;
import tu1.C118532k;
import zt3.C119157j;

/* renamed from: tu1.d */
public final class C118522d implements C118540o {

    /* renamed from: k */
    public static Boolean f354708k = Boolean.FALSE;

    /* renamed from: a */
    public final String f354709a = "MicroMsg.FlutterVideoPlayer";

    /* renamed from: b */
    public Context f354710b;

    /* renamed from: c */
    public ITPPlayer f354711c;

    /* renamed from: d */
    public String f354712d;

    /* renamed from: e */
    public C118541p f354713e;

    /* renamed from: f */
    public String f354714f;

    /* renamed from: g */
    public String f354715g;

    /* renamed from: h */
    public int f354716h;

    /* renamed from: i */
    public long f354717i;

    /* renamed from: j */
    public long f354718j;

    /* renamed from: tu1.d$a */
    public final class C118523a extends C117388a {

        /* renamed from: d */
        public final String f354719d;

        /* renamed from: e */
        public long f354720e;

        /* renamed from: f */
        public final /* synthetic */ C118522d f354721f;

        /* renamed from: tu1.d$a$a */
        public static final class C118524a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C118522d f354722d;

            public C118524a(C118522d dVar) {
                this.f354722d = dVar;
            }

            public final void run() {
                C118541p pVar = this.f354722d.f354713e;
                if (pVar != null) {
                    ((C118539n) pVar).mo183257a(false, 2);
                }
            }
        }

        public C118523a(C118522d dVar, String str, String str2) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(str2, "path");
            this.f354721f = dVar;
            this.f354719d = str;
        }

        public String getContentType(int i, String str) {
            return MimeTypes.VIDEO_MP4;
        }

        public String getDataFilePath(int i, String str) {
            String str2 = C118532k.f354730c.mo183248a().f354732a.mo183240a(this.f354719d).f354704e;
            C87412m.m108591d(str2);
            String str3 = this.f354721f.f354709a;
            Log.m105918d(str3, "[getDataFilePath] player: " + this.f354721f.f354711c + " mediaId=" + this.f354719d + " fileId: " + i + ", path: " + str2);
            return str2;
        }

        public long getDataTotalSize(int i, String str) {
            Long valueOf = Long.valueOf(C118532k.f354730c.mo183248a().f354732a.mo183240a(this.f354719d).f354702c);
            C87412m.m108591d(valueOf);
            return valueOf.longValue();
        }

        public int onReadData(int i, String str, long j, long j2) {
            boolean z;
            boolean isVideoDataAvailable;
            long j3 = j;
            long j4 = j2;
            String str2 = this.f354721f.f354709a;
            Log.m105918d(str2, "[onReadData] player: " + this.f354721f.f354711c + " mediaId=" + this.f354719d + " fileId: " + i + " state:" + this.f354721f.f354716h);
            if (j4 <= 0) {
                Log.m105918d(this.f354721f.f354709a, "FVPlayer onReadDate 0");
                return 0;
            }
            C118532k.C118533a aVar = C118532k.f354730c;
            C118520b.C118521a a = aVar.mo183248a().f354732a.mo183240a(this.f354719d);
            long j5 = this.f354720e;
            long j6 = a.f354700a;
            if (j5 != j6) {
                this.f354720e = j6;
                ((C119157j) C119157j.f356862d).mo183895z(new C118524a(this.f354721f));
            }
            if (a.f354703d) {
                Log.m105918d(this.f354721f.f354709a, "onreaddata completed");
                return (int) j4;
            }
            if (this.f354721f.f354716h != 6) {
                boolean taskExist = CdnLogic.taskExist(this.f354719d);
                if (!taskExist || !(isVideoDataAvailable = CdnLogic.isVideoDataAvailable(this.f354719d, j3, j4))) {
                    z = taskExist;
                } else {
                    String str3 = this.f354721f.f354709a;
                    Log.m105918d(str3, "FVPlayer onReadData isVideoDataAvailable " + isVideoDataAvailable + " offset:" + j3 + " length:" + j4 + " mediaId" + this.f354719d);
                    return (int) j4;
                }
            } else {
                z = false;
            }
            C118522d dVar = this.f354721f;
            int i2 = dVar.f354716h;
            if (i2 == 3 || i2 == 5) {
                String str4 = ", cache:";
                String str5 = ", length:";
                if (i2 == 3) {
                    Long valueOf = Long.valueOf(a.f354701b);
                    C87412m.m108591d(valueOf);
                    long j7 = j3 + j4;
                    if (valueOf.longValue() >= j7) {
                        String str6 = this.f354721f.f354709a;
                        Log.m105926v(str6, "onreaddata preload enough: " + this.f354719d);
                        return (int) j4;
                    }
                    if (z && a.f354706g) {
                        C118522d dVar2 = this.f354721f;
                        boolean z2 = z;
                        if (dVar2.f354717i == j3 && dVar2.f354718j == j4) {
                            String str7 = dVar2.f354709a;
                            Log.m105918d(str7, "range(" + j3 + ", " + j4 + ") is already requesting");
                            return 0;
                        }
                        boolean z3 = z2;
                        C118520b.C118521a aVar2 = a;
                        int c = aVar.mo183248a().f354733b.mo141426c(this.f354719d, j, j2, 0);
                        if (c != 0) {
                            String str8 = this.f354721f.f354709a;
                            Log.m105920e(str8, "[key] request video data error " + this.f354719d + ", ret:" + c + " state:" + this.f354721f.f354716h + " exists:" + z3 + ", offset:" + j3 + str5 + j2 + str4 + Long.valueOf(aVar2.f354700a));
                            aVar.mo183248a().f354732a.mo183242d(false, this.f354721f.f354712d, this.f354719d, Long.valueOf(j7));
                            this.f354721f.f354718j = 0;
                        } else {
                            C118522d dVar3 = this.f354721f;
                            dVar3.f354717i = j3;
                            dVar3.f354718j = j2;
                        }
                    } else if (!a.f354705f) {
                        aVar.mo183248a().f354732a.mo183242d(false, this.f354721f.f354712d, this.f354719d, Long.valueOf(j7));
                    }
                    String str9 = this.f354721f.f354709a;
                    Log.m105918d(str9, "onreaddata need more: " + this.f354719d);
                    return 0;
                }
                boolean z4 = z;
                long j8 = j4;
                String str10 = str5;
                C118520b.C118521a aVar3 = a;
                String str11 = str4;
                if (i2 != 5) {
                    return 0;
                }
                String str12 = str10;
                C118520b.C118521a aVar4 = aVar3;
                if (dVar.f354717i == j3 && dVar.f354718j == j8) {
                    String str13 = dVar.f354709a;
                    Log.m105918d(str13, "range(" + j3 + ", " + j8 + ") is already requesting");
                    return 0;
                }
                long j9 = j8;
                String str14 = str11;
                int c2 = aVar.mo183248a().f354733b.mo141426c(this.f354719d, j, j2, 0);
                if (c2 != 0) {
                    String str15 = this.f354721f.f354709a;
                    Log.m105918d(str15, "onreaddata request more data ret:" + c2 + " state:" + this.f354721f.f354716h + ' ' + this.f354719d + ", ret:" + c2 + ", exists:" + z4 + ", offset:" + j3 + str12 + j9 + str14 + Long.valueOf(aVar4.f354700a));
                    aVar.mo183248a().f354732a.mo183242d(false, this.f354721f.f354712d, this.f354719d, Long.valueOf(j3 + j9));
                    this.f354721f.f354718j = 0;
                    return 0;
                }
                C118522d dVar4 = this.f354721f;
                dVar4.f354717i = j3;
                dVar4.f354718j = j9;
                return 0;
            }
            String str16 = dVar.f354709a;
            Log.m105926v(str16, "not in need data state, ignore, state:" + this.f354721f.f354716h + ", media:" + this.f354719d);
            return 0;
        }

        public int onStartReadData(int i, String str, long j, long j2) {
            String str2 = this.f354721f.f354709a;
            Log.m105918d(str2, "[onStartReadData] player: " + this.f354721f.f354711c + " mediaId=" + this.f354719d + " fileId: " + i);
            return this.f354719d.hashCode();
        }

        public int onStopReadData(int i, String str, int i2) {
            String str2 = this.f354721f.f354709a;
            Log.m105918d(str2, "[onStopReadData] player: " + this.f354721f.f354711c + " mediaId=" + this.f354719d + " taskId: " + i);
            return 0;
        }
    }

    public C118522d(Context context, String str) {
        C87412m.m108594g(context, "_context");
        C87412m.m108594g(str, "_path");
        this.f354710b = context;
        this.f354714f = str;
        Boolean bool = f354708k;
        C87412m.m108591d(bool);
        if (!bool.booleanValue()) {
            f354708k = Boolean.TRUE;
            TPPlayerMgr.initSdk(this.f354710b, "60303", 1);
            TPPlayerMgr.setProxyEnable(true);
            TPPlayerMgr.setProxyServiceType(100);
        }
        ITPPlayer createTPPlayer = TPPlayerFactory.createTPPlayer(this.f354710b);
        this.f354711c = createTPPlayer;
        if (createTPPlayer != null) {
            createTPPlayer.setOnPreparedListener(new C118525e(this));
        }
        ITPPlayer iTPPlayer = this.f354711c;
        if (iTPPlayer != null) {
            iTPPlayer.setOnErrorListener(new C118527f(this));
        }
        ITPPlayer iTPPlayer2 = this.f354711c;
        if (iTPPlayer2 != null) {
            iTPPlayer2.setOnCompletionListener(new C118528g(this));
        }
        ITPPlayer iTPPlayer3 = this.f354711c;
        if (iTPPlayer3 != null) {
            iTPPlayer3.setOnSeekCompleteListener(new C118529h(this));
        }
        ITPPlayer iTPPlayer4 = this.f354711c;
        if (iTPPlayer4 != null) {
            iTPPlayer4.setOnPlayerStateChangeListener(new C118530i(this));
        }
        ITPPlayer iTPPlayer5 = this.f354711c;
        if (iTPPlayer5 != null) {
            iTPPlayer5.setOnInfoListener(new C118531j(this));
        }
    }

    /* renamed from: a */
    public void mo183245a() {
        String str = this.f354709a;
        Log.m105918d(str, "video_status play " + this.f354711c + ", mediaId:" + this.f354715g + ", download: " + 0 + " state:" + this.f354716h + " : " + this.f354712d);
        if (this.f354716h == 5) {
            String str2 = this.f354709a;
            Log.m105918d(str2, "video_status already playing " + this.f354711c);
            return;
        }
        ITPPlayer iTPPlayer = this.f354711c;
        if (iTPPlayer != null) {
            iTPPlayer.resumeDownload();
        }
        ITPPlayer iTPPlayer2 = this.f354711c;
        if (iTPPlayer2 != null) {
            iTPPlayer2.start();
        }
    }
}
