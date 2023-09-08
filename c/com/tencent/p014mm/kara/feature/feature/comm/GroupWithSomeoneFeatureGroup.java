package com.tencent.p014mm.kara.feature.feature.comm;

import android.text.TextUtils;
import f30.C86704a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o30.C89112b;
import q30.C101009l;
import q30.C101010m;
import q30.C101011n;
import q30.C101012o;
import q30.C101013p;
import q30.C101014q;
import q30.C101015r;
import q30.C101020s;

/* renamed from: com.tencent.mm.kara.feature.feature.comm.GroupWithSomeoneFeatureGroup */
public class GroupWithSomeoneFeatureGroup extends C89112b {
    @C86704a
    public int count;
    @C86704a
    public int numberOfMuteNotifications;
    @C86704a
    public int numberOfSavedToContacts;
    @C86704a
    public int numberOfSessionsStickyOnTop;
    @C86704a
    public float proportionOfMuteNotifications;
    @C86704a
    public float proportionOfMyContacts;
    @C86704a
    public float proportionOfMyMessages;
    @C86704a
    public float proportionOfSavedToContacts;
    @C86704a
    public float proportionOfSessionsStickyOnTop;
    @C86704a
    public int sumOfMembers;
    @C86704a
    public int sumOfMessages;
    @C86704a
    public int sumOfMyContacts;
    @C86704a
    public int sumOfMyMessages;
    private String userName;

    public GroupWithSomeoneFeatureGroup(String str) {
        this.userName = str;
    }

    public void build() {
        super.build();
        if (!TextUtils.isEmpty(this.userName)) {
            C101015r rVar = C101015r.f295805e;
            ArrayList arrayList = new ArrayList();
            this.count = arrayList.size();
            this.numberOfMuteNotifications = 0;
            this.numberOfSavedToContacts = 0;
            this.numberOfSessionsStickyOnTop = 0;
            this.sumOfMembers = 0;
            this.sumOfMyContacts = 0;
            this.sumOfMessages = 0;
            this.sumOfMyMessages = 0;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (((Boolean) rVar.mo138469a("chatroomIsOpenMuteNotifications" + str, new C101009l(rVar, str))).booleanValue()) {
                    this.numberOfMuteNotifications++;
                }
                if (((Boolean) rVar.mo138469a("chatroomIsSavedToContact" + str, new C101010m(rVar, str))).booleanValue()) {
                    this.numberOfSavedToContacts++;
                }
                if (((Boolean) rVar.mo138469a("chatroomIsTop" + str, new C101011n(rVar, str))).booleanValue()) {
                    this.numberOfSessionsStickyOnTop++;
                }
                List<String> list = (List) rVar.mo138469a("commonGroupAllMembersCnt" + str, new C101012o(rVar, str));
                this.sumOfMembers = this.sumOfMembers + list.size();
                for (String str2 : list) {
                    int i = this.sumOfMyContacts;
                    StringBuilder sb = new StringBuilder();
                    sb.append("isContact");
                    sb.append(str2);
                    this.sumOfMyContacts = i + (((Boolean) rVar.mo138469a(sb.toString(), new C101020s(rVar, str2))).booleanValue() ? 1 : 0);
                }
                this.sumOfMessages = this.sumOfMessages + ((Integer) rVar.mo138469a("commonGroupAllMessagesCnt" + str, new C101013p(rVar, str))).intValue();
                this.sumOfMyMessages = this.sumOfMyMessages + ((Integer) rVar.mo138469a("commonGroupMyMessagesCnt" + str, new C101014q(rVar, str))).intValue();
            }
            int i2 = this.count;
            if (i2 > 0) {
                this.proportionOfMuteNotifications = ((float) this.numberOfMuteNotifications) / ((float) i2);
                this.proportionOfSavedToContacts = ((float) this.numberOfSavedToContacts) / ((float) i2);
                this.proportionOfSessionsStickyOnTop = ((float) this.numberOfSessionsStickyOnTop) / ((float) i2);
            }
            int i3 = this.sumOfMembers;
            if (i3 > 0) {
                this.proportionOfMyContacts = ((float) this.sumOfMyContacts) / ((float) i3);
            }
            int i4 = this.sumOfMessages;
            if (i4 > 0) {
                this.proportionOfMyMessages = ((float) this.sumOfMyMessages) / ((float) i4);
            }
        }
    }

    public String getName() {
        return "commonGroupChats";
    }
}
