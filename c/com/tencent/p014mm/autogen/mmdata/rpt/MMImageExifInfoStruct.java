package com.tencent.p014mm.autogen.mmdata.rpt;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import java.util.Arrays;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MMImageExifInfoStruct */
public final class MMImageExifInfoStruct extends C61103a {

    /* renamed from: A */
    public String f265663A = "";

    /* renamed from: B */
    public String f265664B = "";

    /* renamed from: C */
    public long f265665C = 0;

    /* renamed from: d */
    public String f265666d = "";

    /* renamed from: e */
    public long f265667e = 0;

    /* renamed from: f */
    public long f265668f = 0;

    /* renamed from: g */
    public long f265669g = 0;

    /* renamed from: h */
    public long f265670h = 0;

    /* renamed from: i */
    public long f265671i = 0;

    /* renamed from: j */
    public long f265672j = 0;

    /* renamed from: k */
    public long f265673k = 0;

    /* renamed from: l */
    public String f265674l = "";

    /* renamed from: m */
    public String f265675m = "";

    /* renamed from: n */
    public long f265676n = 0;

    /* renamed from: o */
    public long f265677o = 0;

    /* renamed from: p */
    public String f265678p = "";

    /* renamed from: q */
    public String f265679q = "";

    /* renamed from: r */
    public long f265680r = 0;

    /* renamed from: s */
    public long f265681s = 0;

    /* renamed from: t */
    public long f265682t = 0;

    /* renamed from: u */
    public long f265683u = 0;

    /* renamed from: v */
    public String f265684v = "";

    /* renamed from: w */
    public String f265685w = "";

    /* renamed from: x */
    public String f265686x = "";

    /* renamed from: y */
    public long f265687y = 0;

    /* renamed from: z */
    public String f265688z = "";

    public MMImageExifInfoStruct() {
    }

    /* renamed from: j */
    public int mo1004j() {
        return 16585;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265666d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265667e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265668f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265669g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265670h);
        stringBuffer.append(",");
        stringBuffer.append(this.f265671i);
        stringBuffer.append(",");
        stringBuffer.append(this.f265672j);
        stringBuffer.append(",");
        stringBuffer.append(this.f265673k);
        stringBuffer.append(",");
        stringBuffer.append(this.f265674l);
        stringBuffer.append(",");
        stringBuffer.append(this.f265675m);
        stringBuffer.append(",");
        stringBuffer.append(this.f265676n);
        stringBuffer.append(",");
        stringBuffer.append(this.f265677o);
        stringBuffer.append(",");
        stringBuffer.append(this.f265678p);
        stringBuffer.append(",");
        stringBuffer.append(this.f265679q);
        stringBuffer.append(",");
        stringBuffer.append(this.f265680r);
        stringBuffer.append(",");
        stringBuffer.append(this.f265681s);
        stringBuffer.append(",");
        stringBuffer.append(this.f265682t);
        stringBuffer.append(",");
        stringBuffer.append(this.f265683u);
        stringBuffer.append(",");
        stringBuffer.append(this.f265684v);
        stringBuffer.append(",");
        stringBuffer.append(this.f265685w);
        stringBuffer.append(",");
        stringBuffer.append(this.f265686x);
        stringBuffer.append(",");
        stringBuffer.append(this.f265687y);
        stringBuffer.append(",");
        stringBuffer.append(this.f265688z);
        stringBuffer.append(",");
        stringBuffer.append(this.f265663A);
        stringBuffer.append(",");
        stringBuffer.append(this.f265664B);
        stringBuffer.append(",");
        stringBuffer.append(this.f265665C);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265666d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MediaType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265667e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OriginWidth");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265668f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OriginHeight");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265669g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CompressedWidth");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265670h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CompressedHeight");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265671i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OriginSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265672j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CompressedSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265673k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(ExifInterface.TAG_F_NUMBER);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265674l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(ExifInterface.TAG_EXPOSURE_TIME);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265675m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(ExifInterface.TAG_RW2_ISO);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265676n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(ExifInterface.TAG_FLASH);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265677o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(ExifInterface.TAG_LENS_MODEL);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265678p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CreatTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265679q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsFromWeChat");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265680r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265681s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sceneType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265682t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("fileSource");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265683u);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("make");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265684v);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("software");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265685w);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("fileExt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265686x);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("faceCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265687y);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(ExifInterface.TAG_Y_CB_CR_SUB_SAMPLING);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265688z);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("md5");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265663A);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("publishId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265664B);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("destMeidaType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265665C);
        return stringBuffer.toString();
    }

    public MMImageExifInfoStruct(String str) {
        String[] split;
        if (str != null && (split = str.split(",")) != null) {
            if (split.length < 26) {
                String[] strArr = new String[26];
                Arrays.fill(strArr, 0, 26, "");
                System.arraycopy(split, 0, strArr, 0, split.length);
                split = strArr;
            }
            this.f265666d = mo86045b("ID", split[0], true);
            this.f265667e = mo86051k(split[1]);
            this.f265668f = mo86051k(split[2]);
            this.f265669g = mo86051k(split[3]);
            this.f265670h = mo86051k(split[4]);
            this.f265671i = mo86051k(split[5]);
            this.f265672j = mo86051k(split[6]);
            this.f265673k = mo86051k(split[7]);
            this.f265674l = mo86045b(ExifInterface.TAG_F_NUMBER, split[8], true);
            this.f265675m = mo86045b(ExifInterface.TAG_EXPOSURE_TIME, split[9], true);
            this.f265676n = mo86051k(split[10]);
            this.f265677o = mo86051k(split[11]);
            this.f265678p = mo86045b(ExifInterface.TAG_LENS_MODEL, split[12], true);
            this.f265679q = mo86045b("CreatTime", split[13], true);
            this.f265680r = mo86051k(split[14]);
            this.f265681s = mo86051k(split[15]);
            this.f265682t = mo86051k(split[16]);
            this.f265683u = mo86051k(split[17]);
            this.f265684v = mo86045b("make", split[18], true);
            this.f265685w = mo86045b("software", split[19], true);
            this.f265686x = mo86045b("fileExt", split[20], true);
            this.f265687y = mo86051k(split[21]);
            this.f265688z = mo86045b(ExifInterface.TAG_Y_CB_CR_SUB_SAMPLING, split[22], true);
            this.f265663A = mo86045b("md5", split[23], true);
            this.f265664B = mo86045b("publishId", split[24], true);
            this.f265665C = mo86051k(split[25]);
        }
    }
}
