package com.tencent.p014mm.protocal.protobuf;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C49277ef1;
import te3.C49403fb1;
import te3.C49827ic1;
import te3.C50013jn1;
import te3.C50232l93;
import te3.C51411tl0;
import te3.C52276zk0;
import te3.C52277zk1;
import te3.C64237ap1;
import te3.C64311db1;
import te3.C64365fh0;
import te3.C64417hb1;
import te3.C64446ig1;
import te3.C64465jc1;
import te3.C64472jk0;
import te3.C64473jl0;
import te3.C64633pn1;
import te3.C64640px0;
import te3.C64726td1;
import te3.C64770ve1;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.protocal.protobuf.FinderObjectDesc */
public class FinderObjectDesc extends C47465a {
    public C64365fh0 client_draft_ext_info;
    public String description;
    public long draftObjectId;
    public C49277ef1 event;
    public C64472jk0 extReading;
    public C64770ve1 feedBgmInfo;
    public C64311db1 feed_location;
    public C52276zk0 flow_card_desc;
    public C64473jl0 fromApp;
    public C51411tl0 generalReportInfo;
    public C64726td1 imgFeedBgmInfo;
    public C64640px0 liveDesc;
    public C64311db1 location;
    public C49403fb1 longVideoDesc;
    public LinkedList<FinderMedia> media = new LinkedList<>();
    public FinderMediaExtra mediaExtra;
    public int mediaType;
    public LinkedList<C49827ic1> mentionedMusics = new LinkedList<>();
    public LinkedList<C64465jc1> mentionedUser = new LinkedList<>();
    public C64726td1 musicInfo;
    public C64417hb1 mvInfo;
    public C64446ig1 original_info_desc;
    public C50232l93 originalsound_info;
    public C64311db1 poster_location;
    public LinkedList<C52277zk1> short_title = new LinkedList<>();
    public C50013jn1 tmpl_info;
    public C64633pn1 topic;
    public C64237ap1 video_tmpl_info;

