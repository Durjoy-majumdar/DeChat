package com.tencent.p014mm.pluginsdk.model;

import android.os.Bundle;
import cd0.C28530a;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import kj2.C117407d;
import pb1.C100718j1;
import pb1.C100755z;
import xb1.C102614d;

/* renamed from: com.tencent.mm.pluginsdk.model.l0 */
public class C96786l0 implements C28530a {
    /* renamed from: a */
    public void mo56024a(Bundle bundle) {
        Bundle bundle2 = bundle;
        Class cls = C100718j1.class;
        int i = bundle2.getInt("mm_rpt_fav_id", 0);
        int i2 = bundle2.getInt("key_detail_fav_scene", 0);
        int i3 = bundle2.getInt("key_detail_fav_sub_scene", 0);
        int i4 = bundle2.getInt("key_detail_fav_index", 0);
        long j = bundle2.getLong("key_activity_browse_time", -1);
        boolean z = bundle2.getBoolean("mm_scroll_bottom");
        int i5 = bundle2.getInt("mm_send_friend_count", 0);
        int i6 = bundle2.getInt("mm_share_sns_count", 0);
        boolean z2 = bundle2.getBoolean("mm_del_fav", false);
        int i7 = bundle2.getInt("mm_edit_fav_count", 0);
        String string = bundle2.getString("key_detail_fav_query", "");
        String string2 = bundle2.getString("key_detail_fav_sessionid", "");
        String str = string;
        String string3 = bundle2.getString("key_detail_fav_tags", "");
        Log.m105919d("MicroMsg.FavWebRptCallback", "FavWebRptCallback uiBrowseTime[%d] isScrollBottom[%b] sendToFriendCount[%d] shareSnsCount[%d]  isDelFav[%b] clickEditFavTagCount[%d] favId[%s]", Long.valueOf(j), Integer.valueOf(z ? 1 : 0), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(z2 ? 1 : 0), Integer.valueOf(i7), Integer.valueOf(i));
        boolean z3 = z2;
        int i8 = i7;
        C100755z qq = ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142273qq((long) i);
        if (qq == null) {
            Log.m105929w("MicroMsg.FavWebRptCallback", "fav web rpt but favitem info is null favid[%d]", Integer.valueOf(i));
            return;
        }
        long j2 = qq.field_sourceCreateTime;
        if (j2 == 0) {
            j2 = qq.field_updateTime;
        }
        boolean z4 = z3;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(i2);
        stringBuffer.append(",");
        stringBuffer.append(i4);
        stringBuffer.append(",");
        stringBuffer.append(i);
        stringBuffer.append(",");
        stringBuffer.append(qq.field_type);
        stringBuffer.append(",");
        stringBuffer.append("0");
        stringBuffer.append(",");
        stringBuffer.append(qq.field_sourceType);
        stringBuffer.append(",");
        stringBuffer.append(j2 / 1000);
        stringBuffer.append(",");
        stringBuffer.append(j);
        stringBuffer.append(",");
        stringBuffer.append("0");
        stringBuffer.append(",");
        stringBuffer.append("0");
        stringBuffer.append(",");
        stringBuffer.append("0");
        stringBuffer.append(",");
        stringBuffer.append(i5);
        stringBuffer.append(",");
        stringBuffer.append(i6);
        stringBuffer.append(",");
        stringBuffer.append("0");
        stringBuffer.append(",");
        stringBuffer.append(i8);
        stringBuffer.append(",");
        stringBuffer.append(z4 ? 1 : 0);
        stringBuffer.append(",");
        stringBuffer.append(z);
        stringBuffer.append(",");
        stringBuffer.append(i3);
        stringBuffer.append(",");
        stringBuffer.append(string2);
        stringBuffer.append(",");
        int bD = ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142267bD(i) + 1;
        stringBuffer.append(bD);
        stringBuffer.append(",");
        String str2 = str;
        stringBuffer.append(str2);
        stringBuffer.append(",");
        String str3 = string3;
        stringBuffer.append(str3);
        Log.m105918d("MicroMsg.FavWebRptCallback", String.format("lxl, 15098, sid:%s, sourcepos:%s, query:%s, tag:%s", new Object[]{string2, Integer.valueOf(bD), str2, str3}));
        Log.m105927v("MicroMsg.FavWebRptCallback", "FavWebRptCallback rpt id[%d] [%s]", 15098, stringBuffer.toString());
        C117407d.INSTANCE.kvStat(15098, stringBuffer.toString());
    }
}
