package hd0;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEvent;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.vfs.C116314o;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.vfs.VFSStrategy;
import f40.C86709a0;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import junit.framework.Assert;
import p206nj.C76861g;
import p682rz.C101489t;
import p823sg.C101614i;
import zh3.C91753f;

/* renamed from: hd0.o0 */
public class C98410o0 implements C101489t {

    /* renamed from: c */
    public static final C101614i<String, ArrayList<C98408n0>> f288586c = new C101614i<>(10);

    /* renamed from: a */
    public C91753f f288587a;

    /* renamed from: b */
    public MStorageEvent<C101489t.C77595a, C101489t.C77595a.C77596a> f288588b;

    public C98410o0(C91753f fVar) {
        o0$$b o0__b = new o0$$b(this);
        this.f288588b = o0__b;
        o0__b.add(new o0$$a(), Looper.getMainLooper());
        this.f288587a = fVar;
    }

    /* renamed from: a */
    public static String[] m127728a(String str) {
        return new String[]{"CREATE TABLE IF NOT EXISTS " + str + " ( " + FFmpegMetadataRetriever.METADATA_KEY_FILENAME + " text  PRIMARY KEY , " + "clientid" + " text  , " + "msgsvrid" + " int  , " + "netoffset" + " int  , " + "filenowsize" + " int  , " + "totallen" + " int  , " + "thumbnetoffset" + " int  , " + "thumblen" + " int  , " + "status" + " int  , " + "createtime" + " long  , " + "lastmodifytime" + " long  , " + "downloadtime" + " long  , " + "videolength" + " int  , " + "msglocalid" + " int  , " + "nettimes" + " int  , " + "cameratype" + " int  , " + "user" + " text  , " + "human" + " text  , " + "reserved1" + " int  , " + "reserved2" + " int  , " + "reserved3" + " text  , " + "reserved4" + " text  , " + "videofuncflag" + " int ," + "masssendid" + " long ," + "masssendlist" + " text," + "videomd5" + " text, " + "streamvideo" + " byte[], " + "statextstr" + " text, " + "downloadscene" + " int, " + "mmsightextinfo" + " byte[], " + "preloadsize" + " int, " + "videoformat" + " int, " + "forward_msg_local_id" + " int," + "msg_uuid" + " text)", "CREATE INDEX IF NOT EXISTS " + str + "video_status_index ON " + str + " ( " + "status" + "," + "downloadtime" + " )", "CREATE INDEX IF NOT EXISTS " + str + "massSendIdIndex ON " + str + " ( " + "masssendid" + " )", "CREATE INDEX IF NOT EXISTS " + str + "LastModifyTimeIndex ON " + str + " ( " + "lastmodifytime" + " )", "CREATE TABLE IF NOT EXISTS " + str + "VideoHash  (size int , CreateTime long, hash text ,  cdnxml text, orgpath text);", "CREATE INDEX IF NOT EXISTS " + str + "VideoHashSizeIndex ON VideoHash ( size  )", "CREATE INDEX IF NOT EXISTS " + str + "VideoHashTimeIndex ON VideoHash ( CreateTime  )", "alter table " + str + " add " + "share_app_info" + " text ;", "alter table " + str + " add " + "origin_file_name" + " text ;", "alter table " + str + " add " + "had_clicked_video" + " int ;", "alter table " + str + " add " + "media_id" + " text ;", "alter table " + str + " add " + "media_flag" + " text ;", "alter table " + str + " add " + "video_path" + " text ;", "CREATE INDEX IF NOT EXISTS  " + str + "_MediaIdIndex ON " + str + " ( " + "media_id" + "  )"};
    }

    /* renamed from: k */
    public static String m127729k(String str) {
        return "select " + str + "." + FFmpegMetadataRetriever.METADATA_KEY_FILENAME + "," + str + "." + "clientid" + "," + str + "." + "msgsvrid" + "," + str + "." + "netoffset" + "," + str + "." + "filenowsize" + "," + str + "." + "totallen" + "," + str + "." + "thumbnetoffset" + "," + str + "." + "thumblen" + "," + str + "." + "status" + "," + str + "." + "createtime" + "," + str + "." + "lastmodifytime" + "," + str + "." + "downloadtime" + "," + str + "." + "videolength" + "," + str + "." + "msglocalid" + "," + str + "." + "nettimes" + "," + str + "." + "cameratype" + "," + str + "." + "user" + "," + str + "." + "human" + "," + str + "." + "reserved1" + "," + str + "." + "reserved2" + "," + str + "." + "reserved3" + "," + str + "." + "reserved4" + "," + str + "." + "videofuncflag" + "," + str + "." + "masssendid" + "," + str + "." + "masssendlist" + "," + str + "." + "videomd5" + "," + str + "." + "streamvideo" + "," + str + "." + "statextstr" + "," + str + "." + "downloadscene" + "," + str + "." + "mmsightextinfo" + "," + str + "." + "preloadsize" + "," + str + "." + "videoformat" + "," + str + "." + "forward_msg_local_id" + "," + str + "." + "msg_uuid" + "," + str + "." + "share_app_info" + "," + str + "." + "origin_file_name" + "," + str + "." + "had_clicked_video" + "," + str + "." + "media_id" + "," + str + "." + "media_flag" + "," + str + "." + "video_path" + " from " + str + "  ";
    }

    /* renamed from: l */
    public static String m127730l(String str) {
        return "select " + str + "." + FFmpegMetadataRetriever.METADATA_KEY_FILENAME + "," + "downloadtime" + " from " + str + "  ";
    }

