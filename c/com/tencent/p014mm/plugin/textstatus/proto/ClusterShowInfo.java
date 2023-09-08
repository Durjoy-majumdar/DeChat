package com.tencent.p014mm.plugin.textstatus.proto;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import uz2.C52725x;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.textstatus.proto.ClusterShowInfo */
public class ClusterShowInfo extends C47465a {
    public LinkedList<C52725x> iconActions = new LinkedList<>();
    public String iconId;
    public String sourceActivityId;
    public String sourceIcon;
    public String sourceId;
    public String sourceName;
    public String topic;

    public static final ClusterShowInfo create() {
        return new ClusterShowInfo();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ClusterShowInfo)) {
            return false;
        }
        ClusterShowInfo clusterShowInfo = (ClusterShowInfo) aVar;
        return C46238a.m51546a(this.sourceName, clusterShowInfo.sourceName) && C46238a.m51546a(this.sourceIcon, clusterShowInfo.sourceIcon) && C46238a.m51546a(this.iconId, clusterShowInfo.iconId) && C46238a.m51546a(this.topic, clusterShowInfo.topic) && C46238a.m51546a(this.sourceId, clusterShowInfo.sourceId) && C46238a.m51546a(this.sourceActivityId, clusterShowInfo.sourceActivityId) && C46238a.m51546a(this.iconActions, clusterShowInfo.iconActions);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.sourceName;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.sourceIcon;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.iconId;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.topic;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.sourceId;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.sourceActivityId;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            aVar.mo74320g(8, 8, this.iconActions);
            return 0;
        } else if (i == 1) {
            String str7 = this.sourceName;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.sourceIcon;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.iconId;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            String str10 = this.topic;
            if (str10 != null) {
                i2 += C52418a.m58683j(4, str10);
            }
            String str11 = this.sourceId;
            if (str11 != null) {
                i2 += C52418a.m58683j(5, str11);
            }
            String str12 = this.sourceActivityId;
            if (str12 != null) {
                i2 += C52418a.m58683j(6, str12);
            }
            return i2 + C52418a.m58680g(8, 8, this.iconActions);
        } else if (i == 2) {
            this.iconActions.clear();
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
            ClusterShowInfo clusterShowInfo = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    clusterShowInfo.sourceName = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    clusterShowInfo.sourceIcon = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    clusterShowInfo.iconId = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    clusterShowInfo.topic = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    clusterShowInfo.sourceId = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    clusterShowInfo.sourceActivityId = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C52725x xVar = new C52725x();
                        if (bArr != null && bArr.length > 0) {
                            xVar.parseFrom(bArr);
                        }
                        clusterShowInfo.iconActions.add(xVar);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public ClusterShowInfo setIconActions(LinkedList<C52725x> linkedList) {
        this.iconActions = linkedList;
        return this;
    }

    public ClusterShowInfo setIconId(String str) {
        this.iconId = str;
        return this;
    }

    public ClusterShowInfo setSourceActivityId(String str) {
        this.sourceActivityId = str;
        return this;
    }

    public ClusterShowInfo setSourceIcon(String str) {
        this.sourceIcon = str;
        return this;
    }

    public ClusterShowInfo setSourceId(String str) {
        this.sourceId = str;
        return this;
    }

    public ClusterShowInfo setSourceName(String str) {
        this.sourceName = str;
        return this;
    }

    public ClusterShowInfo setTopic(String str) {
        this.topic = str;
        return this;
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.sourceName;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "sourceName", str, false);
            aVar.mo71655d(jSONObject, "sourceIcon", this.sourceIcon, false);
            aVar.mo71655d(jSONObject, "iconId", this.iconId, false);
            aVar.mo71655d(jSONObject, "topic", this.topic, false);
            aVar.mo71655d(jSONObject, "sourceId", this.sourceId, false);
            aVar.mo71655d(jSONObject, "sourceActivityId", this.sourceActivityId, false);
            aVar.mo71655d(jSONObject, "iconActions", this.iconActions, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
