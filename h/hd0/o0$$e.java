package hd0;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.Iterator;
import p823sg.C101614i;

public final class o0$$e {

    /* renamed from: a */
    public static final ArrayList<o0$$d> f288592a = new ArrayList<>(3);

    static {
        C101614i<String, ArrayList<C98408n0>> iVar = C98410o0.f288586c;
        StringBuilder sb = new StringBuilder();
        sb.append("alter table ");
        sb.append("videoinfo2");
        sb.append(" add ");
        String str = "media_id";
        sb.append(str);
        sb.append(" text ;");
        StringBuilder sb4 = new StringBuilder();
        sb4.append("CREATE INDEX IF NOT EXISTS  massSendIdIndex ON ");
        sb4.append("videoinfo2");
        sb4.append(" ( ");
        sb4.append("masssendid");
        String str2 = " )";
        sb4.append(str2);
        m127754b("", "videoinfo2", new String[]{"CREATE TABLE IF NOT EXISTS " + "videoinfo2" + " ( " + FFmpegMetadataRetriever.METADATA_KEY_FILENAME + " text  PRIMARY KEY , " + "clientid" + " text  , " + "msgsvrid" + " int  , " + "netoffset" + " int  , " + "filenowsize" + " int  , " + "totallen" + " int  , " + "thumbnetoffset" + " int  , " + "thumblen" + " int  , " + "status" + " int  , " + "createtime" + " long  , " + "lastmodifytime" + " long  , " + "downloadtime" + " long  , " + "videolength" + " int  , " + "msglocalid" + " int  , " + "nettimes" + " int  , " + "cameratype" + " int  , " + "user" + " text  , " + "human" + " text  , " + "reserved1" + " int  , " + "reserved2" + " int  , " + "reserved3" + " text  , " + "reserved4" + " text  , " + "videofuncflag" + " int ," + "masssendid" + " long ," + "masssendlist" + " text," + "videomd5" + " text, " + "streamvideo" + " byte[], " + "statextstr" + " text, " + "downloadscene" + " int, " + "mmsightextinfo" + " byte[], " + "preloadsize" + " int, " + "videoformat" + " int, " + "forward_msg_local_id" + " int," + "msg_uuid" + " text," + "share_app_info" + " text, " + "origin_file_name" + " text, " + "had_clicked_video" + " int, " + "media_id" + " text, " + "media_flag" + " text, " + "video_path" + " text) ", "CREATE INDEX IF NOT EXISTS  video_status_index ON " + "videoinfo2" + " ( " + "status" + "," + "downloadtime" + " )", "CREATE TABLE IF NOT EXISTS videoinfo ( filename text  PRIMARY KEY , clientid text  , msgsvrid int  , netoffset int  , filenowsize int  , totallen int  , thumbnetoffset int  , thumblen int  , status int  , createtime long  , lastmodifytime long  , downloadtime long  , videolength int  , msglocalid int  , nettimes int  , cameratype int  , user text  , human text  , reserved1 int  , reserved2 int  , reserved3 text  , reserved4 text  , videofuncflag int ,masssendid long ,masssendlist text,videomd5 text, streamvideo byte[], statextstr text, downloadscene int, mmsightextinfo byte[], preloadsize int, videoformat int, forward_msg_local_id int, msg_uuid text, share_app_info text, origin_file_name text, had_clicked_video int)", "alter table " + "videoinfo2" + " add " + "videofuncflag" + " int ;", "alter table " + "videoinfo2" + " add " + "masssendid" + " long default 0;", "alter table " + "videoinfo2" + " add " + "masssendlist" + " text ;", "alter table " + "videoinfo2" + " add " + "videomd5" + " text ;", "alter table " + "videoinfo2" + " add " + "streamvideo" + " byte[] ;", "alter table " + "videoinfo2" + " add " + "statextstr" + " text ;", "alter table " + "videoinfo2" + " add " + "downloadscene" + " int ;", "alter table " + "videoinfo2" + " add " + "mmsightextinfo" + " byte[] ;", "alter table " + "videoinfo2" + " add " + "preloadsize" + " int ;", "alter table " + "videoinfo2" + " add " + "videoformat" + " int ;", "alter table " + "videoinfo2" + " add " + "forward_msg_local_id" + " int ;", "alter table " + "videoinfo2" + " add " + "msg_uuid" + " text ;", "alter table " + "videoinfo2" + " add " + "share_app_info" + " text ;", "alter table " + "videoinfo2" + " add " + "origin_file_name" + " text ;", "alter table " + "videoinfo2" + " add " + "had_clicked_video" + " int ;", sb.toString(), "alter table " + "videoinfo2" + " add " + "media_flag" + " text ;", "alter table " + "videoinfo2" + " add " + "video_path" + " text ;", "alter table videoinfo add videofuncflag int ;", "alter table videoinfo add masssendid long default 0;", "alter table videoinfo add masssendlist text ;", "alter table videoinfo add videomd5 text ;", "alter table videoinfo add streamvideo byte[] ;", "alter table videoinfo add statextstr text ;", "alter table videoinfo add downloadscene int ;", "alter table videoinfo add mmsightextinfo byte[] ;", "alter table videoinfo add preloadsize int ;", "alter table videoinfo add videoformat int ;", "alter table videoinfo add forward_msg_local_id int ;", "alter table videoinfo add msg_uuid text ;", "alter table videoinfo add share_app_info text ;", "alter table videoinfo add origin_file_name text ;", "alter table videoinfo add had_clicked_video int ;", "alter table videoinfo add media_id text ;", "alter table videoinfo add media_flag text ;", "alter table videoinfo add video_path text ;", "CREATE INDEX IF NOT EXISTS  videoinfo_MediaIdIndex ON videoinfo ( media_id  )", "CREATE INDEX IF NOT EXISTS  " + "videoinfo2" + "_MediaIdIndex ON " + "videoinfo2" + " ( " + str + "  )", "insert into " + "videoinfo2" + " select * from " + "videoinfo" + " ;", "delete from videoinfo ;", sb4.toString(), "CREATE INDEX IF NOT EXISTS  LastModifyTimeIndex ON " + "videoinfo2" + " ( " + "lastmodifytime" + str2, "CREATE TABLE IF NOT EXISTS  VideoHash  (size int , CreateTime long, hash text ,  cdnxml text, orgpath text);", "CREATE INDEX IF NOT EXISTS  VideoHashSizeIndex ON VideoHash ( size  )", "CREATE INDEX IF NOT EXISTS  VideoHashTimeIndex ON VideoHash ( CreateTime  )"});
        m127754b("findermsg", "findervideoinfo", C98410o0.m127728a("findervideoinfo"));
        m127754b("statussquaremsg", "textstatusvideoinfo", C98410o0.m127728a("textstatusvideoinfo"));
        m127754b("gamelifesess", "gamelifevideoinfo", C98410o0.m127728a("gamelifevideoinfo"));
    }

    /* renamed from: a */
    public static String m127753a(String str) {
        if (str == null) {
            Log.m105921e("MicroMsg.VideoInfoStorage", "[getTable] fileName is null. %s", Util.getStack());
            return "videoinfo2";
        }
        Iterator<o0$$d> it = f288592a.iterator();
        while (it.hasNext()) {
            o0$$d next = it.next();
            if (!next.f288590b.isEmpty() && str.toLowerCase().endsWith(next.f288590b)) {
                return next.f288589a;
            }
        }
        return "videoinfo2";
    }

    /* renamed from: b */
    public static void m127754b(String str, String str2, String[] strArr) {
        f288592a.add(new o0$$d(str.toLowerCase(), str2, strArr));
    }
}