    /* renamed from: m */
    public static int m127731m(String str) {
        int r;
        if (Util.isNullOrNil(str)) {
            return -1;
        }
        C86009m1 m1Var = new C86009m1(str);
        if (m1Var.mo119967g() && (r = (int) m1Var.mo119980r()) > 0) {
            return r;
        }
        return 0;
    }

    /* renamed from: t */
    public static o0$$c m127732t(String str, int i, int i2) {
        String str2 = str;
        int i3 = i;
        int i4 = i2;
        o0$$c o0__c = new o0$$c();
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.VideoInfoStorage", "ERR:" + C76861g.m92660c() + " invalid fileName");
            o0__c.f223071d = 0 - C76861g.m92658a();
            return o0__c;
        } else if (i3 < 0) {
            Log.m105920e("MicroMsg.VideoInfoStorage", "ERR:" + C76861g.m92660c() + "[" + str2 + "]  invalid readOffset:" + i3);
            o0__c.f223071d = 0 - C76861g.m92658a();
            return o0__c;
        } else if (i4 <= 0) {
            Log.m105920e("MicroMsg.VideoInfoStorage", "ERR:" + C76861g.m92660c() + "[" + str2 + "]  invalid readLen");
            o0__c.f223071d = 0 - C76861g.m92658a();
            return o0__c;
        } else {
            C76861g.C47263a aVar = new C76861g.C47263a();
            RandomAccessFile randomAccessFile = null;
            o0__c.f223068a = new byte[i4];
            try {
                RandomAccessFile B = C86013q1.m106420B(str2, false);
                long a = aVar.mo72288a();
                B.seek((long) i3);
                long a2 = aVar.mo72288a();
                int read = B.read(o0__c.f223068a, 0, i4);
                long j = a2;
                long a3 = aVar.mo72288a();
                long a4 = aVar.mo72288a();
                if (read < 0) {
                    read = 0;
                }
                o0__c.f223069b = read;
                o0__c.f223070c = read + i3;
                try {
                    B.close();
                } catch (Exception unused) {
                }
                Log.m105918d("MicroMsg.VideoInfoStorage", "FIN:" + C76861g.m92660c() + "[" + str2 + "]  Offset:" + i3 + " readlen:" + i4);
                Log.m105918d("MicroMsg.VideoInfoStorage", "FIN:" + C76861g.m92660c() + "[" + str2 + "] open:" + a + " seek:" + j + " write:" + a3 + " close:" + a4);
                return o0__c;
            } catch (Exception e) {
                Log.m105920e("MicroMsg.VideoInfoStorage", "ERR:" + C76861g.m92660c() + "[" + str2 + "] \t\tOffset:" + o0__c.f223070c + " failed:[" + e.getMessage() + "]");
                o0__c.f223071d = 0 - C76861g.m92658a();
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (Exception unused2) {
                    }
                }
                return o0__c;
            } catch (Throwable th) {
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (Exception unused3) {
                    }
                }
                throw th;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x016c A[SYNTHETIC, Splitter:B:31:0x016c] */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m127733x(java.lang.String r17, int r18, byte[] r19) {
        /*
            r1 = r17
            r2 = r18
            r0 = r19
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r17)
            java.lang.String r4 = "ERR:"
            r5 = 0
            java.lang.String r6 = "MicroMsg.VideoInfoStorage"
            if (r3 == 0) goto L_0x0032
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r1 = p206nj.C76861g.m92660c()
            r0.append(r1)
            java.lang.String r1 = " invalid fileName"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            int r0 = p206nj.C76861g.m92658a()
        L_0x0030:
            int r5 = r5 - r0
            return r5
        L_0x0032:
            java.lang.String r3 = "["
            if (r2 >= 0) goto L_0x005f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = p206nj.C76861g.m92660c()
            r0.append(r4)
            r0.append(r3)
            r0.append(r1)
            java.lang.String r1 = "]  invalid startOffset:"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            int r0 = p206nj.C76861g.m92658a()
            goto L_0x0030
        L_0x005f:
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r19)
            if (r7 == 0) goto L_0x008b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r2 = p206nj.C76861g.m92660c()
            r0.append(r2)
            r0.append(r3)
            r0.append(r1)
            java.lang.String r1 = "]  invalid writeBuf"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            int r0 = p206nj.C76861g.m92658a()
            goto L_0x0030
        L_0x008b:
            nj.g$a r7 = new nj.g$a
            r7.<init>()
            r8 = 0
            r9 = 1
            java.io.RandomAccessFile r8 = com.tencent.p014mm.vfs.C86013q1.m106420B(r1, r9)     // Catch:{ Exception -> 0x012c }
            long r9 = r7.mo72288a()     // Catch:{ Exception -> 0x012c }
            long r11 = (long) r2     // Catch:{ Exception -> 0x012c }
            r8.seek(r11)     // Catch:{ Exception -> 0x012c }
            long r11 = r7.mo72288a()     // Catch:{ Exception -> 0x012c }
            int r13 = r0.length     // Catch:{ Exception -> 0x012c }
            r8.write(r0, r5, r13)     // Catch:{ Exception -> 0x012c }
            long r13 = r7.mo72288a()     // Catch:{ Exception -> 0x012c }
            r15 = r6
            long r5 = r8.getFilePointer()     // Catch:{ Exception -> 0x0127 }
            int r6 = (int) r5     // Catch:{ Exception -> 0x0127 }
            long r4 = r7.mo72288a()     // Catch:{ Exception -> 0x0127 }
            r8.close()     // Catch:{ Exception -> 0x00b7 }
        L_0x00b7:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "FIN:"
            r7.append(r8)
            r16 = r15
            java.lang.String r15 = p206nj.C76861g.m92660c()
            r7.append(r15)
            r7.append(r3)
            r7.append(r1)
            java.lang.String r15 = "]  Offset:"
            r7.append(r15)
            r7.append(r2)
            java.lang.String r2 = " buf:"
            r7.append(r2)
            int r0 = r0.length
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            r7 = r16
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r2 = p206nj.C76861g.m92660c()
            r0.append(r2)
            r0.append(r3)
            r0.append(r1)
            java.lang.String r1 = "] open:"
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = " seek:"
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = " write:"
            r0.append(r1)
            r0.append(r13)
            java.lang.String r1 = " close:"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r0)
            return r6
        L_0x0127:
            r0 = move-exception
            r7 = r15
            goto L_0x012e
        L_0x012a:
            r0 = move-exception
            goto L_0x0170
        L_0x012c:
            r0 = move-exception
            r7 = r6
        L_0x012e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x012a }
            r5.<init>()     // Catch:{ all -> 0x012a }
            r5.append(r4)     // Catch:{ all -> 0x012a }
            java.lang.String r4 = p206nj.C76861g.m92660c()     // Catch:{ all -> 0x012a }
            r5.append(r4)     // Catch:{ all -> 0x012a }
            r5.append(r3)     // Catch:{ all -> 0x012a }
            r5.append(r1)     // Catch:{ all -> 0x012a }
            java.lang.String r1 = "] \t\tOffset:"
            r5.append(r1)     // Catch:{ all -> 0x012a }
            r5.append(r2)     // Catch:{ all -> 0x012a }
            java.lang.String r1 = " failed:["
            r5.append(r1)     // Catch:{ all -> 0x012a }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x012a }
            r5.append(r0)     // Catch:{ all -> 0x012a }
            java.lang.String r0 = "]"
            r5.append(r0)     // Catch:{ all -> 0x012a }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x012a }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)     // Catch:{ all -> 0x012a }
            int r0 = p206nj.C76861g.m92658a()     // Catch:{ all -> 0x012a }
            r1 = 0
            int r5 = 0 - r0
            if (r8 == 0) goto L_0x016f
            r8.close()     // Catch:{ Exception -> 0x016f }
        L_0x016f:
            return r5
        L_0x0170:
            if (r8 == 0) goto L_0x0175
            r8.close()     // Catch:{ Exception -> 0x0175 }
        L_0x0175:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hd0.C98410o0.m127733x(java.lang.String, int, byte[]):int");
    }

    /* renamed from: b */
    public void mo137716b(C101489t.C77595a aVar, Looper looper) {
        this.f288588b.add(aVar, looper);
    }

    /* renamed from: c */
    public boolean mo137717c(long j) {
        C91753f fVar = this.f288587a;
        if (fVar.delete("videoinfo2", "masssendid= ?", new String[]{"" + j}) <= 0) {
            return false;
        }
        this.f288588b.event(new C101489t.C77595a.C77596a("DELETE_" + j, C101489t.C77595a.C77598b.DELETE, C101489t.C77595a.C77597c.NORMAL, 3, j));
        this.f288588b.doNotify();
        return true;
    }

    /* renamed from: d */
    public boolean mo137718d(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.m105920e("MicroMsg.VideoInfoStorage", "deleteSnsAdByMediaId >> media is no valid");
            return false;
        }
        C101614i<String, ArrayList<C98408n0>> iVar = f288586c;
        if (iVar.get(str) != null) {
            iVar.remove(str);
        }
        int delete = this.f288587a.delete("videoinfo2", "media_id= ?", new String[]{str});
        Log.m105925i("MicroMsg.VideoInfoStorage", "deleteSnsAdByMediaId >> %s, %d", str, Integer.valueOf(delete));
        return delete > 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0091 A[SYNTHETIC, Splitter:B:31:0x0091] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009a A[SYNTHETIC, Splitter:B:37:0x009a] */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int[] mo137719e(java.lang.String r18) {
        /*
            r17 = this;
            r1 = r18
            r0 = 33
            int[] r0 = new int[r0]
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            long r4 = com.tencent.p014mm.vfs.C86013q1.m106451l(r18)
            int r5 = (int) r4
            r4 = 102400(0x19000, float:1.43493E-40)
            java.lang.String r7 = "MicroMsg.VideoInfoStorage"
            r8 = 2
            r9 = 1
            r10 = 0
            if (r5 < r4) goto L_0x009e
            r11 = 104857600(0x6400000, float:3.6111186E-35)
            if (r5 < r11) goto L_0x001f
            goto L_0x009e
        L_0x001f:
            r4 = 32
            r0[r4] = r5
            int r11 = r5 + -20480
            int r11 = r11 / r4
            r12 = 512(0x200, float:7.175E-43)
            byte[] r13 = new byte[r12]
            java.io.RandomAccessFile r14 = com.tencent.p014mm.vfs.C86013q1.m106420B(r1, r10)     // Catch:{ Exception -> 0x007d, all -> 0x007a }
            r15 = 0
        L_0x002f:
            if (r15 >= r4) goto L_0x004f
            int r4 = r15 * r11
            int r4 = r4 + 10240
            r16 = r7
            long r6 = (long) r4
            r14.seek(r6)     // Catch:{ Exception -> 0x0076 }
            r14.readFully(r13)     // Catch:{ Exception -> 0x0076 }
            int r4 = p823sg.C101615j.m133461a(r13, r10, r10, r12)     // Catch:{ Exception -> 0x0076 }
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            int r4 = r4 % r6
            r4 = r4 | r6
            r0[r15] = r4     // Catch:{ Exception -> 0x0076 }
            int r15 = r15 + 1
            r7 = r16
            r4 = 32
            goto L_0x002f
        L_0x004f:
            r16 = r7
            r14.close()     // Catch:{ Exception -> 0x0076 }
            java.lang.String r4 = "genVideoHash finish time:%d size:%d path:%s"
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0076 }
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r2)     // Catch:{ Exception -> 0x0076 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x0076 }
            r6[r10] = r2     // Catch:{ Exception -> 0x0076 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0076 }
            r6[r9] = r2     // Catch:{ Exception -> 0x0076 }
            r6[r8] = r1     // Catch:{ Exception -> 0x0076 }
            r2 = r16
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r6)     // Catch:{ Exception -> 0x0074 }
            r14.close()     // Catch:{ Exception -> 0x0073 }
        L_0x0073:
            return r0
        L_0x0074:
            r0 = move-exception
            goto L_0x0080
        L_0x0076:
            r0 = move-exception
            r2 = r16
            goto L_0x0080
        L_0x007a:
            r0 = move-exception
            r6 = 0
            goto L_0x0098
        L_0x007d:
            r0 = move-exception
            r2 = r7
            r14 = 0
        L_0x0080:
            java.lang.String r3 = "genVideoHash path:%s e:%s"
            java.lang.Object[] r4 = new java.lang.Object[r8]     // Catch:{ all -> 0x0096 }
            r4[r10] = r1     // Catch:{ all -> 0x0096 }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)     // Catch:{ all -> 0x0096 }
            r4[r9] = r0     // Catch:{ all -> 0x0096 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r3, r4)     // Catch:{ all -> 0x0096 }
            if (r14 == 0) goto L_0x0094
            r14.close()     // Catch:{ Exception -> 0x0094 }
        L_0x0094:
            r1 = 0
            return r1
        L_0x0096:
            r0 = move-exception
            r6 = r14
        L_0x0098:
            if (r6 == 0) goto L_0x009d
            r6.close()     // Catch:{ Exception -> 0x009d }
        L_0x009d:
            throw r0
        L_0x009e:
            r2 = r7
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r0[r10] = r3
            r0[r9] = r1
            java.lang.String r1 = "genVideoHash file size :%d , give up. :%s "
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r1, r0)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 12696(0x3198, float:1.7791E-41)
            java.lang.Object[] r2 = new java.lang.Object[r8]
            if (r5 >= r4) goto L_0x00b9
            r3 = 10
            goto L_0x00bb
        L_0x00b9:
            r3 = 20
        L_0x00bb:
            int r3 = r3 + 101
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r10] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r2[r9] = r3
            r0.mo160131h(r1, r2)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: hd0.C98410o0.mo137719e(java.lang.String):int[]");
    }

    /* renamed from: f */
    public C98408n0 mo137720f(String str) {
        C98408n0 n0Var;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(m127729k(o0$$e.m127753a(str)));
            sb.append(" where ");
            sb.append(o0$$e.m127753a(str));
            sb.append(".");
            sb.append(FFmpegMetadataRetriever.METADATA_KEY_FILENAME);
            sb.append(" = '");
            sb.append(Util.escapeSqlValue("" + str));
            sb.append("'");
            Cursor rawQuery = this.f288587a.rawQuery(sb.toString(), (String[]) null, 2);
            if (rawQuery == null) {
                return null;
            }
            if (rawQuery.moveToFirst()) {
                n0Var = new C98408n0();
                n0Var.mo137698a(rawQuery);
            } else {
                n0Var = null;
            }
            rawQuery.close();
            return n0Var;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.VideoInfoStorage", e, "getByFileName error[%s]", e.toString());
            return null;
        }
    }

    /* renamed from: g */
    public String[] mo137721g(String str, int i) {
        String str2;
        StringBuffer stringBuffer;
        String str3 = str;
        Log.m105925i("MicroMsg.VideoInfoStorage", "checkVideoHash in fullCheckRatio:%s path:%s stack:%s", Integer.valueOf(i), str3, Util.getStack());
        long nowMilliSecond = Util.nowMilliSecond();
        String str4 = "";
        if (Util.isNullOrNil(str)) {
            Log.m105921e("MicroMsg.VideoInfoStorage", "checkVideoHash failed , path:%s ", str3);
        } else {
            int[] e = mo137719e(str);
            if (e == null || e.length < 33) {
                str2 = str4;
                Log.m105921e("MicroMsg.VideoInfoStorage", "checkVideoHash  readHash failed :%s", str3);
            } else {
                C91753f fVar = this.f288587a;
                fVar.execSQL("VideoHash", "delete from VideoHash where CreateTime < " + (Util.nowSecond() - 432000));
                int i2 = e[32];
                StringBuffer stringBuffer2 = new StringBuffer();
                int i3 = 0;
                for (int i4 = 32; i3 < i4; i4 = 32) {
                    stringBuffer2.append(Integer.toHexString(e[i3]));
                    i3++;
                }
                int length = stringBuffer2.length();
                Vector vector = new Vector();
                Vector vector2 = new Vector();
                Vector vector3 = new Vector();
                Vector vector4 = new Vector();
                C91753f fVar2 = this.f288587a;
                str2 = str4;
                StringBuilder sb = new StringBuilder();
                String str5 = "VideoHash";
                sb.append("select size, CreateTime, hash, cdnxml, orgpath from VideoHash where size = ");
                sb.append(i2);
                Cursor rawQuery = fVar2.rawQuery(sb.toString(), (String[]) null);
                int i5 = -1;
                while (rawQuery.moveToNext()) {
                    long j = rawQuery.getLong(1);
                    String string = rawQuery.getString(2);
                    int[] iArr = e;
                    String string2 = rawQuery.getString(3);
                    String string3 = rawQuery.getString(4);
                    long j2 = nowMilliSecond;
                    Log.m105927v("MicroMsg.VideoInfoStorage", "checkVideoHash select [%s][%s]", string, string2);
                    if (Util.isNullOrNil(string) || Util.isNullOrNil(string2)) {
                        stringBuffer = stringBuffer2;
                        C115669n.INSTANCE.mo160131h(12696, 104, Integer.valueOf(i2));
                        Log.m105929w("MicroMsg.VideoInfoStorage", "checkVideoHash select error [%s][%s]", string, string2);
                    } else if (length != string.length()) {
                        C115669n.INSTANCE.mo160131h(12696, 105, Integer.valueOf(i2));
                        Log.m105929w("MicroMsg.VideoInfoStorage", "checkVideoHash err length file:%d cursor:%d", Integer.valueOf(length), Integer.valueOf(string.length()));
                        stringBuffer = stringBuffer2;
                    } else {
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < length) {
                            StringBuffer stringBuffer3 = stringBuffer2;
                            if (stringBuffer2.charAt(i6) == string.charAt(i6)) {
                                i7++;
                            }
                            i6++;
                            stringBuffer2 = stringBuffer3;
                        }
                        stringBuffer = stringBuffer2;
                        if (i5 < 0 || vector3.size() <= i5 || ((Integer) vector3.get(i5)).intValue() < i7) {
                            i5 = vector3.size();
                        }
                        vector3.add(Integer.valueOf(i7));
                        vector.add(string2);
                        vector2.add(string3);
                        vector4.add(Long.valueOf(j));
                        Log.m105919d("MicroMsg.VideoInfoStorage", "checkVideoHash cursor hitCount:%d/%d ,max:%d vector:%d/%d", Integer.valueOf(i7), Integer.valueOf(length), vector3.get(i5), Integer.valueOf(i5), Integer.valueOf(vector3.size()));
                    }
                    String str6 = str;
                    e = iArr;
                    nowMilliSecond = j2;
                    stringBuffer2 = stringBuffer;
                }
                int[] iArr2 = e;
                long j3 = nowMilliSecond;
                rawQuery.close();
                if (i5 < 0 || vector3.size() <= 0) {
                    C115669n.INSTANCE.mo160131h(12696, 201, Integer.valueOf(i2));
                    Log.m105929w("MicroMsg.VideoInfoStorage", "checkVideoHash cursor empty maxHitIndex:%d vector:%d", Integer.valueOf(i5), Integer.valueOf(vector3.size()));
                } else {
                    int intValue = ((Integer) vector3.get(i5)).intValue();
                    int i8 = (intValue * 100) / 256;
                    if (i8 < 77) {
                        C115669n.INSTANCE.mo160131h(12696, 202, Integer.valueOf(i2), Integer.valueOf(intValue), null, Integer.valueOf(vector4.size()));
                        Log.m105929w("MicroMsg.VideoInfoStorage", "checkVideoHash NotEnoughHit. time:%d hit:%d percentMatch:%s arr:%d path:%s", Long.valueOf(Util.milliSecondsToNow(j3)), Integer.valueOf(intValue), Integer.valueOf(i8), Integer.valueOf(iArr2.length - 1), str);
                    } else {
                        String str7 = str;
                        String nullAsNil = Util.nullAsNil((String) vector.get(i5));
                        int i9 = 0;
                        for (int i15 = 0; i15 < vector3.size(); i15++) {
                            if (!(i15 == i5 || ((Integer) vector3.get(i15)).intValue() < intValue || nullAsNil.hashCode() == ((String) vector.get(i15)).hashCode())) {
                                i9++;
                            }
                        }
                        if (i9 > 0) {
                            C91753f fVar3 = this.f288587a;
                            fVar3.execSQL(str5, "delete from VideoHash where size = " + i2);
                            C115669n.INSTANCE.mo160131h(12696, 203, Integer.valueOf(i2), Integer.valueOf(intValue), null, Integer.valueOf(vector4.size()), null, str2, str2, str2, Integer.valueOf(i9));
                            Log.m105921e("MicroMsg.VideoInfoStorage", "checkVideoHash Not ONE hash hit this path, give up duplicate:%s path:%s", Integer.valueOf(i9), str7);
                        } else {
                            long milliSecondsToNow = Util.milliSecondsToNow(j3);
                            long nullAs = Util.nullAs((Long) vector4.get(i5), 0);
                            String format = String.format("%s,%s,%s,%s,%s", new Object[]{Integer.valueOf(i2), Integer.valueOf(intValue), Long.valueOf(nullAs), Integer.valueOf(vector4.size()), Long.valueOf(milliSecondsToNow)});
                            C115669n nVar = C115669n.INSTANCE;
                            nVar.mo160131h(12696, 300, format);
                            nVar.mo160131h(12696, Integer.valueOf(i8 + 3000), format);
                            Log.m105925i("MicroMsg.VideoInfoStorage", "checkVideoHash Succ time:%s hit:%s match:%s%% savetime:%s path:%s xml:%s orgpath:%s", Long.valueOf(milliSecondsToNow), Integer.valueOf(intValue), Integer.valueOf(i8), Long.valueOf(nullAs), str7, nullAsNil, vector2.get(i5));
                            String str8 = (String) vector2.get(i5);
                            long nowMilliSecond2 = Util.nowMilliSecond() % 1000;
                            boolean z = nowMilliSecond2 < ((long) (i * 10)) || i8 < 90;
                            Log.m105925i("MicroMsg.VideoInfoStorage", "checkVideoHashByteDiff should:%s now:%s ratio:%s percentMatch:%s debuger:%s", Boolean.valueOf(z), Long.valueOf(nowMilliSecond2), Integer.valueOf(i), Integer.valueOf(i8), Boolean.valueOf(CrashReportFactory.hasDebuger()));
                            if (z || CrashReportFactory.hasDebuger()) {
                                ThreadPool.post((Runnable) new C8508p0(this, str7, str8, format), "checkVideoHashByteDiff", 1);
                            }
                            str4 = nullAsNil;
                        }
                    }
                }
            }
            str4 = str2;
        }
        if (Util.isNullOrNil(str4)) {
            return null;
        }
        return str4.split("##");
    }

