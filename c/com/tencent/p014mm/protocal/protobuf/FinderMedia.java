package com.tencent.p014mm.protocal.protobuf;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C48654a21;
import te3.C49936j31;
import te3.C50435mq0;
import te3.C64450iq0;
import te3.C64475jq0;
import te3.C64771vf1;
import te3.C64825xb1;
import te3.C64850yb1;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.protocal.protobuf.FinderMedia */
public class FinderMedia extends C47465a {
    public int bitrate;
    public int card_show_style;
    public C64825xb1 codec_info;
    public String coverUrl;
    public String cover_url_token;
    public String decodeKey;
    public int dynamic_range_type;
    public int fileSize;
    public int full_bitrate;
    public String full_cover_url;
    public String full_cover_url_token;
    public int full_file_size;
    public float full_height;
    public String full_md5sum;
    public String full_thumb_url;
    public String full_thumb_url_token;
    public String full_url;
    public String full_url_token;
    public float full_width;
    public C64450iq0 half_rect;
    public C64475jq0 hdr_spec;
    public float height;
    public C50435mq0 hls_spec;
    public int hot_flag;
    public LinkedList<C48654a21> live_cover_imgs = new LinkedList<>();
    public C49936j31 live_spec;
    public String md5sum;
    public int mediaType;
    public C64771vf1 scaling_info;
    public LinkedList<C64850yb1> spec = new LinkedList<>();
    public String thumbUrl;
    public String thumb_url_token;
    public String url;
    public String url_token;
    public int videoDuration;
    public int video_type;
    public float width;

