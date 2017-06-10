package cn.itcast.oa.view.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.itcast.oa.domain.Role;
import cn.itcast.oa.service.RoleService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@Controller
@Scope("prototype")
public class RoleAction extends ActionSupport {

	@Resource
	private RoleService roleService;

	private Long id;
	private String name;
	private String description;

	/** 列表 */
	public String list() throws Exception {
		List<Role> roleList = roleService.findAll();
		ActionContext.getContext().put("roleList", roleList);
		return "list";
	}

	/** 删除 */
	public String delete() throws Exception {
		roleService.delete(id);
		return "toList";
	}

//	/** 添加页面 */
//	public String addUI() throws Exception {
//		return "addUI";
//	}
//
//	/** 添加 */
//	public String add() throws Exception {
//		// 得到参数，封装成对象
//		Role role = new Role();
//		role.setName(name);
//		role.setDescription(description);
//
//		// 保存到数据库中
//		roleService.save(role);
//
//		return "toList";
//	}
//
//	/** 修改页面 */
//	public String editUI() throws Exception {
//		Role role = roleService.getById(id);
//		this.name = role.getName();
//		this.description = role.getDescription();
//		return "editUI";
//	}
//
//	/** 修改 */
//	public String edit() throws Exception {
//		// 从数据库中取出原对象
//		Role role = roleService.getById(id);
//
//		// 设置要修改的属性
//		role.setName(name);
//		role.setDescription(description);
//
//		// 更新到数据库中
//		roleService.update(role);
//
//		return "toList";
//	}
//
	// -----------------

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
