/**
 * Copyright 2014 tgrape Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ph.fingra.statisticsweb.domain;

import java.io.Serializable;
import java.util.List;

public class TopVersionsData extends BaseDomain implements Serializable {
    
    private static final long serialVersionUID = -7709626125699072980L;
    
    private List<VersionsData> sumList;
    private List<VersionsTimeSeriesData> vtsList;
    private String topOsVer = "";
    private String topAppVer = "";
    
    public void setTopAppVer(String str){
        this.topAppVer = "(null)".equals(str)?"Unknown":str;
    }
    public void setTopOsVer(String str){
        this.topOsVer = "(null)".equals(str)?"Unknown":str;
    }
    
    public List<VersionsData> getSumList() {
        return sumList;
    }
    public void setSumList(List<VersionsData> sumList) {
        this.sumList = sumList;
    }
    public List<VersionsTimeSeriesData> getVtsList() {
        return vtsList;
    }
    public void setVtsList(List<VersionsTimeSeriesData> vtsList) {
        this.vtsList = vtsList;
    }
    public String getTopOsVer() {
        return topOsVer;
    }
    public String getTopAppVer() {
        return topAppVer;
    }
}
