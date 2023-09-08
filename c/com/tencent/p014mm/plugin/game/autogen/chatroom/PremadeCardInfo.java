package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.PremadeCardInfo */
public class PremadeCardInfo extends C47465a {
    public String premade_info;
    public TeamIcon team_icon_info;

    public static final PremadeCardInfo create() {
        return new PremadeCardInfo();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof PremadeCardInfo)) {
            return false;
        }
        PremadeCardInfo premadeCardInfo = (PremadeCardInfo) aVar;
        return C46238a.m51546a(this.premade_info, premadeCardInfo.premade_info) && C46238a.m51546a(this.team_icon_info, premadeCardInfo.team_icon_info);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.premade_info;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            TeamIcon teamIcon = this.team_icon_info;
            if (teamIcon != null) {
                aVar.mo74322i(2, teamIcon.computeSize());
                this.team_icon_info.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.premade_info;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            TeamIcon teamIcon2 = this.team_icon_info;
            return teamIcon2 != null ? i2 + C52418a.m58682i(2, teamIcon2.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            PremadeCardInfo premadeCardInfo = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                premadeCardInfo.premade_info = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    TeamIcon teamIcon3 = new TeamIcon();
                    if (bArr != null && bArr.length > 0) {
                        teamIcon3.parseFrom(bArr);
                    }
                    premadeCardInfo.team_icon_info = teamIcon3;
                }
                return 0;
            }
        }
    }

    public PremadeCardInfo setPremade_info(String str) {
        this.premade_info = str;
        return this;
    }

    public PremadeCardInfo setTeam_icon_info(TeamIcon teamIcon) {
        this.team_icon_info = teamIcon;
        return this;
    }
}