    /* renamed from: h */
    public List<C98408n0> mo137722h(long j) {
        Cursor rawQuery = this.f288587a.rawQuery(m127729k("videoinfo2") + " where " + "videoinfo2" + "." + "masssendid" + " = " + j, (String[]) null, 2);
        if (rawQuery == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (rawQuery.moveToNext()) {
            C98408n0 n0Var = new C98408n0();
            n0Var.mo137698a(rawQuery);
            arrayList.add(n0Var);
        }
        rawQuery.close();
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [java.lang.String[], android.database.Cursor] */
    /* renamed from: i */
    public List<String> mo137723i(int i) {
        String str;
        LinkedList linkedList = new LinkedList();
        Iterator<o0$$d> it = o0$$e.f288592a.iterator();
        while (it.hasNext()) {
            String str2 = it.next().f288589a;
            if (i <= 0) {
                str = " ) ";
            } else {
                str = " LIMIT " + i + " )";
            }
            String str3 = (((" SELECT * FROM ( " + m127730l(str2) + " WHERE " + "status" + "=" + 122 + str) + " UNION SELECT * FROM ( ") + m127730l(str2) + " WHERE " + "status" + "=" + 120 + str) + " ORDER BY downloadtime DESC";
            LinkedList linkedList2 = new LinkedList();
            ? r4 = 0;
            try {
                Cursor rawQuery = this.f288587a.rawQuery(str3, r4, 2);
                if (rawQuery.moveToFirst()) {
                    do {
                        linkedList2.add(rawQuery.getString(0));
                    } while (rawQuery.moveToNext());
                }
                rawQuery.close();
                linkedList.addAll(linkedList2);
            } catch (Throwable th) {
                if (r4 != 0) {
                    r4.close();
                }
                throw th;
            }
        }
        return linkedList;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.String[], android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r4v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<hd0.C98408n0> mo137724j(int r9, int r10, long r11) {
        /*
            r8 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.ArrayList<hd0.o0$$d> r1 = hd0.o0$$e.f288592a
            java.util.Iterator r1 = r1.iterator()
        L_0x000b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00ae
            java.lang.Object r2 = r1.next()
            hd0.o0$$d r2 = (hd0.o0$$d) r2
            java.lang.String r2 = r2.f288589a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = m127729k(r2)
            r3.append(r2)
            java.lang.String r2 = " where "
            r3.append(r2)
            java.lang.String r2 = "status"
            r3.append(r2)
            java.lang.String r2 = "="
            r3.append(r2)
            r3.append(r9)
            java.lang.String r2 = " AND "
            r3.append(r2)
            java.lang.String r2 = "preloadsize"
            r3.append(r2)
            java.lang.String r2 = " > 0 AND "
            r3.append(r2)
            java.lang.String r2 = "lastmodifytime"
            r3.append(r2)
            java.lang.String r2 = " <= "
            r3.append(r2)
            r3.append(r11)
            java.lang.String r2 = " ORDER BY "
            r3.append(r2)
            java.lang.String r2 = "createtime"
            r3.append(r2)
            java.lang.String r2 = " LIMIT "
            r3.append(r2)
            r3.append(r10)
            java.lang.String r2 = r3.toString()
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            r4 = 0
            zh3.f r5 = r8.f288587a     // Catch:{ Exception -> 0x0093 }
            r6 = 2
            android.database.Cursor r4 = r5.rawQuery(r2, r4, r6)     // Catch:{ Exception -> 0x0093 }
            boolean r2 = r4.moveToFirst()     // Catch:{ Exception -> 0x0093 }
            if (r2 == 0) goto L_0x00a0
        L_0x007f:
            hd0.n0 r2 = new hd0.n0     // Catch:{ Exception -> 0x0093 }
            r2.<init>()     // Catch:{ Exception -> 0x0093 }
            r2.mo137698a(r4)     // Catch:{ Exception -> 0x0093 }
            r3.add(r2)     // Catch:{ Exception -> 0x0093 }
            boolean r2 = r4.moveToNext()     // Catch:{ Exception -> 0x0093 }
            if (r2 != 0) goto L_0x007f
            goto L_0x00a0
        L_0x0091:
            r9 = move-exception
            goto L_0x00a8
        L_0x0093:
            r2 = move-exception
            java.lang.String r5 = "MicroMsg.VideoInfoStorage"
            java.lang.String r6 = "getNeedDeletePreloadVideo error"
            r7 = 0
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x0091 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r2, r6, r7)     // Catch:{ all -> 0x0091 }
            if (r4 == 0) goto L_0x00a3
        L_0x00a0:
            r4.close()
        L_0x00a3:
            r0.addAll(r3)
            goto L_0x000b
        L_0x00a8:
            if (r4 == 0) goto L_0x00ad
            r4.close()
        L_0x00ad:
            throw r9
        L_0x00ae:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hd0.C98410o0.mo137724j(int, int, long):java.util.List");
    }

    /* renamed from: n */
    public List<C98408n0> mo137725n() {
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = this.f288587a.rawQuery(m127729k("videoinfo2") + " WHERE status=200 order by masssendid desc", (String[]) null, 2);
        int i = 0;
        while (rawQuery.moveToNext()) {
            C98408n0 n0Var = new C98408n0();
            n0Var.mo137698a(rawQuery);
            arrayList.add(n0Var);
            i++;
        }
        rawQuery.close();
        Log.m105918d("MicroMsg.VideoInfoStorage", "getUnfinishMassInfo resCount:" + i);
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.String[], android.database.Cursor] */
    /* renamed from: o */
    public List<String> mo137726o(int i) {
        String str;
        LinkedList linkedList = new LinkedList();
        Iterator<o0$$d> it = o0$$e.f288592a.iterator();
        while (it.hasNext()) {
            String str2 = it.next().f288589a;
            if (i <= 0) {
                str = "";
            } else {
                str = " LIMIT " + i;
            }
            String str3 = m127730l(str2) + " WHERE status=112 ORDER BY downloadtime DESC " + str;
            LinkedList linkedList2 = new LinkedList();
            ? r4 = 0;
            try {
                Cursor rawQuery = this.f288587a.rawQuery(str3, r4, 2);
                if (rawQuery.moveToFirst()) {
                    do {
                        linkedList2.add(rawQuery.getString(0));
                    } while (rawQuery.moveToNext());
                }
                rawQuery.close();
                linkedList.addAll(linkedList2);
            } catch (Throwable th) {
                if (r4 != 0) {
                    r4.close();
                }
                throw th;
            }
        }
        return linkedList;
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [java.lang.String[], android.database.Cursor] */
    /* renamed from: p */
    public List<String> mo137727p(int i) {
        String str;
        LinkedList linkedList = new LinkedList();
        Iterator<o0$$d> it = o0$$e.f288592a.iterator();
        while (it.hasNext()) {
            String str2 = it.next().f288589a;
            if (i <= 0) {
                str = " ) ";
            } else {
                str = " LIMIT " + i + " )";
            }
            String str3 = (((" SELECT * FROM ( " + m127730l(str2) + " WHERE " + "status" + "=" + 103 + str) + " UNION SELECT * FROM ( ") + m127730l(str2) + " WHERE " + "status" + "=" + 104 + str) + " ORDER BY downloadtime DESC";
            LinkedList linkedList2 = new LinkedList();
            ? r4 = 0;
            try {
                Cursor rawQuery = this.f288587a.rawQuery(str3, r4, 2);
                if (rawQuery.moveToFirst()) {
                    do {
                        linkedList2.add(rawQuery.getString(0));
                    } while (rawQuery.moveToNext());
                }
                rawQuery.close();
                linkedList.addAll(linkedList2);
            } catch (Throwable th) {
                if (r4 != 0) {
                    r4.close();
                }
                throw th;
            }
        }
        return linkedList;
    }

    /* renamed from: q */
    public String mo137728q(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C86709a0.m107535s().f251806d + "video/");
        sb.append(str);
        String sb4 = sb.toString();
        if (C86013q1.m106450k(sb4)) {
            return sb4;
        }
        String str2 = sb4 + ".mp4";
        if (C86013q1.m106450k(str2)) {
            return str2;
        }
        for (String str3 : VFSStrategy.m163777e()) {
            String str4 = C86709a0.m107535s().f251805c + str3 + "/" + "video/" + str + ".mp4";
            if (C86013q1.m106450k(str4)) {
                C86013q1.m106463x(str4, str2);
                C116314o.m163919e(2);
                Log.m105928w("MicroMsg.VideoInfoStorage", "success restore file, from " + str4 + " to " + str2);
            }
        }
        return str2;
    }

    /* renamed from: r */
    public String mo137729r(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C86709a0.m107535s().f251806d + "video/");
        sb.append(str);
        sb.append(".jpg");
        String sb4 = sb.toString();
        if (C86013q1.m106450k(sb4)) {
            return sb4;
        }
        for (String str2 : VFSStrategy.m163777e()) {
            String str3 = C86709a0.m107535s().f251805c + str2 + "/" + "video/" + str + ".jpg";
            if (C86013q1.m106450k(str3)) {
                C86013q1.m106463x(str3, sb4);
                C116314o.m163919e(2);
                Log.m105928w("MicroMsg.VideoInfoStorage", "success restore file, from " + str3 + " to " + sb4);
            }
        }
        return sb4;
    }

    /* renamed from: s */
    public boolean mo137730s(C98408n0 n0Var) {
        if (n0Var == null) {
            return false;
        }
        C101614i<String, ArrayList<C98408n0>> iVar = f288586c;
        if (iVar.get(n0Var.f288544L) != null) {
            iVar.remove(n0Var.f288544L);
        }
        n0Var.f288548P = -1;
        if (((int) this.f288587a.mo125627q(o0$$e.m127753a(n0Var.mo137700d()), FFmpegMetadataRetriever.METADATA_KEY_FILENAME, n0Var.mo137699b(), false)) == -1) {
            return false;
        }
        this.f288588b.event(new C101489t.C77595a.C77596a(n0Var.mo137700d(), C101489t.C77595a.C77598b.INSERT, C101489t.C77595a.C77597c.NORMAL, n0Var.f288576w, n0Var.f288577x));
        this.f288588b.doNotify();
        return true;
    }

    /* renamed from: u */
    public void mo137731u(C101489t.C77595a aVar) {
        this.f288588b.remove(aVar);
    }

    /* renamed from: v */
    public boolean mo137732v(String str, String str2, String str3) {
        char c;
        char c2;
        int i;
        long j;
        String str4 = str;
        String str5 = str2 + "##" + str3;
        int i2 = 2;
        Log.m105925i("MicroMsg.VideoInfoStorage", "saveVideoHash path:%s xml:%s stack:%s", str4, str5, Util.getStack());
        long nowMilliSecond = Util.nowMilliSecond();
        if (Util.isNullOrNil(str)) {
            c2 = 0;
            c = 1;
            i = 2;
        } else if (Util.isNullOrNil(str5)) {
            i = 2;
            c2 = 0;
            c = 1;
        } else {
            int[] e = mo137719e(str);
            if (e == null || e.length < 33) {
                Log.m105921e("MicroMsg.VideoInfoStorage", "saveVideoHash  readHash failed :%s", str4);
                return false;
            }
            int i3 = e[32];
            StringBuffer stringBuffer = new StringBuffer();
            for (int i4 = 0; i4 < 32; i4++) {
                stringBuffer.append(Integer.toHexString(e[i4]));
            }
            Cursor rawQuery = this.f288587a.rawQuery("select cdnxml from VideoHash where size = " + i3 + " and hash = \"" + stringBuffer.toString() + FastJsonResponse.QUOTE, (String[]) null, 2);
            Vector vector = new Vector();
            while (rawQuery.moveToNext()) {
                vector.add(rawQuery.getString(0));
                Object[] objArr = new Object[i2];
                objArr[0] = Integer.valueOf(vector.size());
                objArr[1] = vector.get(vector.size() - 1);
                Log.m105927v("MicroMsg.VideoInfoStorage", "saveVideoHash index:%s get:%s", objArr);
                i2 = 2;
            }
            rawQuery.close();
            if (vector.size() != 1 || !str5.equals(vector.get(0))) {
                if (vector.size() >= 1) {
                    j = nowMilliSecond;
                    C115669n.INSTANCE.mo160131h(12696, 102, Integer.valueOf(i3), "", "", Integer.valueOf(vector.size()));
                    Log.m105921e("MicroMsg.VideoInfoStorage", "saveVideoHash Err Check  xml diff OR  select more than one row,  rowCount:%d size:%d ", Integer.valueOf(vector.size()), Integer.valueOf(i3));
                    this.f288587a.execSQL("VideoHash", "delete from VideoHash where size = " + i3 + " and hash = \"" + stringBuffer.toString() + FastJsonResponse.QUOTE);
                } else {
                    j = nowMilliSecond;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("size", Integer.valueOf(i3));
                contentValues.put("CreateTime", Long.valueOf(Util.nowSecond()));
                contentValues.put("hash", stringBuffer.toString());
                contentValues.put("cdnxml", str5);
                contentValues.put("orgpath", str4);
                long q = this.f288587a.mo125627q("VideoHash", "", contentValues, false);
                Log.m105925i("MicroMsg.VideoInfoStorage", "summersafecdn saveVideoHash time:%d insert:%d path:%s hash:%s xml:%s", Long.valueOf(Util.milliSecondsToNow(j)), Long.valueOf(q), str4, stringBuffer, str5);
                if (q < 0) {
                    C115669n.INSTANCE.mo160131h(12696, 103, Integer.valueOf(i3));
                    Log.m105921e("MicroMsg.VideoInfoStorage", "saveVideoHash insert failed :%d  path:%s", Long.valueOf(q), str4);
                }
            } else {
                Log.m105929w("MicroMsg.VideoInfoStorage", "saveVideoHash Check exist now return,time:%d,  path:%s xml:%s", Long.valueOf(Util.milliSecondsToNow(nowMilliSecond)), str4, str5);
            }
            return true;
        }
        Object[] objArr2 = new Object[i];
        objArr2[c2] = str4;
        objArr2[c] = str5;
        Log.m105921e("MicroMsg.VideoInfoStorage", "saveVideoHash failed , path:%s xml:%s", objArr2);
        return false;
    }

    /* renamed from: w */
    public boolean mo137733w(C98408n0 n0Var) {
        Assert.assertTrue(n0Var != null);
        Assert.assertTrue(n0Var.mo137700d().length() > 0);
        C101614i<String, ArrayList<C98408n0>> iVar = f288586c;
        if (iVar.get(n0Var.mo137704h()) != null) {
            iVar.remove(n0Var.mo137704h());
        }
        ContentValues b = n0Var.mo137699b();
        if (b.size() <= 0) {
            Log.m105920e("MicroMsg.VideoInfoStorage", "update failed, no values set");
        } else {
            if (this.f288587a.update(o0$$e.m127753a(n0Var.mo137700d()), b, "filename= ?", new String[]{n0Var.mo137700d()}) > 0) {
                C101489t.C77595a.C77597c cVar = C101489t.C77595a.C77597c.NORMAL;
                if (n0Var.mo137706j() == 112) {
                    cVar = C101489t.C77595a.C77597c.DOWNLOAD;
                } else if (n0Var.mo137706j() == 103 || n0Var.mo137706j() == 104) {
                    cVar = C101489t.C77595a.C77597c.UPLOAD;
                }
                this.f288588b.event(new C101489t.C77595a.C77596a(n0Var.mo137700d(), C101489t.C77595a.C77598b.UPDATE, cVar, n0Var.mo137709m(), n0Var.mo137703g()));
                this.f288588b.doNotify();
                return true;
            }
        }
        return false;
    }
}
