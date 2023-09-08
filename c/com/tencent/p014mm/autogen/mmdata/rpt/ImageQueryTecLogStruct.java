package com.tencent.p014mm.autogen.mmdata.rpt;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.ImageQueryTecLogStruct */
public final class ImageQueryTecLogStruct extends C61103a {

    /* renamed from: A */
    public String f156282A = "";

    /* renamed from: B */
    public long f156283B = 0;

    /* renamed from: C */
    public long f156284C = 0;

    /* renamed from: D */
    public long f156285D;

    /* renamed from: E */
    public long f156286E;

    /* renamed from: F */
    public long f156287F = 0;

    /* renamed from: G */
    public String f156288G = "";

    /* renamed from: H */
    public String f156289H = "";

    /* renamed from: d */
    public long f156290d = 0;

    /* renamed from: e */
    public long f156291e = 0;

    /* renamed from: f */
    public long f156292f = 0;

    /* renamed from: g */
    public String f156293g = "";

    /* renamed from: h */
    public String f156294h = "";

    /* renamed from: i */
    public long f156295i;

    /* renamed from: j */
    public long f156296j = 0;

    /* renamed from: k */
    public long f156297k;

    /* renamed from: l */
    public long f156298l;

    /* renamed from: m */
    public long f156299m;

    /* renamed from: n */
    public long f156300n;

    /* renamed from: o */
    public long f156301o = 0;

    /* renamed from: p */
    public long f156302p;

    /* renamed from: q */
    public long f156303q;

    /* renamed from: r */
    public long f156304r = 0;

    /* renamed from: s */
    public long f156305s = 0;

    /* renamed from: t */
    public String f156306t = "";

    /* renamed from: u */
    public long f156307u = 0;

    /* renamed from: v */
    public long f156308v = 0;

    /* renamed from: w */
    public String f156309w = "";

    /* renamed from: x */
    public String f156310x = "";

    /* renamed from: y */
    public long f156311y;

    /* renamed from: z */
    public long f156312z = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 25389;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156290d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156291e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156292f);
        stringBuffer.append(",");
        stringBuffer.append(this.f156293g);
        stringBuffer.append(",");
        stringBuffer.append(this.f156294h);
        stringBuffer.append(",");
        stringBuffer.append(this.f156295i);
        stringBuffer.append(",");
        stringBuffer.append(this.f156296j);
        stringBuffer.append(",");
        stringBuffer.append(this.f156297k);
        stringBuffer.append(",");
        stringBuffer.append(this.f156298l);
        stringBuffer.append(",");
        stringBuffer.append(this.f156299m);
        stringBuffer.append(",");
        stringBuffer.append(this.f156300n);
        stringBuffer.append(",");
        stringBuffer.append(this.f156301o);
        stringBuffer.append(",");
        stringBuffer.append(this.f156302p);
        stringBuffer.append(",");
        stringBuffer.append(this.f156303q);
        stringBuffer.append(",");
        stringBuffer.append(this.f156304r);
        stringBuffer.append(",");
        stringBuffer.append(this.f156305s);
        stringBuffer.append(",");
        stringBuffer.append(this.f156306t);
        stringBuffer.append(",");
        stringBuffer.append(this.f156307u);
        stringBuffer.append(",");
        stringBuffer.append(this.f156308v);
        stringBuffer.append(",");
        stringBuffer.append(this.f156309w);
        stringBuffer.append(",");
        stringBuffer.append(this.f156310x);
        stringBuffer.append(",");
        stringBuffer.append(this.f156311y);
        stringBuffer.append(",");
        stringBuffer.append(this.f156312z);
        stringBuffer.append(",");
        stringBuffer.append(this.f156282A);
        stringBuffer.append(",");
        stringBuffer.append(this.f156283B);
        stringBuffer.append(",");
        stringBuffer.append(this.f156284C);
        stringBuffer.append(",");
        stringBuffer.append(this.f156285D);
        stringBuffer.append(",");
        stringBuffer.append(this.f156286E);
        stringBuffer.append(",");
        stringBuffer.append(this.f156287F);
        stringBuffer.append(",");
        stringBuffer.append(this.f156288G);
        stringBuffer.append(",");
        stringBuffer.append(this.f156289H);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156290d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ImageIdentifySwitch");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156291e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StartIdenTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156292f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LatestIdenImage");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156293g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LatestHistoryIdenedImage");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156294h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ImageInitNum");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156295i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NeedToIdentifyType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156296j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ImageToIdenNewNum");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156297k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ImageToIdenOldNum");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156298l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ImageToIdenTotalNum");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156299m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ImageIdenedNum");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156300n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StopIdenTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156301o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AverImageSpendTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156302p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DBLastVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156303q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DBIsNeedToUpdate");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156304r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ImageIsAllReady");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156305s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SearchSessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156306t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SearchFromScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156307u);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SearchResultIsAllShow");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156308v);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SugText");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156309w);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SearchConnectText");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156310x);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SearchImageShowNum");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156311y);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsFirstInitToIndentify");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156312z);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LatestClsHistoryIdenedImage");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156282A);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExptConfig");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156283B);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ModelIsDownload");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156284C);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ImageIdenedPerNum");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156285D);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AverImagePerSpendTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156286E);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(ExifInterface.TAG_MODEL);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156287F);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156288G);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SearchQueryText");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156289H);
        return stringBuffer.toString();
    }
}