    public static final FinderObjectDesc create() {
        return new FinderObjectDesc();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof FinderObjectDesc)) {
            return false;
        }
        FinderObjectDesc finderObjectDesc = (FinderObjectDesc) aVar;
        return C46238a.m51546a(this.description, finderObjectDesc.description) && C46238a.m51546a(this.media, finderObjectDesc.media) && C46238a.m51546a(Integer.valueOf(this.mediaType), Integer.valueOf(finderObjectDesc.mediaType)) && C46238a.m51546a(this.mediaExtra, finderObjectDesc.mediaExtra) && C46238a.m51546a(this.location, finderObjectDesc.location) && C46238a.m51546a(this.extReading, finderObjectDesc.extReading) && C46238a.m51546a(this.topic, finderObjectDesc.topic) && C46238a.m51546a(this.mentionedUser, finderObjectDesc.mentionedUser) && C46238a.m51546a(this.liveDesc, finderObjectDesc.liveDesc) && C46238a.m51546a(this.feed_location, finderObjectDesc.feed_location) && C46238a.m51546a(this.mentionedMusics, finderObjectDesc.mentionedMusics) && C46238a.m51546a(this.longVideoDesc, finderObjectDesc.longVideoDesc) && C46238a.m51546a(this.imgFeedBgmInfo, finderObjectDesc.imgFeedBgmInfo) && C46238a.m51546a(this.feedBgmInfo, finderObjectDesc.feedBgmInfo) && C46238a.m51546a(this.fromApp, finderObjectDesc.fromApp) && C46238a.m51546a(this.tmpl_info, finderObjectDesc.tmpl_info) && C46238a.m51546a(this.event, finderObjectDesc.event) && C46238a.m51546a(this.mvInfo, finderObjectDesc.mvInfo) && C46238a.m51546a(Long.valueOf(this.draftObjectId), Long.valueOf(finderObjectDesc.draftObjectId)) && C46238a.m51546a(this.client_draft_ext_info, finderObjectDesc.client_draft_ext_info) && C46238a.m51546a(this.musicInfo, finderObjectDesc.musicInfo) && C46238a.m51546a(this.video_tmpl_info, finderObjectDesc.video_tmpl_info) && C46238a.m51546a(this.generalReportInfo, finderObjectDesc.generalReportInfo) && C46238a.m51546a(this.originalsound_info, finderObjectDesc.originalsound_info) && C46238a.m51546a(this.poster_location, finderObjectDesc.poster_location) && C46238a.m51546a(this.short_title, finderObjectDesc.short_title) && C46238a.m51546a(this.flow_card_desc, finderObjectDesc.flow_card_desc) && C46238a.m51546a(this.original_info_desc, finderObjectDesc.original_info_desc);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.description;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 8, this.media);
            aVar.mo74318e(3, this.mediaType);
            FinderMediaExtra finderMediaExtra = this.mediaExtra;
            if (finderMediaExtra != null) {
                aVar.mo74322i(4, finderMediaExtra.computeSize());
                this.mediaExtra.writeFields(aVar);
            }
            C64311db1 db12 = this.location;
            if (db12 != null) {
                aVar.mo74322i(5, db12.computeSize());
                this.location.writeFields(aVar);
            }
            C64472jk0 jk02 = this.extReading;
            if (jk02 != null) {
                aVar.mo74322i(6, jk02.computeSize());
                this.extReading.writeFields(aVar);
            }
            C64633pn1 pn12 = this.topic;
            if (pn12 != null) {
                aVar.mo74322i(7, pn12.computeSize());
                this.topic.writeFields(aVar);
            }
            aVar.mo74320g(8, 8, this.mentionedUser);
            C64640px0 px02 = this.liveDesc;
            if (px02 != null) {
                aVar.mo74322i(9, px02.computeSize());
                this.liveDesc.writeFields(aVar);
            }
            C64311db1 db13 = this.feed_location;
            if (db13 != null) {
                aVar.mo74322i(10, db13.computeSize());
                this.feed_location.writeFields(aVar);
            }
            aVar.mo74320g(11, 8, this.mentionedMusics);
            C49403fb1 fb12 = this.longVideoDesc;
            if (fb12 != null) {
                aVar.mo74322i(12, fb12.computeSize());
                this.longVideoDesc.writeFields(aVar);
            }
            C64726td1 td12 = this.imgFeedBgmInfo;
            if (td12 != null) {
                aVar.mo74322i(13, td12.computeSize());
                this.imgFeedBgmInfo.writeFields(aVar);
            }
            C64770ve1 ve12 = this.feedBgmInfo;
            if (ve12 != null) {
                aVar.mo74322i(14, ve12.computeSize());
                this.feedBgmInfo.writeFields(aVar);
            }
            C64473jl0 jl02 = this.fromApp;
            if (jl02 != null) {
                aVar.mo74322i(15, jl02.computeSize());
                this.fromApp.writeFields(aVar);
            }
            C50013jn1 jn12 = this.tmpl_info;
            if (jn12 != null) {
                aVar.mo74322i(16, jn12.computeSize());
                this.tmpl_info.writeFields(aVar);
            }
            C49277ef1 ef12 = this.event;
            if (ef12 != null) {
                aVar.mo74322i(17, ef12.computeSize());
                this.event.writeFields(aVar);
            }
            C64417hb1 hb12 = this.mvInfo;
            if (hb12 != null) {
                aVar.mo74322i(18, hb12.computeSize());
                this.mvInfo.writeFields(aVar);
            }
            aVar.mo74321h(19, this.draftObjectId);
            C64365fh0 fh02 = this.client_draft_ext_info;
            if (fh02 != null) {
                aVar.mo74322i(20, fh02.computeSize());
                this.client_draft_ext_info.writeFields(aVar);
            }
            C64726td1 td13 = this.musicInfo;
            if (td13 != null) {
                aVar.mo74322i(21, td13.computeSize());
                this.musicInfo.writeFields(aVar);
            }
            C64237ap1 ap12 = this.video_tmpl_info;
            if (ap12 != null) {
                aVar.mo74322i(22, ap12.computeSize());
                this.video_tmpl_info.writeFields(aVar);
            }
            C51411tl0 tl02 = this.generalReportInfo;
            if (tl02 != null) {
                aVar.mo74322i(23, tl02.computeSize());
                this.generalReportInfo.writeFields(aVar);
            }
            C50232l93 l932 = this.originalsound_info;
            if (l932 != null) {
                aVar.mo74322i(24, l932.computeSize());
                this.originalsound_info.writeFields(aVar);
            }
            C64311db1 db14 = this.poster_location;
            if (db14 != null) {
                aVar.mo74322i(25, db14.computeSize());
                this.poster_location.writeFields(aVar);
            }
            aVar.mo74320g(26, 8, this.short_title);
            C52276zk0 zk02 = this.flow_card_desc;
            if (zk02 != null) {
                aVar.mo74322i(27, zk02.computeSize());
                this.flow_card_desc.writeFields(aVar);
            }
            C64446ig1 ig12 = this.original_info_desc;
            if (ig12 != null) {
                aVar.mo74322i(28, ig12.computeSize());
                this.original_info_desc.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            String str2 = this.description;
            if (str2 != null) {
                i3 = C52418a.m58683j(1, str2) + 0;
            }
            int g = i3 + C52418a.m58680g(2, 8, this.media) + C52418a.m58678e(3, this.mediaType);
            FinderMediaExtra finderMediaExtra2 = this.mediaExtra;
            if (finderMediaExtra2 != null) {
                g += C52418a.m58682i(4, finderMediaExtra2.computeSize());
            }
            C64311db1 db15 = this.location;
            if (db15 != null) {
                g += C52418a.m58682i(5, db15.computeSize());
            }
            C64472jk0 jk03 = this.extReading;
            if (jk03 != null) {
                g += C52418a.m58682i(6, jk03.computeSize());
            }
            C64633pn1 pn13 = this.topic;
            if (pn13 != null) {
                g += C52418a.m58682i(7, pn13.computeSize());
            }
            int g2 = g + C52418a.m58680g(8, 8, this.mentionedUser);
            C64640px0 px03 = this.liveDesc;
            if (px03 != null) {
                g2 += C52418a.m58682i(9, px03.computeSize());
            }
            C64311db1 db16 = this.feed_location;
            if (db16 != null) {
                g2 += C52418a.m58682i(10, db16.computeSize());
            }
            int g3 = g2 + C52418a.m58680g(11, 8, this.mentionedMusics);
            C49403fb1 fb13 = this.longVideoDesc;
            if (fb13 != null) {
                g3 += C52418a.m58682i(12, fb13.computeSize());
            }
            C64726td1 td14 = this.imgFeedBgmInfo;
            if (td14 != null) {
                g3 += C52418a.m58682i(13, td14.computeSize());
            }
            C64770ve1 ve13 = this.feedBgmInfo;
            if (ve13 != null) {
                g3 += C52418a.m58682i(14, ve13.computeSize());
            }
            C64473jl0 jl03 = this.fromApp;
            if (jl03 != null) {
                g3 += C52418a.m58682i(15, jl03.computeSize());
            }
            C50013jn1 jn13 = this.tmpl_info;
            if (jn13 != null) {
                g3 += C52418a.m58682i(16, jn13.computeSize());
            }
            C49277ef1 ef13 = this.event;
            if (ef13 != null) {
                g3 += C52418a.m58682i(17, ef13.computeSize());
            }
            C64417hb1 hb13 = this.mvInfo;
            if (hb13 != null) {
                g3 += C52418a.m58682i(18, hb13.computeSize());
            }
            int h = g3 + C52418a.m58681h(19, this.draftObjectId);
            C64365fh0 fh03 = this.client_draft_ext_info;
            if (fh03 != null) {
                h += C52418a.m58682i(20, fh03.computeSize());
            }
            C64726td1 td15 = this.musicInfo;
            if (td15 != null) {
                h += C52418a.m58682i(21, td15.computeSize());
            }
            C64237ap1 ap13 = this.video_tmpl_info;
            if (ap13 != null) {
                h += C52418a.m58682i(22, ap13.computeSize());
            }
            C51411tl0 tl03 = this.generalReportInfo;
            if (tl03 != null) {
                h += C52418a.m58682i(23, tl03.computeSize());
            }
            C50232l93 l933 = this.originalsound_info;
            if (l933 != null) {
                h += C52418a.m58682i(24, l933.computeSize());
            }
            C64311db1 db17 = this.poster_location;
            if (db17 != null) {
                h += C52418a.m58682i(25, db17.computeSize());
            }
            int g4 = h + C52418a.m58680g(26, 8, this.short_title);
            C52276zk0 zk03 = this.flow_card_desc;
            if (zk03 != null) {
                g4 += C52418a.m58682i(27, zk03.computeSize());
            }
            C64446ig1 ig13 = this.original_info_desc;
            return ig13 != null ? g4 + C52418a.m58682i(28, ig13.computeSize()) : g4;
        } else if (i2 == 2) {
            this.media.clear();
            this.mentionedUser.clear();
            this.mentionedMusics.clear();
            this.short_title.clear();
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
            FinderObjectDesc finderObjectDesc = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    finderObjectDesc.description = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        FinderMedia finderMedia = new FinderMedia();
                        if (bArr != null && bArr.length > 0) {
                            finderMedia.parseFrom(bArr);
                        }
                        finderObjectDesc.media.add(finderMedia);
                    }
                    return 0;
                case 3:
                    finderObjectDesc.mediaType = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        FinderMediaExtra finderMediaExtra3 = new FinderMediaExtra();
                        if (bArr2 != null && bArr2.length > 0) {
                            finderMediaExtra3.parseFrom(bArr2);
                        }
                        finderObjectDesc.mediaExtra = finderMediaExtra3;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C64311db1 db18 = new C64311db1();
                        if (bArr3 != null && bArr3.length > 0) {
                            db18.parseFrom(bArr3);
                        }
                        finderObjectDesc.location = db18;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C64472jk0 jk04 = new C64472jk0();
                        if (bArr4 != null && bArr4.length > 0) {
                            jk04.parseFrom(bArr4);
                        }
                        finderObjectDesc.extReading = jk04;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C64633pn1 pn14 = new C64633pn1();
                        if (bArr5 != null && bArr5.length > 0) {
                            pn14.parseFrom(bArr5);
                        }
                        finderObjectDesc.topic = pn14;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C64465jc1 jc12 = new C64465jc1();
                        if (bArr6 != null && bArr6.length > 0) {
                            jc12.parseFrom(bArr6);
                        }
                        finderObjectDesc.mentionedUser.add(jc12);
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C64640px0 px04 = new C64640px0();
                        if (bArr7 != null && bArr7.length > 0) {
                            px04.parseFrom(bArr7);
                        }
                        finderObjectDesc.liveDesc = px04;
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        C64311db1 db19 = new C64311db1();
                        if (bArr8 != null && bArr8.length > 0) {
                            db19.parseFrom(bArr8);
                        }
                        finderObjectDesc.feed_location = db19;
                    }
                    return 0;
                case 11:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i17 = 0; i17 < size9; i17++) {
                        byte[] bArr9 = j9.get(i17);
                        C49827ic1 ic12 = new C49827ic1();
                        if (bArr9 != null && bArr9.length > 0) {
                            ic12.parseFrom(bArr9);
                        }
                        finderObjectDesc.mentionedMusics.add(ic12);
                    }
                    return 0;
                case 12:
                    LinkedList<byte[]> j15 = aVar3.mo141632j(intValue);
                    int size10 = j15.size();
                    for (int i18 = 0; i18 < size10; i18++) {
                        byte[] bArr10 = j15.get(i18);
                        C49403fb1 fb14 = new C49403fb1();
                        if (bArr10 != null && bArr10.length > 0) {
                            fb14.parseFrom(bArr10);
                        }
                        finderObjectDesc.longVideoDesc = fb14;
                    }
                    return 0;
                case 13:
                    LinkedList<byte[]> j16 = aVar3.mo141632j(intValue);
                    int size11 = j16.size();
                    for (int i19 = 0; i19 < size11; i19++) {
                        byte[] bArr11 = j16.get(i19);
                        C64726td1 td16 = new C64726td1();
                        if (bArr11 != null && bArr11.length > 0) {
                            td16.parseFrom(bArr11);
                        }
                        finderObjectDesc.imgFeedBgmInfo = td16;
                    }
                    return 0;
                case 14:
                    LinkedList<byte[]> j17 = aVar3.mo141632j(intValue);
                    int size12 = j17.size();
                    for (int i25 = 0; i25 < size12; i25++) {
                        byte[] bArr12 = j17.get(i25);
                        C64770ve1 ve14 = new C64770ve1();
                        if (bArr12 != null && bArr12.length > 0) {
                            ve14.parseFrom(bArr12);
                        }
                        finderObjectDesc.feedBgmInfo = ve14;
                    }
                    return 0;
                case 15:
                    LinkedList<byte[]> j18 = aVar3.mo141632j(intValue);
                    int size13 = j18.size();
                    for (int i26 = 0; i26 < size13; i26++) {
                        byte[] bArr13 = j18.get(i26);
                        C64473jl0 jl04 = new C64473jl0();
                        if (bArr13 != null && bArr13.length > 0) {
                            jl04.parseFrom(bArr13);
                        }
                        finderObjectDesc.fromApp = jl04;
                    }
                    return 0;
                case 16:
                    LinkedList<byte[]> j19 = aVar3.mo141632j(intValue);
                    int size14 = j19.size();
                    for (int i27 = 0; i27 < size14; i27++) {
                        byte[] bArr14 = j19.get(i27);
                        C50013jn1 jn14 = new C50013jn1();
                        if (bArr14 != null && bArr14.length > 0) {
                            jn14.parseFrom(bArr14);
                        }
                        finderObjectDesc.tmpl_info = jn14;
                    }
                    return 0;
                case 17:
                    LinkedList<byte[]> j25 = aVar3.mo141632j(intValue);
                    int size15 = j25.size();
                    for (int i28 = 0; i28 < size15; i28++) {
                        byte[] bArr15 = j25.get(i28);
                        C49277ef1 ef14 = new C49277ef1();
                        if (bArr15 != null && bArr15.length > 0) {
                            ef14.parseFrom(bArr15);
                        }
                        finderObjectDesc.event = ef14;
                    }
                    return 0;
                case 18:
                    LinkedList<byte[]> j26 = aVar3.mo141632j(intValue);
                    int size16 = j26.size();
                    for (int i29 = 0; i29 < size16; i29++) {
                        byte[] bArr16 = j26.get(i29);
                        C64417hb1 hb14 = new C64417hb1();
                        if (bArr16 != null && bArr16.length > 0) {
                            hb14.parseFrom(bArr16);
                        }
                        finderObjectDesc.mvInfo = hb14;
                    }
                    return 0;
                case 19:
                    finderObjectDesc.draftObjectId = aVar3.mo141631i(intValue);
                    return 0;
                case 20:
                    LinkedList<byte[]> j27 = aVar3.mo141632j(intValue);
                    int size17 = j27.size();
                    for (int i35 = 0; i35 < size17; i35++) {
                        byte[] bArr17 = j27.get(i35);
                        C64365fh0 fh04 = new C64365fh0();
                        if (bArr17 != null && bArr17.length > 0) {
                            fh04.parseFrom(bArr17);
                        }
                        finderObjectDesc.client_draft_ext_info = fh04;
                    }
                    return 0;
                case 21:
                    LinkedList<byte[]> j28 = aVar3.mo141632j(intValue);
                    int size18 = j28.size();
                    for (int i36 = 0; i36 < size18; i36++) {
                        byte[] bArr18 = j28.get(i36);
                        C64726td1 td17 = new C64726td1();
                        if (bArr18 != null && bArr18.length > 0) {
                            td17.parseFrom(bArr18);
                        }
                        finderObjectDesc.musicInfo = td17;
                    }
                    return 0;
                case 22:
                    LinkedList<byte[]> j29 = aVar3.mo141632j(intValue);
                    int size19 = j29.size();
                    for (int i37 = 0; i37 < size19; i37++) {
                        byte[] bArr19 = j29.get(i37);
                        C64237ap1 ap14 = new C64237ap1();
                        if (bArr19 != null && bArr19.length > 0) {
                            ap14.parseFrom(bArr19);
                        }
                        finderObjectDesc.video_tmpl_info = ap14;
                    }
                    return 0;
                case 23:
                    LinkedList<byte[]> j35 = aVar3.mo141632j(intValue);
                    int size20 = j35.size();
                    for (int i38 = 0; i38 < size20; i38++) {
                        byte[] bArr20 = j35.get(i38);
                        C51411tl0 tl04 = new C51411tl0();
                        if (bArr20 != null && bArr20.length > 0) {
                            tl04.parseFrom(bArr20);
                        }
                        finderObjectDesc.generalReportInfo = tl04;
                    }
                    return 0;
                case 24:
                    LinkedList<byte[]> j36 = aVar3.mo141632j(intValue);
                    int size21 = j36.size();
                    for (int i39 = 0; i39 < size21; i39++) {
                        byte[] bArr21 = j36.get(i39);
                        C50232l93 l934 = new C50232l93();
                        if (bArr21 != null && bArr21.length > 0) {
                            l934.parseFrom(bArr21);
                        }
                        finderObjectDesc.originalsound_info = l934;
                    }
                    return 0;
                case 25:
                    LinkedList<byte[]> j37 = aVar3.mo141632j(intValue);
                    int size22 = j37.size();
                    for (int i44 = 0; i44 < size22; i44++) {
                        byte[] bArr22 = j37.get(i44);
                        C64311db1 db110 = new C64311db1();
                        if (bArr22 != null && bArr22.length > 0) {
                            db110.parseFrom(bArr22);
                        }
                        finderObjectDesc.poster_location = db110;
                    }
                    return 0;
                case 26:
                    LinkedList<byte[]> j38 = aVar3.mo141632j(intValue);
                    int size23 = j38.size();
                    for (int i45 = 0; i45 < size23; i45++) {
                        byte[] bArr23 = j38.get(i45);
                        C52277zk1 zk12 = new C52277zk1();
                        if (bArr23 != null && bArr23.length > 0) {
                            zk12.parseFrom(bArr23);
                        }
                        finderObjectDesc.short_title.add(zk12);
                    }
                    return 0;
                case 27:
                    LinkedList<byte[]> j39 = aVar3.mo141632j(intValue);
                    int size24 = j39.size();
                    for (int i46 = 0; i46 < size24; i46++) {
                        byte[] bArr24 = j39.get(i46);
                        C52276zk0 zk04 = new C52276zk0();
                        if (bArr24 != null && bArr24.length > 0) {
                            zk04.parseFrom(bArr24);
                        }
                        finderObjectDesc.flow_card_desc = zk04;
                    }
                    return 0;
                case 28:
                    LinkedList<byte[]> j44 = aVar3.mo141632j(intValue);
                    int size25 = j44.size();
                    for (int i47 = 0; i47 < size25; i47++) {
                        byte[] bArr25 = j44.get(i47);
                        C64446ig1 ig14 = new C64446ig1();
                        if (bArr25 != null && bArr25.length > 0) {
                            ig14.parseFrom(bArr25);
                        }
                        finderObjectDesc.original_info_desc = ig14;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public FinderObjectDesc setClient_draft_ext_info(C64365fh0 fh02) {
        this.client_draft_ext_info = fh02;
        return this;
    }

    public FinderObjectDesc setDescription(String str) {
        this.description = str;
        return this;
    }

    public FinderObjectDesc setDraftObjectId(long j) {
        this.draftObjectId = j;
        return this;
    }

    public FinderObjectDesc setEvent(C49277ef1 ef12) {
        this.event = ef12;
        return this;
    }

    public FinderObjectDesc setExtReading(C64472jk0 jk02) {
        this.extReading = jk02;
        return this;
    }

    public FinderObjectDesc setFeedBgmInfo(C64770ve1 ve12) {
        this.feedBgmInfo = ve12;
        return this;
    }

    public FinderObjectDesc setFeed_location(C64311db1 db12) {
        this.feed_location = db12;
        return this;
    }

    public FinderObjectDesc setFlow_card_desc(C52276zk0 zk02) {
        this.flow_card_desc = zk02;
        return this;
    }

    public FinderObjectDesc setFromApp(C64473jl0 jl02) {
        this.fromApp = jl02;
        return this;
    }

    public FinderObjectDesc setGeneralReportInfo(C51411tl0 tl02) {
        this.generalReportInfo = tl02;
        return this;
    }

    public FinderObjectDesc setImgFeedBgmInfo(C64726td1 td12) {
        this.imgFeedBgmInfo = td12;
        return this;
    }

    public FinderObjectDesc setLiveDesc(C64640px0 px02) {
        this.liveDesc = px02;
        return this;
    }

    public FinderObjectDesc setLocation(C64311db1 db12) {
        this.location = db12;
        return this;
    }

    public FinderObjectDesc setLongVideoDesc(C49403fb1 fb12) {
        this.longVideoDesc = fb12;
        return this;
    }

    public FinderObjectDesc setMedia(LinkedList<FinderMedia> linkedList) {
        this.media = linkedList;
        return this;
    }

    public FinderObjectDesc setMediaExtra(FinderMediaExtra finderMediaExtra) {
        this.mediaExtra = finderMediaExtra;
        return this;
    }

    public FinderObjectDesc setMediaType(int i) {
        this.mediaType = i;
        return this;
    }

    public FinderObjectDesc setMentionedMusics(LinkedList<C49827ic1> linkedList) {
        this.mentionedMusics = linkedList;
        return this;
    }

    public FinderObjectDesc setMentionedUser(LinkedList<C64465jc1> linkedList) {
        this.mentionedUser = linkedList;
        return this;
    }

    public FinderObjectDesc setMusicInfo(C64726td1 td12) {
        this.musicInfo = td12;
        return this;
    }

    public FinderObjectDesc setMvInfo(C64417hb1 hb12) {
        this.mvInfo = hb12;
        return this;
    }

    public FinderObjectDesc setOriginal_info_desc(C64446ig1 ig12) {
        this.original_info_desc = ig12;
        return this;
    }

    public FinderObjectDesc setOriginalsound_info(C50232l93 l932) {
        this.originalsound_info = l932;
        return this;
    }

    public FinderObjectDesc setPoster_location(C64311db1 db12) {
        this.poster_location = db12;
        return this;
    }

    public FinderObjectDesc setShort_title(LinkedList<C52277zk1> linkedList) {
        this.short_title = linkedList;
        return this;
    }

    public FinderObjectDesc setTmpl_info(C50013jn1 jn12) {
        this.tmpl_info = jn12;
        return this;
    }

    public FinderObjectDesc setTopic(C64633pn1 pn12) {
        this.topic = pn12;
        return this;
    }

    public FinderObjectDesc setVideo_tmpl_info(C64237ap1 ap12) {
        this.video_tmpl_info = ap12;
        return this;
    }
}
