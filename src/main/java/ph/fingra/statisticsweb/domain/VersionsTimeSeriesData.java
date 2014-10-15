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

public class VersionsTimeSeriesData implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 2349611128639503196L;
	private String year;
	private String month;
	private String week;
	private String date;
	private String fromDate;
	private String toDate;

	private int top0;
	private int top1;
	private int top2;
	private int top3;
	private int top4;
	private int others;
}
