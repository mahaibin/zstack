package org.zstack.header.image



doc {
    title "在这里填写API标题"

    desc "在这里填写API描述"

    rest {
        request {
            url "PUT /v1/images/{imageUuid}/actions"

            header (OAuth: 'the-session-uuid')

            clz APIExpungeImageMsg.class

            desc ""
            
			params {

				column {
					name "imageUuid"
					enclosedIn "params"
					desc "镜像UUID"
					inUrl true
					type "String"
					optional false
					since "0.6"
					
				}
				column {
					name "backupStorageUuids"
					enclosedIn "params"
					desc ""
					inUrl false
					type "List"
					optional true
					since "0.6"
					
				}
				column {
					name "systemTags"
					enclosedIn ""
					desc ""
					inUrl false
					type "List"
					optional true
					since "0.6"
					
				}
				column {
					name "userTags"
					enclosedIn ""
					desc ""
					inUrl false
					type "List"
					optional true
					since "0.6"
					
				}
			}
        }

        response {
            clz APIExpungeImageEvent.class
        }
    }
}