    public static final FinderMedia create() {
        return new FinderMedia();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof FinderMedia)) {
            return false;
        }
        FinderMedia finderMedia = (FinderMedia) aVar;
        return C46238a.m51546a(this.url, finderMedia.url) && C46238a.m51546a(this.thumbUrl, finderMedia.thumbUrl) && C46238a.m51546a(Integer.valueOf(this.mediaType), Integer.valueOf(finderMedia.mediaType)) && C46238a.m51546a(Integer.valueOf(this.videoDuration), Integer.valueOf(finderMedia.videoDuration)) && C46238a.m51546a(Float.valueOf(this.width), Float.valueOf(finderMedia.width)) && C46238a.m51546a(Float.valueOf(this.height), Float.valueOf(finderMedia.height)) && C46238a.m51546a(this.md5sum, finderMedia.md5sum) && C46238a.m51546a(Integer.valueOf(this.fileSize), Integer.valueOf(finderMedia.fileSize)) && C46238a.m51546a(Integer.valueOf(this.bitrate), Integer.valueOf(finderMedia.bitrate)) && C46238a.m51546a(this.spec, finderMedia.spec) && C46238a.m51546a(this.coverUrl, finderMedia.coverUrl) && C46238a.m51546a(this.decodeKey, finderMedia.decodeKey) && C46238a.m51546a(this.url_token, finderMedia.url_token) && C46238a.m51546a(this.thumb_url_token, finderMedia.thumb_url_token) && C46238a.m51546a(this.cover_url_token, finderMedia.cover_url_token) && C46238a.m51546a(this.codec_info, finderMedia.codec_info) && C46238a.m51546a(this.live_spec, finderMedia.live_spec) && C46238a.m51546a(this.hls_spec, finderMedia.hls_spec) && C46238a.m51546a(Integer.valueOf(this.hot_flag), Integer.valueOf(finderMedia.hot_flag)) && C46238a.m51546a(this.half_rect, finderMedia.half_rect) && C46238a.m51546a(this.full_thumb_url, finderMedia.full_thumb_url) && C46238a.m51546a(this.full_thumb_url_token, finderMedia.full_thumb_url_token) && C46238a.m51546a(this.full_url, finderMedia.full_url) && C46238a.m51546a(Float.valueOf(this.full_width), Float.valueOf(finderMedia.full_width)) && C46238a.m51546a(Float.valueOf(this.full_height), Float.valueOf(finderMedia.full_height)) && C46238a.m51546a(this.full_md5sum, finderMedia.full_md5sum) && C46238a.m51546a(Integer.valueOf(this.full_file_size), Integer.valueOf(finderMedia.full_file_size)) && C46238a.m51546a(Integer.valueOf(this.full_bitrate), Integer.valueOf(finderMedia.full_bitrate)) && C46238a.m51546a(this.full_url_token, finderMedia.full_url_token) && C46238a.m51546a(this.full_cover_url, finderMedia.full_cover_url) && C46238a.m51546a(this.full_cover_url_token, finderMedia.full_cover_url_token) && C46238a.m51546a(this.hdr_spec, finderMedia.hdr_spec) && C46238a.m51546a(this.live_cover_imgs, finderMedia.live_cover_imgs) && C46238a.m51546a(this.scaling_info, finderMedia.scaling_info) && C46238a.m51546a(Integer.valueOf(this.card_show_style), Integer.valueOf(finderMedia.card_show_style)) && C46238a.m51546a(Integer.valueOf(this.dynamic_range_type), Integer.valueOf(finderMedia.dynamic_range_type)) && C46238a.m51546a(Integer.valueOf(this.video_type), Integer.valueOf(finderMedia.video_type));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.url;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.thumbUrl;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.mediaType);
            aVar.mo74318e(4, this.videoDuration);
            aVar.mo74317d(5, this.width);
            aVar.mo74317d(6, this.height);
            String str3 = this.md5sum;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            aVar.mo74318e(8, this.fileSize);
            aVar.mo74318e(9, this.bitrate);
            aVar.mo74320g(10, 8, this.spec);
            String str4 = this.coverUrl;
            if (str4 != null) {
                aVar.mo74323j(11, str4);
            }
            String str5 = this.decodeKey;
            if (str5 != null) {
                aVar.mo74323j(12, str5);
            }
            String str6 = this.url_token;
            if (str6 != null) {
                aVar.mo74323j(13, str6);
            }
            String str7 = this.thumb_url_token;
            if (str7 != null) {
                aVar.mo74323j(14, str7);
            }
            String str8 = this.cover_url_token;
            if (str8 != null) {
                aVar.mo74323j(15, str8);
            }
            C64825xb1 xb12 = this.codec_info;
            if (xb12 != null) {
                aVar.mo74322i(16, xb12.computeSize());
                this.codec_info.writeFields(aVar);
            }
            C49936j31 j312 = this.live_spec;
            if (j312 != null) {
                aVar.mo74322i(17, j312.computeSize());
                this.live_spec.writeFields(aVar);
            }
            C50435mq0 mq02 = this.hls_spec;
            if (mq02 != null) {
                aVar.mo74322i(18, mq02.computeSize());
                this.hls_spec.writeFields(aVar);
            }
            aVar.mo74318e(19, this.hot_flag);
            C64450iq0 iq02 = this.half_rect;
            if (iq02 != null) {
                aVar.mo74322i(20, iq02.computeSize());
                this.half_rect.writeFields(aVar);
            }
            String str9 = this.full_thumb_url;
            if (str9 != null) {
                aVar.mo74323j(21, str9);
            }
            String str10 = this.full_thumb_url_token;
            if (str10 != null) {
                aVar.mo74323j(22, str10);
            }
            String str11 = this.full_url;
            if (str11 != null) {
                aVar.mo74323j(23, str11);
            }
            aVar.mo74317d(24, this.full_width);
            aVar.mo74317d(25, this.full_height);
            String str12 = this.full_md5sum;
            if (str12 != null) {
                aVar.mo74323j(26, str12);
            }
            aVar.mo74318e(27, this.full_file_size);
            aVar.mo74318e(28, this.full_bitrate);
            String str13 = this.full_url_token;
            if (str13 != null) {
                aVar.mo74323j(29, str13);
            }
            String str14 = this.full_cover_url;
            if (str14 != null) {
                aVar.mo74323j(30, str14);
            }
            String str15 = this.full_cover_url_token;
            if (str15 != null) {
                aVar.mo74323j(31, str15);
            }
            C64475jq0 jq02 = this.hdr_spec;
            if (jq02 != null) {
                aVar.mo74322i(32, jq02.computeSize());
                this.hdr_spec.writeFields(aVar);
            }
            aVar.mo74320g(33, 8, this.live_cover_imgs);
            C64771vf1 vf12 = this.scaling_info;
            if (vf12 != null) {
                aVar.mo74322i(34, vf12.computeSize());
                this.scaling_info.writeFields(aVar);
            }
            aVar.mo74318e(35, this.card_show_style);
            aVar.mo74318e(36, this.dynamic_range_type);
            aVar.mo74318e(37, this.video_type);
            return 0;
        } else if (i2 == 1) {
            String str16 = this.url;
            if (str16 != null) {
                i3 = C52418a.m58683j(1, str16) + 0;
            }
            String str17 = this.thumbUrl;
            if (str17 != null) {
                i3 += C52418a.m58683j(2, str17);
            }
            int e = i3 + C52418a.m58678e(3, this.mediaType) + C52418a.m58678e(4, this.videoDuration) + C52418a.m58677d(5, this.width) + C52418a.m58677d(6, this.height);
            String str18 = this.md5sum;
            if (str18 != null) {
                e += C52418a.m58683j(7, str18);
            }
            int e2 = e + C52418a.m58678e(8, this.fileSize) + C52418a.m58678e(9, this.bitrate) + C52418a.m58680g(10, 8, this.spec);
            String str19 = this.coverUrl;
            if (str19 != null) {
                e2 += C52418a.m58683j(11, str19);
            }
            String str20 = this.decodeKey;
            if (str20 != null) {
                e2 += C52418a.m58683j(12, str20);
            }
            String str21 = this.url_token;
            if (str21 != null) {
                e2 += C52418a.m58683j(13, str21);
            }
            String str22 = this.thumb_url_token;
            if (str22 != null) {
                e2 += C52418a.m58683j(14, str22);
            }
            String str23 = this.cover_url_token;
            if (str23 != null) {
                e2 += C52418a.m58683j(15, str23);
            }
            C64825xb1 xb13 = this.codec_info;
            if (xb13 != null) {
                e2 += C52418a.m58682i(16, xb13.computeSize());
            }
            C49936j31 j313 = this.live_spec;
            if (j313 != null) {
                e2 += C52418a.m58682i(17, j313.computeSize());
            }
            C50435mq0 mq03 = this.hls_spec;
            if (mq03 != null) {
                e2 += C52418a.m58682i(18, mq03.computeSize());
            }
            int e3 = e2 + C52418a.m58678e(19, this.hot_flag);
            C64450iq0 iq03 = this.half_rect;
            if (iq03 != null) {
                e3 += C52418a.m58682i(20, iq03.computeSize());
            }
            String str24 = this.full_thumb_url;
            if (str24 != null) {
                e3 += C52418a.m58683j(21, str24);
            }
            String str25 = this.full_thumb_url_token;
            if (str25 != null) {
                e3 += C52418a.m58683j(22, str25);
            }
            String str26 = this.full_url;
            if (str26 != null) {
                e3 += C52418a.m58683j(23, str26);
            }
            int d = e3 + C52418a.m58677d(24, this.full_width) + C52418a.m58677d(25, this.full_height);
            String str27 = this.full_md5sum;
            if (str27 != null) {
                d += C52418a.m58683j(26, str27);
            }
            int e4 = d + C52418a.m58678e(27, this.full_file_size) + C52418a.m58678e(28, this.full_bitrate);
            String str28 = this.full_url_token;
            if (str28 != null) {
                e4 += C52418a.m58683j(29, str28);
            }
            String str29 = this.full_cover_url;
            if (str29 != null) {
                e4 += C52418a.m58683j(30, str29);
            }
            String str30 = this.full_cover_url_token;
            if (str30 != null) {
                e4 += C52418a.m58683j(31, str30);
            }
            C64475jq0 jq03 = this.hdr_spec;
            if (jq03 != null) {
                e4 += C52418a.m58682i(32, jq03.computeSize());
            }
            int g = e4 + C52418a.m58680g(33, 8, this.live_cover_imgs);
            C64771vf1 vf13 = this.scaling_info;
            if (vf13 != null) {
                g += C52418a.m58682i(34, vf13.computeSize());
            }
            return g + C52418a.m58678e(35, this.card_show_style) + C52418a.m58678e(36, this.dynamic_range_type) + C52418a.m58678e(37, this.video_type);
        } else if (i2 == 2) {
            this.spec.clear();
            this.live_cover_imgs.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            FinderMedia finderMedia = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    finderMedia.url = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    finderMedia.thumbUrl = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    finderMedia.mediaType = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    finderMedia.videoDuration = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    finderMedia.width = aVar3.mo141628f(intValue);
                    return 0;
                case 6:
                    finderMedia.height = aVar3.mo141628f(intValue);
                    return 0;
                case 7:
                    finderMedia.md5sum = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    finderMedia.fileSize = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    finderMedia.bitrate = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C64850yb1 yb12 = new C64850yb1();
                        if (bArr != null && bArr.length > 0) {
                            yb12.parseFrom(bArr);
                        }
                        finderMedia.spec.add(yb12);
                    }
                    return 0;
                case 11:
                    finderMedia.coverUrl = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    finderMedia.decodeKey = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    finderMedia.url_token = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    finderMedia.thumb_url_token = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    finderMedia.cover_url_token = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C64825xb1 xb14 = new C64825xb1();
                        if (bArr2 != null && bArr2.length > 0) {
                            xb14.parseFrom(bArr2);
                        }
                        finderMedia.codec_info = xb14;
                    }
                    return 0;
                case 17:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C49936j31 j314 = new C49936j31();
                        if (bArr3 != null && bArr3.length > 0) {
                            j314.parseFrom(bArr3);
                        }
                        finderMedia.live_spec = j314;
                    }
                    return 0;
                case 18:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C50435mq0 mq04 = new C50435mq0();
                        if (bArr4 != null && bArr4.length > 0) {
                            mq04.parseFrom(bArr4);
                        }
                        finderMedia.hls_spec = mq04;
                    }
                    return 0;
                case 19:
                    finderMedia.hot_flag = aVar3.mo141629g(intValue);
                    return 0;
                case 20:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C64450iq0 iq04 = new C64450iq0();
                        if (bArr5 != null && bArr5.length > 0) {
                            iq04.parseFrom(bArr5);
                        }
                        finderMedia.half_rect = iq04;
                    }
                    return 0;
                case 21:
                    finderMedia.full_thumb_url = aVar3.mo141633k(intValue);
                    return 0;
                case 22:
                    finderMedia.full_thumb_url_token = aVar3.mo141633k(intValue);
                    return 0;
                case 23:
                    finderMedia.full_url = aVar3.mo141633k(intValue);
                    return 0;
                case 24:
                    finderMedia.full_width = aVar3.mo141628f(intValue);
                    return 0;
                case 25:
                    finderMedia.full_height = aVar3.mo141628f(intValue);
                    return 0;
                case 26:
                    finderMedia.full_md5sum = aVar3.mo141633k(intValue);
                    return 0;
                case 27:
                    finderMedia.full_file_size = aVar3.mo141629g(intValue);
                    return 0;
                case 28:
                    finderMedia.full_bitrate = aVar3.mo141629g(intValue);
                    return 0;
                case 29:
                    finderMedia.full_url_token = aVar3.mo141633k(intValue);
                    return 0;
                case 30:
                    finderMedia.full_cover_url = aVar3.mo141633k(intValue);
                    return 0;
                case 31:
                    finderMedia.full_cover_url_token = aVar3.mo141633k(intValue);
                    return 0;
                case 32:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C64475jq0 jq04 = new C64475jq0();
                        if (bArr6 != null && bArr6.length > 0) {
                            jq04.parseFrom(bArr6);
                        }
                        finderMedia.hdr_spec = jq04;
                    }
                    return 0;
                case 33:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C48654a21 a212 = new C48654a21();
                        if (bArr7 != null && bArr7.length > 0) {
                            a212.parseFrom(bArr7);
                        }
                        finderMedia.live_cover_imgs.add(a212);
                    }
                    return 0;
                case 34:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        C64771vf1 vf14 = new C64771vf1();
                        if (bArr8 != null && bArr8.length > 0) {
                            vf14.parseFrom(bArr8);
                        }
                        finderMedia.scaling_info = vf14;
                    }
                    return 0;
                case 35:
                    finderMedia.card_show_style = aVar3.mo141629g(intValue);
                    return 0;
                case 36:
                    finderMedia.dynamic_range_type = aVar3.mo141629g(intValue);
                    return 0;
                case 37:
                    finderMedia.video_type = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public FinderMedia setBitrate(int i) {
        this.bitrate = i;
        return this;
    }

    public FinderMedia setCard_show_style(int i) {
        this.card_show_style = i;
        return this;
    }

    public FinderMedia setCodec_info(C64825xb1 xb12) {
        this.codec_info = xb12;
        return this;
    }

    public FinderMedia setCoverUrl(String str) {
        this.coverUrl = str;
        return this;
    }

    public FinderMedia setCover_url_token(String str) {
        this.cover_url_token = str;
        return this;
    }

    public FinderMedia setDecodeKey(String str) {
        this.decodeKey = str;
        return this;
    }

    public FinderMedia setDynamic_range_type(int i) {
        this.dynamic_range_type = i;
        return this;
    }

    public FinderMedia setFileSize(int i) {
        this.fileSize = i;
        return this;
    }

    public FinderMedia setFull_bitrate(int i) {
        this.full_bitrate = i;
        return this;
    }

    public FinderMedia setFull_cover_url(String str) {
        this.full_cover_url = str;
        return this;
    }

    public FinderMedia setFull_cover_url_token(String str) {
        this.full_cover_url_token = str;
        return this;
    }

    public FinderMedia setFull_file_size(int i) {
        this.full_file_size = i;
        return this;
    }

    public FinderMedia setFull_height(float f) {
        this.full_height = f;
        return this;
    }

    public FinderMedia setFull_md5sum(String str) {
        this.full_md5sum = str;
        return this;
    }

    public FinderMedia setFull_thumb_url(String str) {
        this.full_thumb_url = str;
        return this;
    }

    public FinderMedia setFull_thumb_url_token(String str) {
        this.full_thumb_url_token = str;
        return this;
    }

    public FinderMedia setFull_url(String str) {
        this.full_url = str;
        return this;
    }

    public FinderMedia setFull_url_token(String str) {
        this.full_url_token = str;
        return this;
    }

    public FinderMedia setFull_width(float f) {
        this.full_width = f;
        return this;
    }

    public FinderMedia setHalf_rect(C64450iq0 iq02) {
        this.half_rect = iq02;
        return this;
    }

    public FinderMedia setHdr_spec(C64475jq0 jq02) {
        this.hdr_spec = jq02;
        return this;
    }

    public FinderMedia setHeight(float f) {
        this.height = f;
        return this;
    }

    public FinderMedia setHls_spec(C50435mq0 mq02) {
        this.hls_spec = mq02;
        return this;
    }

    public FinderMedia setHot_flag(int i) {
        this.hot_flag = i;
        return this;
    }

    public FinderMedia setLive_cover_imgs(LinkedList<C48654a21> linkedList) {
        this.live_cover_imgs = linkedList;
        return this;
    }

    public FinderMedia setLive_spec(C49936j31 j312) {
        this.live_spec = j312;
        return this;
    }

    public FinderMedia setMd5sum(String str) {
        this.md5sum = str;
        return this;
    }

    public FinderMedia setMediaType(int i) {
        this.mediaType = i;
        return this;
    }

    public FinderMedia setScaling_info(C64771vf1 vf12) {
        this.scaling_info = vf12;
        return this;
    }

    public FinderMedia setSpec(LinkedList<C64850yb1> linkedList) {
        this.spec = linkedList;
        return this;
    }

    public FinderMedia setThumbUrl(String str) {
        this.thumbUrl = str;
        return this;
    }

    public FinderMedia setThumb_url_token(String str) {
        this.thumb_url_token = str;
        return this;
    }

    public FinderMedia setUrl(String str) {
        this.url = str;
        return this;
    }

    public FinderMedia setUrl_token(String str) {
        this.url_token = str;
        return this;
    }

    public FinderMedia setVideoDuration(int i) {
        this.videoDuration = i;
        return this;
    }

    public FinderMedia setVideo_type(int i) {
        this.video_type = i;
        return this;
    }

    public FinderMedia setWidth(float f) {
        this.width = f;
        return this;
    }
}
