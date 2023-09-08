package com.tencent.p014mm.plugin.report.service;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C31543z5;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import te3.ro4;

/* renamed from: com.tencent.mm.plugin.report.service.u */
public final class C5145u implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f20534d;

    /* renamed from: e */
    public final /* synthetic */ int f20535e;

    public C5145u(int i, int i2) {
        this.f20534d = i;
        this.f20535e = i2;
    }

    public final void run() {
        String str;
        String str2;
        long e = (long) C31543z5.m39455e();
        C5139t tVar = C5139t.f20522a;
        int i = this.f20534d;
        int i2 = this.f20535e;
        List<String> list = C5139t.f20527f;
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append('_');
        sb.append(i2);
        ro4 ro4 = null;
        if (list.contains(sb.toString()) || C5139t.m5181a(tVar, this.f20534d, this.f20535e)) {
            LinkedList<ro4> linkedList = tVar.mo6107d().f132225d;
            C87412m.m108593f(linkedList, "dataList.user_data_list");
            int i3 = this.f20534d;
            int i4 = this.f20535e;
            for (ro4 ro42 : linkedList) {
                if (ro42.f141065e == i3 && ro42.f141064d == i4) {
                    ro4 = ro42;
                }
            }
        }
        if (ro4 == null) {
            ro4 = new ro4();
            int i5 = this.f20534d;
            int i6 = this.f20535e;
            ro4.f141065e = i5;
            ro4.f141064d = i6;
            ro4.f141066f = e;
            ro4.f141067g = 0;
            C5139t.f20522a.mo6107d().f132225d.add(ro4);
        }
        C5139t tVar2 = C5139t.f20522a;
        if (C5139t.m5181a(tVar2, this.f20534d, this.f20535e)) {
            ro4.f141067g = 0;
        }
        ro4.f141067g++;
        StringBuilder sb4 = new StringBuilder();
        sb4.append("op, businessType:");
        switch (this.f20534d) {
            case 1:
                str = "注册";
                break;
            case 2:
                str = "登录";
                break;
            case 3:
                str = "聊天";
                break;
            case 4:
                str = "个人信息";
                break;
            case 5:
                str = "视频号";
                break;
            case 6:
                str = "微信游戏";
                break;
            case 7:
                str = "看一看";
                break;
            case 8:
                str = "小程序";
                break;
            case 9:
                str = "状态";
                break;
            case 10:
                str = "微信运动";
                break;
            case 11:
                str = "公众号";
                break;
            case 12:
                str = "朋友圈";
                break;
            case 13:
                str = "通讯录";
                break;
            case 14:
                str = "卡包";
                break;
            case 15:
                str = "微信豆";
                break;
            case 17:
                str = "附近的人";
                break;
            case 18:
                str = "雷达";
                break;
            case 19:
                str = "摇一摇";
                break;
            case 20:
                str = "扫一扫";
                break;
            case 21:
                str = "搜一搜";
                break;
            case 22:
                str = "其它";
                break;
            case 24:
                str = "设置";
                break;
            default:
                str = "Unknown";
                break;
        }
        sb4.append(str);
        sb4.append('(');
        sb4.append(this.f20534d);
        sb4.append("), dataType:");
        switch (this.f20535e) {
            case 1:
                str2 = "微信昵称";
                break;
            case 2:
                str2 = "微信头像";
                break;
            case 3:
                str2 = "微信绑定手机号";
                break;
            case 4:
                str2 = "微信个人资料性别";
                break;
            case 5:
                str2 = "微信个人资料地区";
                break;
            case 6:
                str2 = "微信个性签名";
                break;
            case 7:
                str2 = "微信个人资料地址";
                break;
            case 8:
                str2 = "设备名称";
                break;
            case 9:
                str2 = "设备类型";
                break;
            case 10:
                str2 = "位置信息";
                break;
            case 11:
                str2 = "图片信息";
                break;
            case 12:
                str2 = "微信运动步数";
                break;
            case 13:
                str2 = "视频号名字";
                break;
            case 14:
                str2 = "视频号头像";
                break;
            case 15:
                str2 = "视频号性别";
                break;
            case 16:
                str2 = "视频号地区";
                break;
            case 17:
                str2 = "视频号简介";
                break;
            case 18:
                str2 = "视频号封面";
                break;
            case 19:
                str2 = "视频号认证信息";
                break;
            case 20:
                str2 = "视频号黑名单";
                break;
            case 21:
                str2 = "视频号绑定的公众号（H5）";
                break;
            case 22:
                str2 = "视频号绑定的企业微信（H5）";
                break;
            case 23:
                str2 = "微信游戏头像";
                break;
            case 24:
                str2 = "微信游戏昵称";
                break;
            case 25:
                str2 = "微信游戏生活照";
                break;
            case 26:
                str2 = "微信游戏签名";
                break;
            case 27:
                str2 = "微信游戏性别";
                break;
            case 28:
                str2 = "微信游戏生日";
                break;
            case 29:
                str2 = "微信游戏地区";
                break;
            case 30:
                str2 = "微信游戏领取福利姓名";
                break;
            case 31:
                str2 = "微信游戏领取福利手机号";
                break;
            case 32:
                str2 = "微信游戏领取福利地址";
                break;
            case 33:
                str2 = "推荐通讯录朋友(手机联系人)";
                break;
            default:
                str2 = "unknown";
                break;
        }
        sb4.append(str2);
        sb4.append('(');
        sb4.append(this.f20535e);
        sb4.append("), count:");
        sb4.append(ro4.f141067g);
        sb4.append(", stack：");
        sb4.append(Util.getStack());
        Log.m105924i("MicroMsg.UserDataOperationReporter", sb4.toString());
        tVar2.mo6108f();
    }
}
